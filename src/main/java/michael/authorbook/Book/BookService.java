package michael.authorbook.Book;


import lombok.AllArgsConstructor;
import michael.authorbook.Author.Author;
import michael.authorbook.Author.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;


    public Book getBookById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Not found Book with id = " + id));
    }


    public Book saveBook(Book book, String email) {
        Author author = authorRepository.findByEmail(email);
        if (author == null) {
            throw new IllegalStateException("Author with the following email not found " + email);
        }
        book.setAuthor(author);

        return bookRepository.save(book);
    }


}



