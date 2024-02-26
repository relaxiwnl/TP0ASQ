import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    static Palindrome palindrome = new Palindrome();
    @Test void isPalindromeShouldReturnTrueIfInputStringIsPalindrome(){
        //3rd Branche while => i=j  true
        assertEquals(true,palindrome.isPalindrome("kayak"));
    }
    @Test void isPalindromeShouldReturnFalseIfInputStringIsNotPalindrome(){
        //2nd Branche if(s.charAt(i) != s.charAt(j)
        assertEquals(false,palindrome.isPalindrome("Esope reste ici et se repose"));
    }
    @Test void isPalindromeShouldThrowExceptionWhenItIsEmpty(){
        //1st Branche if(s==NULL)
        assertThrows(NullPointerException.class,()->palindrome.isPalindrome("Esope reste ici et se repose"));
    }
}