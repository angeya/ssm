package javatest;


import org.junit.Test;

public class MathTest {

    private Math math;

    @Test
    public void testCalculate(){
        math = new Math();
        System.out.println(math.calculate());
    }
}
