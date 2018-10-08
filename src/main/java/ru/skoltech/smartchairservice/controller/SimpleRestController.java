package ru.skoltech.smartchairservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.skoltech.smartchairservice.model.*;

import java.util.List;
import java.util.Map;

/**
 * @author rost.
 */
@RestController
@RequestMapping("/api")
public class SimpleRestController {

    private CrudRepository<GyroscopeData, Long>gyroScopeStorage;
    private CrudRepository<AccelerometerData, Long>accelerometerStorage;
    private CrudRepository<MagnetometerData, Long>magnetometerStorage;
    private CrudRepository<PressureData, Long>pressureStorage;

    @Autowired
    public SimpleRestController(CrudRepository<GyroscopeData, Long> gyroScopeStorage, CrudRepository<AccelerometerData, Long> accelerometerStorage, CrudRepository<MagnetometerData, Long> magnetometerStorage, CrudRepository<PressureData, Long> pressureStorage) {
        this.gyroScopeStorage = gyroScopeStorage;
        this.accelerometerStorage = accelerometerStorage;
        this.magnetometerStorage = magnetometerStorage;
        this.pressureStorage = pressureStorage;
    }
    /**
     * Example Request:
     * curl  -H "Content-Type: application/json" -X POST -d '[{"linX":0.0,"linY":0.0,"linZ":0.0,"dateCreated":983394000000,"label":"Some label","metaInfo":"Some meta information","peopleId":"Who is it?","typeSensor":"Type of Sensor","ax":0.0,"ay":1.0,"az":1.0}]' http://localhost:8080/api/accelerometer
     * */
    @RequestMapping(value = "/accelerometer", method = RequestMethod.POST)
    public String addAccelerometr(@RequestBody List<AccelerometerData> accelerometers){
        accelerometerStorage.saveAll(accelerometers);
        return "Well Done";
    }

    /**
     *Example Request:
     * curl -H "Content-Type: application/json" -X POST -d '[{"x" : 0.0,"y" : 0.0,"z" : 0.0,"dateCreated" : "2007-01-01","label" : "Some Label","metaInfo" : "meta information","peopleId" : "Who is it?","typeSensor" : "type of sensor"}]' http://localhost:8080/api/gyroscope
     * Get Request:
     * http://localhost:8080/gyroscope
     * */
    @RequestMapping(value = "/gyroscope", method = RequestMethod.POST)
    public String addGyroscope(@RequestBody List<GyroscopeData>gyroscopes){
        gyroScopeStorage.saveAll(gyroscopes);
        return "Well Done";
    }

    /**
     *Example Request:
     * curl -H "Content-Type: application/json" -X POST -d '[{"x" : 0.0,"y" : 0.0,"z" : 0.0,"dateCreated" : "2007-01-01","label" : "Some Label","metaInfo" : "Some meta info","peopleId" : "Who is it?","typeSensor" : "type of sensor"}]' http://localhost:8080/api/magnetometer
     * Get Request:
     * http://localhost:8080/magnetometer
     * */
    @RequestMapping(value = "/magnetometer", method = RequestMethod.POST)
    public String addMagnetometer(@RequestBody List<MagnetometerData>magnetometers){
        magnetometerStorage.saveAll(magnetometers);
        return "Well Done";
    }
    /**
     *Example Request:
     * curl  -H "Content-Type: application/json"  -d '[{"value" : 0.0,"dateCreated" : "2007-01-01","label" : "Some label","metaInfo" : "Meta info","peopleId" : "Name","typeSensor" : "type"}]' http://localhost:8080/api/pressure
     * Get Request:
     * http://localhost:8080/pressure
     * */
    @RequestMapping(value = "pressure", method = RequestMethod.POST)
    public String addPressure(@RequestBody List<PressureData>pressures){
        pressureStorage.saveAll(pressures);
        return "Well Done";
    }

    @RequestMapping(value = "collect_all", method = RequestMethod.POST)
    public String addAll(@RequestBody List<DataContainer>datas){
        datas.forEach(data->{
            pressureStorage.save(data.getPressure());
            accelerometerStorage.save(data.getAccelerometer());
            gyroScopeStorage.save(data.getGyroscope());
            magnetometerStorage.save(data.getMagnetometer());
        });
        return "Well Done";
    }


    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public List<List<Map<Object, Object>>>getCanvasData(){
        return CanvasResponse.generateSimpleValues();
    }

    /**
     * Get All Info from value. Syntax:
     * <pre>
     * [
     *   {
     *     "x": "1",
     *     "y": "1"
     *   },
     *   {
     *     "x": "2",
     *     "y": "2"
     *   }
     * ]
     * </pre>
     * */



}
