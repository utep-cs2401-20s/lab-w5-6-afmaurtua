import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.TreeMap;

public class SnakeGameTester { //
    boolean [][] A ={{false, false, false},
                    {true, true, false},
                    {false,true, false},
                    {false, true, true},
                    {false, false, true}};
    @Test
    public void testTE1(){
        int [] tail = {2,6,3};
        SnakeGame borad = new SnakeGame(A,5,1);
        assertEquals(tail, borad.findTailExhaustive());
    }
    @Test
    public void testTE2(){
        boolean [][] B = {{true, true, true,},
                {false, false, false},
                {false, false, false},
                {false, false, false}};
        int[] tail = {0,0,3};
        SnakeGame borad = new SnakeGame(B,0,0);
    }

}
