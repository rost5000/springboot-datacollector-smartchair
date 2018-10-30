package ru.skoltech.smartchairservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author rost.
 */
@Data
@Entity
public class GyroscopeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float x;
    private float y;
    private float z;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    private String label;
    private String metaInfo;
    private String peopleId;
    private String typeSensor;
}
