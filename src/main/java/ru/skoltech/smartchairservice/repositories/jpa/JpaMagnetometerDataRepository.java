package ru.skoltech.smartchairservice.repositories.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.skoltech.smartchairservice.model.MagnetometerData;

/**
 * @author rost.
 */
@RepositoryRestResource(collectionResourceRel = "magnetometer", path = "magnetometer")
@Profile({"!mongodb", "!redis"})
public interface JpaMagnetometerDataRepository extends JpaRepository<MagnetometerData, Long> {
}
