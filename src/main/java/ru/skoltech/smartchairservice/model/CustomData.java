package ru.skoltech.smartchairservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author rost.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomData {
    @NotNull
    private float[]axM,
                    ayM,
                    azM,
                    axAcc,
                    ayAcc,
                    azAcc;
    @NotNull
    private long dateCreated;
    @NotNull
    private String label;
    @NotNull
    private String metaInfo;
    @NotNull
    private String peopleId;
    @NotNull
    private String typeSensor;

}
