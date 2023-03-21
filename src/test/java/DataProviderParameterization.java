import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParameterization {
    @BeforeTest
    public void beforeTest(){
        System.out.println("username  ,  browser ,  phone number  ,  email ");
    }

    @Test(dataProvider = "getData")
    public void RegisteringNewUser(String username,String browser,Integer phoneNumber,String email){
            //for (int i=0;i< getData().length;i++){    //how to print data below ?????????
              //if (int j=0;j< getData().length;j++);
                 //  System.out.println(i); }
    }
    @DataProvider
    public Object[][]getData(){
        Object[][] data = new Object[3][4];

        data[0][0] = "User1";
        data[0][1] = "Chrome";
        data[0][2] = 1977343434;
        data[0][3] = "dean.fedoul@gmail.com";

        data[1][0] = "User2";
        data[1][1] = "Firefox";
        data[1][2] = 19554;
        data[1][3] = "dean.fedoul1@gmail.com";

        data[2][0] = "User3";
        data[2][1] = "IE";
        data[2][2] = 1944;
        data[2][3] = "dean.fedoul2@gmail.com";
        return data;
    }
}
