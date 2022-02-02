


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class Reporting {
	
	public void genrateJvmReport(String jsonFile) {
		
		File rD =new File("C:\\Users\\Shanavas S\\eclipse-workspace\\FrameWork\\src\\test\\resources\\Reports");		
		Configuration con =new Configuration(rD,"Facebook Automation");
		
		
		con.addClassifications("os", "windows11");
		con.addClassifications("browser", "chrome");
		con.addClassifications("version", "96");
		con.addClassifications("sprint", "27");
       
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder build = new ReportBuilder(jsonFiles, con);
		
		build.generateReports();
		
		
		
			
		
		

	}

}
