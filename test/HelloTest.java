import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {
    
    @Test
    public void test1() throws Exception {
        Hello h = new Hello();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
          h.sayHello(name, "Phoenix", "Arizona"));
    }
    @Test
    public void test2() throws Exception {
        Hello h = new Hello();
        String[] name = {"Franklin","Delano","Roosevelt"};
        assertEquals("Hello, Franklin Delano Roosevelt! Welcome to Chicago, Illinois!",
          h.sayHello(name, "Chicago", "Illinois"));
    }
    @Test
    public void test3() throws Exception {
        Hello h = new Hello();
        String[] name = {"Wallace","Russel","Osbourne"};
        assertEquals("Hello, Wallace Russel Osbourne! Welcome to Albany, New York!",
          h.sayHello(name, "Albany", "New York"));
    }
}