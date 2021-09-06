import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestBasicCalculator  {
    BasicCalculator calculator = new BasicCalculator();

    @Test
    public void TestAddition()throws IOException {
        Assert.assertEquals(7, calculator.addition(5, 2));
        Assert.assertEquals(-7, calculator.addition(0, -7));

    }

    @Test
    public void TestSubtraction() throws IOException {
        Assert.assertEquals(6, calculator.subtraction(12, 6));
        Assert.assertEquals(-1, calculator.subtraction(1, 2));
    }

    @Test
    public void TestMultiplication() throws IOException {
        Assert.assertEquals(24, calculator.multiplication(6, 4));
        Assert.assertEquals(-43, calculator.multiplication(43, -1));
    }

    @Test
    public void TestDivision() throws IOException {
        Assert.assertEquals(3.0, calculator.division(12, 4), 0.0);
    }

    @Test
    public void TestPower() throws IOException{
        Assert.assertEquals(1, calculator.power(13, 0));
    }

    @Test
    public void TestSqrt() throws IOException{
        Assert.assertEquals(6.0, calculator.sqrt(36), 0.0);
    }


    @Test
    public void DivisionFailWhenBIsZero() throws IOException{
        try {
            calculator.division(4,0);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e){
            Assert.assertEquals("Math Error: Cannot divide by zero", e.getMessage());
        }
    }

    @Test
    public void PowerFailWithAAndBAreZero() throws IOException{
        try {
            calculator.power(0,0);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Math Error: Undefined", e.getMessage());
        }
    }

    @Test
    public void SqrtFail() throws IOException{
        try {
            calculator.sqrt(-8);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Math Error: Undefined", e.getMessage());
        }
    }
}
