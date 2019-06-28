import org.junit.Test;
import static org.junit.Assert.*;
public class HelloTest {   
      @Test    
      public void hello() throws Exception {              
            String greeting = new Hello().hello("Leonard");
            assertEquals(greeting, "Hello:Leonard");  
       }
}