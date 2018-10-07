package ru.skoltech.smartchairservice.repositories.mongodb;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.skoltech.smartchairservice.model.MagnetometerData;

/**
 * @author rost.
 */

@RepositoryRestResource(collectionResourceRel = "magnetometer", path = "magnetometer")
@Profile("mongodb")
public interface MongoMagnetometerDataRepository extends MongoRepository<MagnetometerData, Long> {
}
