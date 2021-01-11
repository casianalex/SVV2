package tests;

import static org.junit.Assert.*;

import pachetexceptii.EsuareIncarcareConfigurare;

import pachetexceptii.ExceptieHttp;

import pachetexceptii.ExceptiePortInvalid;

import pachetexceptii.ExceptiiConfigurare;

import pachetexceptii.GazdaInvalida;

import pachetexceptii.MaintenaceDirectory;
import pachetexceptii.RootDirectory;

import org.junit.Test;



public class ConfigurationTest {
	
	Configuration config;
	
	@Test
	public void testSetSetting() {
		config = new Configuration("valid");
		
		assertEquals("true", config.setSetting("Port number", "8080"));
		assertEquals("true", config.setSetting("Root Directory", "/www_root"));
		assertEquals("true", config.setSetting("Maintenance Directory", "/maintn"));
	}
	
	@Test
	public void testEsuareIncarcareConfigurare() throws EsuareIncarcareConfigurare {
		config = new Configuration("valid");
		
		config.loadConfiguration("file.txt");
		
		System.out.println("Configuratie Valida");
	}
	
	
	
	@Test(expected = EsuareIncarcareConfigurare.class)
	public void testInvalidLoadConfiguration1() throws EsuareIncarcareConfigurare {
		config = new Configuration("valid");
		
		config.loadConfiguration(null);
		System.out.println("Configuratie Valida");
	}
	
	@Test(expected = EsuareIncarcareConfigurare.class)
	public void testInvalidLoadConfiguration2() throws EsuareIncarcareConfigurare {
		config = new Configuration("valid");
		
	
		System.out.println("Configuratie Valida");
	}
	
	@Test(expected = EsuareIncarcareConfigurare.class)
	public void testInvalidLoadConfiguration3() throws EsuareIncarcareConfigurare {
		config = new Configuration("valid");
		
	
		System.out.println("Configuratie Valida");
	}
	
	@Test(expected = EsuareIncarcareConfigurare.class)
	public void testInvalidSavingConfiguration() throws EsuareIncarcareConfigurare{
		config = new Configuration("valid");
		
		
	}
	
	
}
