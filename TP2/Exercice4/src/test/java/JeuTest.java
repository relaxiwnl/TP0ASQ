import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class JeuTest {

    @Test
    void jouer() {
        Banque banque = mock(Banque.class);

        when(banque.est_solvable()).thenReturn(false);
        Joueur person = mock(Joueur.class);

        De de = new De() {
            @Override
            public int lancer() { //supposant que 1ere lance est 4
                return new Random().nextInt(0,7);
            }
        };
        Jeu Game = new Jeu(banque);
        Game.fermer();
        assertThrows(JeuFermeException.class,()->{Game.jouer(person,de,de);});

    }
}