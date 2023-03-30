package michael.authorbook.Book;


import lombok.AllArgsConstructor;
import michael.authorbook.Author.Author;
import michael.authorbook.Author.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;


    public Book saveBook(Book book, String email) {
        Author author = authorRepository.findByEmail(email);
        if (author == null) {
            throw new IllegalStateException("Autore con la seguente email non trovato " + email);
        }
        book.setAuthor(author);

        return bookRepository.save(book);
    }
}



