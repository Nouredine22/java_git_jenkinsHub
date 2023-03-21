package learningMultipeTestCases;

import Data_dataProvider.Data;
import org.testng.annotations.Test;

public class TestCases_DataProvider {

    @Test(dataProviderClass= Data.class,dataProvider = "getData")
    public void AddUser(String username,String browser,int phoneNumber,String email){
        System.out.println(username+"---"+browser+"---"+phoneNumber+"---"+email+"---");
    }
    @Test(dataProviderClass= Data.class,dataProvider = "getData")
    public void RegisterUser(String username,String browser,int phoneNumber,String email){
        System.out.println(username+"---"+browser+"---"+phoneNumber+"---"+email+"---");
    }
    @Test(dataProviderClass= Data.class,dataProvider = "getData")
    public void DeleteUser(String username,String browser,int phoneNumber,String email){
        System.out.println(username+"---"+browser+"---"+phoneNumber+"---"+email+"---");
    }






}
