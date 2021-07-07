package KeyworddrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fib {
 
	
	public String readpropertyFile(String propath, String key) throws IOException
	{
        FileInputStream fis = new FileInputStream(propath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
