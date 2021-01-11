package configurations;

import pachetexceptii.EsuareIncarcareConfigurare;

import pachetexceptii.ExceptieHttp;

import pachetexceptii.ExceptiePortInvalid;

import pachetexceptii.ExceptiiConfigurare;

import pachetexceptii.GazdaInvalida;

import pachetexceptii.MaintenaceDirectory;
import pachetexceptii.RootDirectory;


public class Configuration {
	
	

	String configurationFileName;
	
	public Configuration(String configurationFileName){
		this.configurationFileName=configurationFileName;
	}
	
	public void loadConfiguration(String configuration) throws EsuareIncarcareConfigurare {	
	}
	
	public void saveConfiguration() throws  EsuareIncarcareConfigurare{	
	}
	
	public String getSetting(String key) {
		return null;
	}
	
	public boolean setSetting(String key, String name) {
		return false;
	}


}
