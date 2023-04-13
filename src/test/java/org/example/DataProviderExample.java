package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
//    @DataProvider(name = "myLoginData")
//    public Object[][] getLoginData(){
//        Object[][] data={{112244,"Anil"},{1234567890,"Mahesh"}};
//        return data;
//    }

    @Test(dataProvider = "myLoginData",dataProviderClass = DataClass1.class)
    public void loginForm(int reg, String name,String email){
        System.out.println(reg+"->"+name+"->"+email);
    }
}
