package ru.skoltech.smartchairservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.skoltech.smartchairservice.model.CanvasResponse;

/**
 * @author rost.
 */
@Controller
public class MainController {
    @RequestMapping("/")
    private String showInfo(){
        return "index";
    }

    @RequestMapping("/plot/test")
    private String getSimplePlot(Model model){
        return "test_plot";
    }

    @RequestMapping("/plot/{plot}")
    public String getMagnetometer(Model model,
                                  @RequestParam(value = "peopleId", required = false, defaultValue = "")String peopleId,
                                  @PathVariable("plot")String plot
    ){
        model.addAttribute("peopleId", peopleId);
        model.addAttribute("requestType", plot);
        return "show_plot";
    }
}
