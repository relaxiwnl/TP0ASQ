package src.test.exercice4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {
    static exercice4.Prime prime;
    @BeforeEach void SetUP(){
        prime = new exercice4.Prime();
    }
    @Test void isPrimeShouldReturnfalseIfEntryIsTwoOrLess(){
        //Act
        boolean result = prime.isPrime(1);
        //Arrange
        assertEquals(false, result);
    }
    @Test void isPrimeShouldReturnTrueIfEntryIsPrime(){
        //Act
        boolean result = prime.isPrime(13);
        //Arrange
        assertEquals(true,result);
    }
    @Test void isPrimeShouldReturnFalseIfEntryIsNotPrime(){
        //Act
        boolean result = prime.isPrime(15);
        //Arrange
        assertEquals(false,result);
    }
    //may be 4 classes or 5 because branch coverage it is not done yet with only 3 for example numbre 2 or 3 it is not verified in the loop
}