package ru.skoltech.smartchairservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.skoltech.smartchairservice.config.SpringApplicationContextInitializer;

/**
 * @author rost.
 */
@SpringBootApplication
public class ApplicationRun {
    public static void main(String ... args){
        new SpringApplicationBuilder(ApplicationRun.class)
                .initializers(new SpringApplicationContextInitializer())
                .application()
                .run(args);
    }
}
