package OnlineLibraryIndividualProject.IndividualProject.controller;

import OnlineLibraryIndividualProject.IndividualProject.entity.Book;
import OnlineLibraryIndividualProject.IndividualProject.entity.Student;
import OnlineLibraryIndividualProject.IndividualProject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/book")
@CrossOrigin(origins = "*")
public class BookController {
    private final BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping("/addBook")
    public String addStudent(@RequestBody Book book){
        bookRepository.save(book);
        return "the book was saved!!!";
    }

    @PutMapping( "/updateAmount/{id}")
    public void updateAmount(@PathVariable Long id){
        bookRepository.findById(id).map(book->{
            book.setAmount(book.getAmount()-1);
            return bookRepository.save(book);
        });
    }
}
