package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//Below program is for explaining 'Cucumber Runner class,Report generation'concepts

/*
@CucumberOptions(features = {"./src/test/java/features"},glue = {"stepDefinitions"},    //'stepDefinitions'===>Package name only need to keep here.
plugin= {"html:Reports/CucumberReports.html",         //Cucumber has a builtin plugin,so need not add any extra Dependency or any Jar.All u have to do here is,u just have to provide 'plugin' along with 'html:' and 'Path of the Report'. 
		"json:Reports/CucumberJSONReport.json",      //Similarly, in order to get the Report in JSON format(which will help us for 'API Testing' as an input)we should mention 'json:' along with 'Path of the JSON Report'.
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"   //This u will get it after searching in 'Google' with this address==>https://extentreports.com/docs/versions/4/java/cucumber4.html,inside this navigate to 'Usage' module,there u will get this syntax.//To provide the 'location' where the Report should be available,we will use 'extent.properties' file under 'src/test/resources'folder.
        }   
)  

public class CucumberRunner  extends AbstractTestNGCucumberTests {

}
*/






//Below program is for explaining 'Cucumber tags'concept
/*
@CucumberOptions(features = {"./src/test/java/features"},glue = {"stepDefinitions"},
tags="@Smoke and @Regression",       //Based on our requirement we can change this 'tags' like this======>tags="@Smoke",  or  tags="not @Smoke",
plugin= {"html:Reports/CucumberReports.html",
		"json:Reports/CucumberJSONReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}   
)  

public class CucumberRunner  extends AbstractTestNGCucumberTests {

}
*/






//Below program is for explaining 'Hooks'concept
/*
@CucumberOptions(features = {"./src/test/java/features"},glue = {"stepDefinitions","hook"},
tags="@Search",
plugin= {"html:Reports/CucumberReports.html",
		"json:Reports/CucumberJSONReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}   
)  

public class CucumberRunner  extends AbstractTestNGCucumberTests {

}
*/

 


//Below program is for explaining 'dryRun'concept
@CucumberOptions(features = {"./src/test/java/features"},glue = {"stepDefinitions","hook"},
dryRun = false,  //dryRun = true,
plugin= {"html:Reports/CucumberReports.html",
		"json:Reports/CucumberJSONReport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}   
)  

public class CucumberRunner  extends AbstractTestNGCucumberTests {

}



