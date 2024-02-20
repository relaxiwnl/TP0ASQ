package exercice3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    static Fibonacci fibo;
    @Test void fibonacciShouldReturnZeroIfEntryIsZero(){
        //Arrange

        //Act
        int result = fibo.fibonacci(0);
        //Assert
        assertEquals(0,result);
    }
    @Test void fibonacciShouldReturnOneIfEntryIsOne(){
        //Arrange

        //Act
        int result = fibo.fibonacci(1);
        //Assert
        assertEquals(1,result);
    }
    @Test void fibonacciShouldThrowsExceptionWhenEntryIsNegative(){
        assertThrows(IllegalArgumentException.class,()->fibo.fibonacci(-1));
    }
    @Test void fibonacciShouldReturnTheRightResult(){
        int result = fibo.fibonacci(3);
        //Assert
        assertEquals(2,result);
    }
}