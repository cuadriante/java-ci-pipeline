import org.junit.Assert;
import org.junit.Test;

public class TestBasicCalculator {
    BasicCalculator calculator = new BasicCalculator();

    @Test
    public void TestAddition(){
        Assert.assertEquals(7, calculator.addition(5, 2));
        Assert.assertEquals(-7, calculator.addition(0, -7));

    }

    @Test
    public void TestSubtraction(){
        Assert.assertEquals(6, calculator.subtraction(12, 6));
        Assert.assertEquals(-1, calculator.subtraction(1, 2));
    }

    @Test
    public void TestMultiplication(){
        Assert.assertEquals(24, calculator.multiplication(6, 4));
        Assert.assertEquals(-43, calculator.multiplication(43, -1));
    }

    @Test
    public void TestDivision(){
        Assert.assertEquals(3, calculator.division(12, 4));
    }

    @Test
    public void TestPower(){
        Assert.assertEquals(1, calculator.power(13, 0));
    }

    @Test
    public void TestSqrt(){
        Assert.assertEquals(6, calculator.sqrt(36));
    }


    @Test
    public void DivisionFailWhenBIsZero(){
        try {
            calculator.division(4,0);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e){
            Assert.assertEquals("Math Error: Cannot divide by zero", e.getMessage());
        }
    }

    @Test
    public void PowerFailWithAAndBAreZero(){
        try {
            calculator.power(0,0);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Math Error: Undefined", e.getMessage());
        }
    }

    @Test
    public void SqrtFail(){
        try {
            calculator.sqrt(-8);
            Assert.fail("Should have thrown IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Math Error: Undefined", e.getMessage());
        }
    }
}
