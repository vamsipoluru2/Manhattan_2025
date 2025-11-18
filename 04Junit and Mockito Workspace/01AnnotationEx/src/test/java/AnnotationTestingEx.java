import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
//import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(OrderAnnotation.class)//as order number wise and dont use order() 
//method if numer is ther go with number wise
@TestMethodOrder(OrderAnnotation.class)//as order number wise
//we need to use OrderedAnnotatin of methodorderer
class AnnotationTestingEx {

    @BeforeAll
    public static void setUpOnce() {
        System.out.println("I am from SetupOnce Method (BeforeAll)");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("I am from Setup Method (BeforeEach)");
    }

    @Test
    @Order(1)
    public void test2Save() {
        System.out.println("I'm From Save Method");
//        fail("Test got failed");
    }

    @Test
    @Order(2)
    public void test1Save() {
        System.out.println("I'm From Save1 Method");
    }

    @Test
    @Order(3)
    public void test3Save() {
        System.out.println("Im From Save2 Method");
    }

    @AfterEach
    public void clear() {
        System.out.println("From Clear Method (AfterEach)");
    }

    @AfterAll
    public static void clearOnce() {
        System.out.println("From ClearOnce Method (AfterAll)");
    }
}
