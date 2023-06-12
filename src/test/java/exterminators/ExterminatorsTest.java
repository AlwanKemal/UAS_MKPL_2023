package exterminators;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExterminatorsTest {
    
    @Test
    public void testMatrixTranspose() {
        int a = 5;
        int b = 1;
        
        int[][] mat = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        
        int[][] expectedTransposedMatrix = {
            {1, 3, 5},
            {2, 4, 6}
        };
        
        int[][] trans = new int[b][a];
        
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                trans[i][k] = mat[k][i];
            }
        }
        
        assertArrayEquals(expectedTransposedMatrix, trans);
    }
}
