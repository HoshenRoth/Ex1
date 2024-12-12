package assignments.ex1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This JUnit class represents a very partial test class for Ex1.
 * Make sure you complete all the needed JUnits
 */
public class Ex1Test {
        @Test
        void computeNumberTest() {
            String s2 = "1011b2";
            int v = Ex1.number2Int(s2);
            assertEquals(v,11);
            String s10 = "1011bA";
            v = Ex1.number2Int(s10);
            s2 = Ex1.int2Number(v,2);
            int v2 = Ex1.number2Int(s2);
            assertEquals(v,v2);
            assertTrue(Ex1.equals(s10,s2));
        }

        @Test
        void isBasisNumberTest() {
            String[] good = {"1", "1b2", "01b2", "123bA", "ABbG", "0bA"};
            for(int i=0;i<good.length;i=i+1) {
                boolean ok = Ex1.isNumber(good[i]);
                assertTrue(ok);
            }
            String[] not_good = {"b2", "2b2", "1G3bG", " BbG", "0bbA", "abB", "!@b2", "A", "1bb2"};
            for(int i=0;i<not_good.length;i=i+1) {
                boolean not_ok = Ex1.isNumber(not_good[i]);
                assertFalse(not_ok);
            }
        }

        @Test
        void int2NumberTest() {
           assertEquals("1010", assignments.ex1.Ex1.int2Number(10, 2));
            assertEquals("FF", assignments.ex1.Ex1.int2Number(255, 16));
            assertEquals("0", assignments.ex1.Ex1.int2Number(0, 10));
            assertEquals("1", assignments.ex1.Ex1.int2Number(1, 1));
            assertEquals("", assignments.ex1.Ex1.int2Number(10, 17));
            assertEquals("", assignments.ex1.Ex1.int2Number(10, 0);
        }

        @Test
        void maxIndexTest() {
            String[] arr1= {"1b2", "10b2", "11b2"};
            assertEquals(2, assignments.ex1.Ex1.maxIndex(arr1));
            String[] arr2= {"1b2", "ab2", "11b2"};
            assertEquals(2, assignments.ex1.Ex1.maxIndex(arr2));
            String[] arr3= {"ab2", "bc3", "cd4"};
            assertEquals(0, assignments.ex1.Ex1.maxIndex(arr3));
            String[] arr4= {"0b2", "0b2", "0b2"};
            assertEquals(0, assignments.ex1.Ex1.maxIndex(arr4));

        }

       @Test
       void equalsTest(){
            assertTrue(assignments.ex1.Ex1.equals("1011b2", "11b10"));
            assertFalse(assignments.ex1.Ex1.equals("1011b2", "10b10"));
            assertFalse(assignments.ex1.Ex1.equals("1011b2", "1b17"));
            assertFalse(assignments.ex1.Ex1.equals("1011b2", "1bb2"));}
       }
}
