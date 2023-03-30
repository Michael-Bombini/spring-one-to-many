package michael.authorbook.Book;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {


    private BookService bookService;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }


    @PostMapping("/")
    public Book saveBook(@RequestBody Book book, @RequestParam String email) {
        return bookService.saveBook(book, email);
    }




}
