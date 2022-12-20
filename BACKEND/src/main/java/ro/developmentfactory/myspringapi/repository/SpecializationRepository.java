package ro.developmentfactory.myspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.developmentfactory.myspringapi.entity.Specialization;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
}
