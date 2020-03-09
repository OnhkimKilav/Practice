import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    void div() throws InterruptedException {
        int a = 8;
        int b = 2;
        int expResult = 4;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
    }
}