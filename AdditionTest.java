import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Assert.*;

public class AdditionTest{

    @Test
    public void addTest(){
        assertEquals("Add test", 3, Addition.add(1, 2));
    }
}