package michael.authorbook.Book;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import michael.authorbook.Author.Author;

import java.time.LocalDate;

@Data  //getters setters toString
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate release_date;

    @ManyToOne
    @JsonBackReference
    private Author author;

}
