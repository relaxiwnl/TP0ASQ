import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnagramTest {
    static Anagram anagram = new Anagram();
@Test void isAnagramShouldReturnTrueIfthe2InputsAreAnagram(){
    //2nd branche return true
    assertEquals(true, anagram.isAnagram("FINAL","NALFI"));
    }
    @Test void isAnagramShouldReturnFalseIfthe2InputsHaveNotTheSameLenght(){
    //3rd branch after (s1.lenght != s2.lenght)
        assertEquals(false, anagram.isAnagram("FINAL","NAEZFI"));
    }
    @Test void isAnagramShouldReturnFalseIfthe2InputsAreNotAnagram(){
        //4TH branch after (c!= 0)
        assertEquals(false, anagram.isAnagram("FINAL","NAZFI"));
    }
    @Test void isAnagramShouldThrowExceptionIfthe2InputsAreNull(){
    //1st branche covered (s1==null|| s2==null)
        assertThrows(NullPointerException.class, ()->anagram.isAnagram(null,"FINAL"));
    }

}