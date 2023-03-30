package michael.authorbook.Author;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
@AllArgsConstructor
public class AuthorController {

    @Autowired
    private AuthorService authorService;

//    @GetMapping("/{id}")
//    public ResponseEntity<Author> getAuthorById(@PathVariable Long id)  {
//        Author author = authorService.findById(id)
//                .orElseThrow(() -> new IllegalStateException("Not found Author with id = " + id));
//        return new ResponseEntity<>(author, HttpStatus.OK);
//    }

    @PostMapping("/")
    public Author saveAuthor(@RequestBody Author author) {
        return authorService.saveAuthor(author);
    }


}
