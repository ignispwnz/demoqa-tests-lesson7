package junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

public class firstJUnitTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Это метод @BeforeAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Это метод @BeforeEach");

    }

    @AfterEach
    void afterEach() {
        System.out.println("Это метод @AfterEach");
    }

    @Test
    void firstTest() {
        System.out.println("Это тест");
    }
}
