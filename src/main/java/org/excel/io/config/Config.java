package org.excel.io.config;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import org.excel.io.exception.ReadWriteException;

public class Config {

	private Config() {}

	private static Properties properties = null;
	
	private static void initConfig(){
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(Config.class.getClassLoader().getResourceAsStream("config.properties")))){
			properties = new Properties();
			properties.load(reader);
		}catch(Exception e){
			throw new ReadWriteException(e);
		}
	}
	
	public static String getString(String key){
		if(key != null && !key.isEmpty()){
			if(properties == null)
				initConfig();
			return properties.getProperty(key);
		}
		return key;
	}
}
