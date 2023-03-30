package michael.authorbook.Author;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;



    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }
}