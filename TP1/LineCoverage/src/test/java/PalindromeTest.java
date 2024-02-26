import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    static Palindrome palindrome = new Palindrome();
    @Test void isPalindromeShouldReturnTrueIfItIsPalindrome(){
        assertEquals(true,palindrome.isPalindrome("radar"));
    }
    @Test void isPalindromeShouldReturnFalseIfIsNotPalindrome(){
        assertEquals(false,palindrome.isPalindrome("omeiri"));
    }
}