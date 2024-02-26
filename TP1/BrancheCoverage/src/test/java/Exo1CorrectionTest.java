import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Exo1CorrectionTest {
    static Exo1Correction palindrome = new Exo1Correction();
    @Test
    void isPalindromeShouldReturnTrueIfInputStringIsPalindrome(){
        //3rd Branche while => i=j  true
        assertEquals(true,palindrome.isPalindrome("kayak"));
    }
    @Test void isPalindromeShouldReturnFalseIfInputStringIsNotPalindrome(){
        //2nd Branche if(s.charAt(i) != s.charAt(j)
        assertEquals(false,palindrome.isPalindrome("hhlko"));
    }
    @Test
    void isPalindromeShouldThrowExceptionWhenItIsEmpty(){
        //1st Branche if(s==NULL)
        assertThrows(NullPointerException.class,()->palindrome.isPalindrome(null));
    }
}