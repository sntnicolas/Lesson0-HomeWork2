import org.junit.Assert;
        import org.junit.Test;

public class MainClassTest {

    @Test
    public void testGetClassNumber(){
        MainClass testMainClass = new MainClass();
        Assert.assertTrue("Число class_number должно быть больше 45", testMainClass.getClassNumber() > 45);
    }
}