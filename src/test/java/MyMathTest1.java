import org.junit.*;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class MyMathTest1 {
    int a, b, expResult;

    public MyMathTest1(int a, int b, int expResult) {
        this.a = a;
        this.b = b;
        this.expResult = expResult;
    }

    @Rule
    public TestRule timeout = new Timeout(1000);

    @Parameterized.Parameters
    public static Collection numbers(){
        return Arrays.asList(new Object[][]{{1, 2, 3},
                {2, 9, 11},
                {3, 3, 6}});
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        /*int a = 2;
        int b = 3;
        int expResult = 5;*/



        int result = MyMath.add(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void div() throws InterruptedException {
        int a = 8;
        int b = 0;
        int expResult = 4;
        int result = MyMath.div(a, b);
        assertEquals(expResult, result);
    }
}