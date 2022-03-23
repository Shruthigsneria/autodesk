package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile implements AutoConstant{
	{
}
	
	public String getPropertyFiledata(String key) throws FileNotFoundException 
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream (propertyFilePath);
		
		return p.getProperty(key)
;		
	}

}
