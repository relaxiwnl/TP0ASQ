package exercice1;

import exercice1.User;
import exercice1.UserRepository;
import exercice1.UserService;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class UserRepositoryTest {
    @Mock
    private UserRepository userRepository;

    @Test
    void testGetUserById() {

        MockitoAnnotations.openMocks(this);

        UserService userService = new UserService(userRepository);


        long Id = 12;
        User person = new User(0,"");
        person.setId(Id);
        person.setName("omeiri");


        when(userRepository.getUserById(Id)).thenReturn(person);

        User user = userService.getUserById(Id);



        // Vérifier que le résultat est correct
        assertEquals(person, user);
    }


}