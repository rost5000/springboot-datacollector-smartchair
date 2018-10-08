Intro
-----
This is a Spring boot application. The main goal is collecting data.

This application powered by:

* Spring boot 2.0.5.RELEASE
* [Spring Cloud](http://projects.spring.io/spring-cloud/)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/current/reference/html/production-ready-endpoints.html)

This application is comparable with:

* Cloud
    * Cloud Foundry
    * Hiroku
    * Amazon
* Spring Services
* Data Bases
    * MySQL
    * PostgreSQL
    * MongoDB


This Application collect an information from sensors(Accelerometer, gyroscope, magnetometer, pressure sensor)

#### Accelerometer

Data | Description | type
--- | --- | ---
ax | |float
ay | | float
az | | float
linX | | float
linY | | float
linZ | | float
label | Need to mark data | String
metaInfo | Provide Additional information | String
peopleId | Mark people | String
typeSensor | What kind of sensor IoT use | String
dateCreated | label for time. Use Unsigned long format of data | unsigned long

#### Gyroscope

Data | Description | type
--- | --- | ---
x | | float
y | | float
z | | float
label | Need to mark data | String
metaInfo | Provide Additional information | String
peopleId | Mark people | String
typeSensor | What kind of sensor IoT use | String
dateCreated | label for time. Use Unsigned long format of data | unsigned long

#### Magnetometer

Data | Description | type
--- | --- | ---
x | | float
y | | float
z | | float
label | Need to mark data | String
metaInfo | Provide Additional information | String
peopleId | Mark people | String
typeSensor | What kind of sensor IoT use | String
dateCreated | label for time. Use Unsigned long format of data | unsigned long

#### Pressure Sensor

Data | Description | type
--- | --- | ---
value | | float
label | Need to mark data | String
metaInfo | Provide Additional information | String
peopleId | Mark people | String
typeSensor | What kind of sensor IoT use | String
dateCreated | label for time. Use Unsigned long format of data | unsigned long


Package
-------
This section may be useful if you want to run server locally.

Use Maven and Java 8 Assemble:
```
mvn package
```
Run Application:
```
java -jar target/service-monitoring-0.0.1-SNAPSHOT.jar
```


Deploy Application
------------------
Coming soon.

Example Request:
----------------
In this section, you can see an example of http request.

This application uses [Spring Boot Data Rest](https://docs.spring.io/spring-data/rest/docs/current/reference/html/)
 so you can use the framework to access/delete/modify information in database. Use the following link:
 GET/POST/DELETE/PUT: <current_link>/{accelerometer, gyroscope, magnetometer, pressure}. See all endpoints in the link bellow.

 However, if you want to save an array of data, use the next features. All example with <current_link>=http://localhost:8080

##### Accelerometer:
Collect array of data:
```
curl  -H "Content-Type: application/json" -X POST -d '[{"linX":0.0,"linY":0.0,"linZ":0.0,"dateCreated":983394000000,"label":"Some label","metaInfo":"Some meta information","peopleId":"Who is it?","typeSensor":"Type of Sensor","ax":0.0,"ay":1.0,"az":1.0}]' http://localhost:8080/api/accelerometer
```
Get Request:
http://localhost:8080/accelerometer
##### Gyroscope:

```
curl -H "Content-Type: application/json" -X POST -d '[{"x" : 0.0,"y" : 0.0,"z" : 0.0,"dateCreated" : "2007-01-01","label" : "Some Label","metaInfo" : "meta information","peopleId" : "Who is it?","typeSensor" : "type of sensor"}]' http://localhost:8080/api/gyroscope
```
Get Request:
http://localhost:8080/gyroscope

#### Magnetometer:
```
 curl -H "Content-Type: application/json" -X POST -d '[{"x" : 0.0,"y" : 0.0,"z" : 0.0,"dateCreated" : "2007-01-01","label" : "Some Label","metaInfo" : "Some meta info","peopleId" : "Who is it?","typeSensor" : "type of sensor"}]' http://localhost:8080/api/magnetometer
```
Get Request:
http://localhost:8080/magnetometer

#### Pressure Sensor

```
curl  -H "Content-Type: application/json"  -d '[{"value" : 0.0,"dateCreated" : "2007-01-01","label" : "Some label","metaInfo" : "Meta info","peopleId" : "Name","typeSensor" : "type"}]' http://localhost:8080/api/pressure
```
Get Request:
http://localhost:8080/pressure

#### Additional API

If you want to add an array of information of both types of sensor. Use an example:

```
curl  -H "Content-Type: application/json"  -d '[{ "pressure" : {"value" : 0.0,"dateCreated" : "2007-01-01","label" : "Some label","metaInfo" : "Meta info","peopleId" : "Name","typeSensor" : "type"}, "magnetometer" : {"x" : 0.0,"y" : 0.0,"z" : 0.0,"dateCreated" : "2007-01-01","label" : "Some Label","metaInfo" : "Some meta info","peopleId" : "Who is it?","typeSensor" : "type of sensor"}, "gyroscope" : {"x" : 0.0,"y" : 0.0,"z" : 0.0,"dateCreated" : "2007-01-01","label" : "Some Label","metaInfo" : "meta information","peopleId" : "Who is it?","typeSensor" : "type of sensor"}, "accelerometer" : {"linX":0.0,"linY":0.0,"linZ":0.0,"dateCreated":983394000000,"label":"Some label","metaInfo":"Some meta information","peopleId":"Who is it?","typeSensor":"Type of Sensor","ax":0.0,"ay":1.0,"az":1.0}}]' http://localhost:8080/api/collect_all
```

Links
-----
The application  is living in Amazon Cloud: http://smart-chair-iot-dev.us-east-1.elasticbeanstalk.com/

Feauters
--------
* This application is't safe. The Spring Security is comming soon. (I have troubles with Amazon and REST requests)
* Add Redis database