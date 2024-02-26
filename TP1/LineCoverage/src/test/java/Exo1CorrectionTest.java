import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo1CorrectionTest {
    static Exo1Correction palindrome = new Exo1Correction();
    @Test
    void isPalindromeShouldReturnTrueIfInputStringIsPalindrome(){

        assertEquals(true,palindrome.isPalindrome("kayak"));
    }
    @Test void isPalindromeShouldReturnFalseIfInputStringIsNotPalindrome(){

        assertEquals(false,palindrome.isPalindrome("omeiri"));
    }
    @Test void isPalindromeShouldThrowExceptionWhenItIsEmpty(){

        assertThrows(NullPointerException.class,()->palindrome.isPalindrome(null));
    }
}