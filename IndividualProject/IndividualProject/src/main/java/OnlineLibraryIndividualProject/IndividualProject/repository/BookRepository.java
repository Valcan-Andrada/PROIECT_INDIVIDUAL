package OnlineLibraryIndividualProject.IndividualProject.repository;

import OnlineLibraryIndividualProject.IndividualProject.entity.Book;
import OnlineLibraryIndividualProject.IndividualProject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
