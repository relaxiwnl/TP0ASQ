import org.example.RomanNumiral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanNumiralTest {
    @Test
    void VerificationRomanNum(){
        //Arrange
        RomanNumiral Num = new RomanNumiral();
        String Roman = "VIII";
        String Roman1 = "IX";
        //Act
        int result = Num.convert(Roman1);
        //Assert
        assertEquals(8,result);
        assertEquals(9,result);

    }
}
