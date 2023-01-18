package OnlineLibraryIndividualProject.IndividualProject.repository;

import OnlineLibraryIndividualProject.IndividualProject.entity.Reservation;
import OnlineLibraryIndividualProject.IndividualProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRevository extends JpaRepository<Reservation, Long> {

    public Reservation findByStudentAndBook(Long student, Long book);
}
