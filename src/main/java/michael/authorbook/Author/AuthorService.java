package michael.authorbook.Author;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Not found Author with id = " + id));
    }

    public void deleteAuthor(Long id){
        Optional<Author> author = authorRepository.findById(id);
        if (author.isPresent()) {
            authorRepository.deleteById(id);
        } else {
            throw new IllegalStateException("Not found Author with id = " + id);
        }
    }

}
