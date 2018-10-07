package ru.skoltech.smartchairservice.repositories.mongodb;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.skoltech.smartchairservice.model.AccelerometerData;

/**
 * @author rost.
 */

@RepositoryRestResource(collectionResourceRel = "accelerometer", path = "accelerometer")
@Profile("mongodb")
public interface MongoAccelerometerDataRepository extends MongoRepository<AccelerometerData, Long> {
}
