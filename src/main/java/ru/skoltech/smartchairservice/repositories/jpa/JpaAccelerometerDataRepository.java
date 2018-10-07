package ru.skoltech.smartchairservice.repositories.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import ru.skoltech.smartchairservice.model.AccelerometerData;

/**
 * @author rost.
 */
@RepositoryRestResource(collectionResourceRel = "accelerometer", path = "accelerometer")
@Profile({"!mongodb", "!redis"})
public interface JpaAccelerometerDataRepository extends JpaRepository<AccelerometerData, Long> {
}
