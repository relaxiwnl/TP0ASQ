package exercice5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    static Factorial factorial;
    @Test void factorialShouldReturnResultForEntryGreaterThanZero(){
        //Act
        int result = factorial.factorial(3);
        //Assert
        assertEquals(6,result);
    }
    @Test void factorialShouldThrowExceptionWhenEntryIsLessThanZero(){
        assertThrows(IllegalArgumentException.class,()->factorial.factorial(-5));
    }
}