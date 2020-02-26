import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class SnakeGameTester {
    public void TestTE1(){
        int [][] A = {{false, false, false},
                {true, false, true},
                {true, false, true},
                {true, true, true}};


        SnakeGame x = new SnakeGame(A);

        assertArrayEquals(x.findTailExhaustive());
    }
}
