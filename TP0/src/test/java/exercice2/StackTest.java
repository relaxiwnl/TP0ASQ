package exercice2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    static Stack pile;
    @BeforeEach
    void SetUP(){
        //Arrange
        pile = new Stack();
    }
    //2 classes pour methode push , si on veut verifié on faire l'arbre de la methode (branche coverage)
    @Test void pushShouldAddElementToTheTopOfStack(){
        //Act
        pile.push(5);
        //Assert
        assertEquals(1,pile.size());
        assertEquals(5,pile.peek());
    }
    @Test void pushShouldExpandTheStackWhenItIsFull(){
        //Act
        for(int i=0;i<10;i++)
            pile.push(i+1);
        pile.push(618);
        //Assert
        assertEquals(11,pile.size());
        assertEquals(618,pile.peek());
    }
    //pop
    @Test void popShouldReturnElementWithRemoving(){
        //Arrange
        pile.push(4);
        //Act
        int element = pile.pop();

        //Assert
        assertEquals(4,element);

    }
    @Test void popShouldThrowsExceptionIfStackIsEmpty(){
        assertThrows(IllegalStateException.class, ()->pile.pop());
    }
    @Test void peekShouldReturnTheLastPushedElement(){
        //Arrange
        pile.push(4);
        //Act
        int element = pile.peek();

        //Assert
        assertEquals(4,element);
    }
    @Test void peekShouldThrowsExceptionIfIsEmpty(){
        assertThrows(IllegalStateException.class, ()->pile.pop());
    }

    @Test void isEmptyShouldReturnTrueIfStackEmpty(){
        assertTrue(pile.isEmpty());
    }
    @Test void sizeShouldReturnNumberOfElementsThatExist(){
        for(int i=0;i<10;i++)
            pile.push(i+1);
        assertEquals(10,pile.size());
    }
    //expand it is private and it is calls in some functions not directly



}