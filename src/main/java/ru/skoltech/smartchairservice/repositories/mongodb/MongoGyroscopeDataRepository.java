package ru.skoltech.smartchairservice.repositories.mongodb;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.skoltech.smartchairservice.model.GyroscopeData;

/**
 * @author rost.
 */

@RepositoryRestResource(collectionResourceRel = "gyroscope", path = "gyroscope")
@Profile("mongodb")
public interface MongoGyroscopeDataRepository extends MongoRepository<GyroscopeData, Long> {
}
