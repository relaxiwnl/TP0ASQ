import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.stubbing.answers.ThrowsException;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void testCreerUtilisateur() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        // TODO : Configuration du comportement du mock, utiliser la
//directive « when » avec sa méthode « thenReturn »
        doNothing().when(utilisateurApiMock).creerUtilisateur(utilisateur);
        // TODO : Création du service avec le mock
        UserService service = new UserService(utilisateurApiMock);
        // TODO : Appel de la méthode à tester
        service.creerUtilisateur(utilisateur); //on suppose il y a pas une exception
        // TODO : Vérification de l'appel à l'API
        verify(utilisateurApiMock, times(1)).creerUtilisateur(utilisateur);
    }
}