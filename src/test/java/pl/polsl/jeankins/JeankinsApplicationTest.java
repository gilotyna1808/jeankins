package pl.polsl.jeankins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JeankinsApplicationTest {

    @Test
    void added() {
        JeankinsApplication jeankinsApplication=new JeankinsApplication();
        assertEquals(10,jeankinsApplication.added(5,5));
    }
}