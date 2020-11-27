import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testGetDisplayNameSpace() {
       Student stu = new Student("Morakot","abc", 
       "99999999",2010);
        
        String displayName = stu.getDisplayName();
        assertEquals("Morakot Choetkiertikul", displayName);
    }

    @Test
    public void testGetDisplayNameNospace() {
       Student stu = new Student("Morakot","Choetkiertikul", "99999999",2010);
        
   String displayName = stu.getDisplayName();
        assertEquals("MorakotChoetkiertikul", displayName);
    }
}