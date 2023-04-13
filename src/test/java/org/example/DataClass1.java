package org.example;

import org.testng.annotations.DataProvider;

public class DataClass1 {
    @DataProvider(name = "myLoginData")
    public Object[][] getLoginData(){
        Object[][] data={{112244,"Anil","sdfs@vgv.com"},{1234567890,"Mahesh","abc@cd.ef"},{123456,"as@df.gh","abc@cdg.h"}};
        return data;
    }
}
