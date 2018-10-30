package ru.skoltech.smartchairservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author rost.
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AccelerometerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private float aX;
    private float aY;
    private float aZ;
    private float linX;
    private float linY;
    private float linZ;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    private String label;
    private String metaInfo;
    private String peopleId;
    private String typeSensor;
}
