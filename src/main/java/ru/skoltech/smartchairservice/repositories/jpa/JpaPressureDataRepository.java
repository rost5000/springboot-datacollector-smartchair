package ru.skoltech.smartchairservice.repositories.jpa;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.skoltech.smartchairservice.model.PressureData;

/**
 * @author rost.
 */
@RepositoryRestResource(collectionResourceRel = "pressure", path = "pressure")
@Profile({"!mongodb", "!redis"})
public interface JpaPressureDataRepository extends JpaRepository<PressureData, Long> {
}
