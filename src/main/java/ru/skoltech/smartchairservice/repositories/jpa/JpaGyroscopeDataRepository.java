package ru.skoltech.smartchairservice.repositories.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import ru.skoltech.smartchairservice.model.GyroscopeData;

/**
 * @author rost.
 */
@RepositoryRestResource(collectionResourceRel = "gyroscope", path = "gyroscope")
@Profile({"!mongodb", "!redis"})
public interface JpaGyroscopeDataRepository extends JpaRepository<GyroscopeData, Long> {
}
