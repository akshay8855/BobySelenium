package utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configdata {
	
	public static Properties prop;
	private static String keyName;
	public configdata() {
		try {
			FileInputStream fins=new FileInputStream( new File(".//config.properties"));
			
			prop=new Properties();
			prop.load(fins);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getbrowser(String browserName) {
		return prop.getProperty(browserName);
				
	}
		public String getUrl(String urlName) {
			return prop.getProperty(urlName);
		}
		public static String getKey(String keyName) {
			return prop.getProperty(keyName);
			
			
		
			
		}
		
		
	}
	


