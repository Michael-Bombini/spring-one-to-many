package michael.authorbook.Book;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {


    private BookService bookService;

    @PostMapping("/")
    public Book saveBook(@RequestBody Book book, @RequestParam String email) {
        return bookService.saveBook(book, email);
    }


}
