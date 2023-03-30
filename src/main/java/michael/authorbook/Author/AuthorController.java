package michael.authorbook.Author;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
@AllArgsConstructor
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
        Author author = authorService.getAuthorById(id);
        return ResponseEntity.ok(author);
    }


    @PostMapping("/")
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }


    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id){
        authorService.deleteAuthor(id);
    }


}
