package exercice3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @Test
    public void getProduct() {
        ProductApiClient APImock = mock(ProductApiClient.class);

        ProductService PS = new ProductService(APImock);
        PS.getProduct("1");
        verify(APImock).getProduct("1");
/////////////////////////////////////////////////////////////////
        when(APImock.getProduct("4")).thenThrow(IllegalArgumentException.class);
        assertThrows(IllegalArgumentException.class,()->PS.getProduct("4"));
    }

}