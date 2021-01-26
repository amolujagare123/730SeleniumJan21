package TestNG.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassTwo {

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test (groups = "email")
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }
    @Parameters({"myUrl","envName"})
    @Test
    public void classTwoTest3(String p1,String p2) {

        System.out.println("url="+p1);
        System.out.println("Enviornment name="+p2);
        System.out.println("classTwoTest3");
    }
}
