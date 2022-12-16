package resources.TestData;

import org.testng.annotations.DataProvider;


public class TestData {

    @DataProvider(name = "dataset")
    public Object[][] getData(){
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Manager","London","up to 10 miles","20000","30000","Per month","Permanent","Permanent Manager jobs in London"},
                {"Electrician","Leicester","up to 25 miles","3000","3500","Per month","Any","Electrician jobs in Leicester"},
                {"Cook","Leeds","up to 35 miles","2500","3600","Per month","Contract","Contract Cook jobs in Leeds"},
                {"Cashier","Kettering","up to 2 miles","10","14","Per hour","Temporary","Temporary Cashier jobs in Kettering"},
                {"Engineer","Birmingham","up to 7 miles","30000","35000","Per Annum","Any","Engineer jobs in Birmingham"},
        };
        return data;
    }
}

//    Data set
//
//|jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
//        |Tester|Harrow| up to 5 miles|30000|500000|Per annum| Permanent|Permanent Tester jobs in Harrow on the Hill|
// Create 6 More data set.