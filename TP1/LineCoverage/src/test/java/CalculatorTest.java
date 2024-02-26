
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
        static   Calculator calc = new Calculator();
        @Test void addShouldReturnResult(){
            int result = calc.add(4,8);
            assertEquals(12,result);
        }
        @Test void substractShouldReturnResult(){
            int result = calc.subtract(7,3);
            assertEquals(4,result);
        }
        @Test void multiplyShouldReturnResult(){
            int result = calc.multiply(3,4);
            assertEquals(12,result);
        }

        @Test void divideShouldReturnResult(){
            int result = calc.divide(5,2);
            assertEquals(2,result);
         }
        @Test void divideShouldThrowsException(){
            assertThrows(ArithmeticException.class ,()->calc.divide(5,0));
        }

}