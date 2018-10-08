package ru.skoltech.smartchairservice.model;

import lombok.Data;

/**
 * @author rost.
 */
@Data
public class DataContainer {
    private AccelerometerData accelerometer;
    private GyroscopeData gyroscope;
    private MagnetometerData magnetometer;
    private PressureData pressure;
}
