package exercice1;

import exercice1.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Exercice1test {
    @Test
    void VerificationgetFullName(){
        //Arrange
        Person eleve = new Person("Omeiri","NedjmEddine Louai", 23);
        //Act
        String FullName = eleve.getFullName();

        //Assert
        assertEquals("Omeiri NedjmEddine Louai",FullName);
    }
    @Test
    void isAdultShouldReturnTrueWhenAgeisGraterorEqual18(){
        //Arrange
        Person eleve = new Person("Omeiri","NedjmEddine Louai", 23);
        //Act
        boolean adult = eleve.isAdult();
        //Assert
        assertEquals(true,adult);
    }
    @Test
    void isAdultShouldReturnFalseWhenAgeisUnder18(){
        Person eleve = new Person("Messaoudi","KheirEddine", 17);
        //Act
        boolean adult = eleve.isAdult();
        //Assert
        assertEquals(false,adult);
    }


}
