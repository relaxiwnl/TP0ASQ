package exercice2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Or;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {

    @Test
    public void createOrder() {
        OrderService orderServiceMock = mock(OrderService.class);

        Order o = new Order(12);

        OrderController OC = new OrderController(orderServiceMock);

        OC.createOrder(o);

        verify(orderServiceMock).createOrder(o);
        /////////////////////////////////////////////
        Order o1 = new Order(2);
        OrderDao orderdaomock = mock(OrderDao.class);
        OrderService orderservice = new OrderService(orderdaomock);
        orderservice.createOrder(o1);
        verify(orderdaomock).saveOrder(o1);


    }
}