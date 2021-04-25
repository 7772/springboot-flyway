package com.example.demo.models;

import java.util.Optional;

import com.example.demo.ResetDatabase;
import com.example.demo.daos.BookDao;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BookTest extends ResetDatabase {
    @Autowired
    private BookDao bookDao;

    @Test
    public void createSuccess() {
        // Given
        Book book = new Book();
        book.setId((long) 1);
        book.setName("flyway 정복하기");
        book.setAuthor("김저자");

        // When
        bookDao.save(book);

        // Then
        Optional<Book> bookFromDB = bookDao.findById((long) 1);

        assertThat(bookFromDB.isPresent()).isTrue();

        assertThat(bookFromDB.get().getId()).isEqualTo(book.getId());
        assertThat(bookFromDB.get().getName()).isEqualTo(book.getName());
        assertThat(bookFromDB.get().getAuthor()).isEqualTo(book.getAuthor());
    }
}
