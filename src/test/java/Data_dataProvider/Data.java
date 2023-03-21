package Data_dataProvider;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class Data {
    @DataProvider
    public static Object[][]getData(Method name){
        System.out.println("Test Case which has the method is "+name.getName());
        Object[][] data = new Object[3][4];

        data[0][0] = "User1";
        data[0][1] = "Chrome";
        data[0][2] = 1977343434;
        data[0][3] = "dean.fedoul@gmail.com";

        data[1][0] = "User2";
        data[1][1] = "Firefox";
        data[1][2] = 195587664;
        data[1][3] = "dean.fedoul1@gmail.com";

        data[2][0] = "User3";
        data[2][1] = "IE";
        data[2][2] = 19498434;
        data[2][3] = "dean.fedoul2@gmail.com";
        return data;
    }
}
