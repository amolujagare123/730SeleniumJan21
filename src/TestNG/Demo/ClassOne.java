package TestNG.Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {


    @BeforeTest
    public void beforeMytest()
    {
        System.out.println("beforeMytest");
    }


    @AfterTest
    public void afterMytest()
    {
        System.out.println("afterMytest");
    }




    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test (groups = "email")
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }


    @Parameters({"myUrl","envName"})
    @Test
    public void classOneTest3(String p1,String p2)
    {
        System.out.println("Url="+p1);
        System.out.println("Enviornment name="+p2);
        System.out.println("classOneTest3");
    }
}
