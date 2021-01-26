package TestNG.Demo;

import org.testng.annotations.*;

public class ClassThree {

    @BeforeSuite
    public void beforeMySuite()
    {
        System.out.println("BeforeSuite");
    }


    @AfterSuite
    public void afterMySuite()
    {
        System.out.println("AfterSuite");
    }



    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }

    @Test (groups = "email")
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Parameters({"myUrl","envName"})
    @Test
    public void classThreeTest3(String p1,String p2)
    {
        System.out.println("Url="+p1);
        System.out.println("Enviornment name="+p2);
        System.out.println("classThreeTest3");
    }
}
