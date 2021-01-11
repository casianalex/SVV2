package tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import configurations.Configuration;
import exception.FailedLoadingConfigurationException;
import exception.FailedSavingConfigurationException;

public class ConfigTest {
	
	Configuration config;
	
	@Test
	public void testSetSetting() throws FailedLoadingConfigurationException, IOException {
		config = new Configuration("valid");
		
		assertEquals("true", config.setSetting("Port number", "8080"));
		assertEquals("true", config.setSetting("Root Directory", "/www_root"));
		assertEquals("true", config.setSetting("Maintenance Directory", "/maintn"));
	}
	
	@Test
	public void testLoadinfConfiguration1() throws FailedLoadingConfigurationException, IOException {
		config = new Configuration("valid");
		
		config.loadConfiguration();
	}
	
	@Test
	public void testLoadinfConfiguration2() throws FailedLoadingConfigurationException, IOException {
		config = new Configuration("valid");
		
		config.loadConfiguration();
	}
	
	@Test(expected = FailedLoadingConfigurationException.class)
	public void testInvalidLoadConfiguration1() throws FailedLoadingConfigurationException, IOException {
		config = new Configuration("valid");
		
		config.loadConfiguration();
	}
	
	@Test(expected = FailedLoadingConfigurationException.class)
	public void testInvalidLoadConfiguration2() throws FailedLoadingConfigurationException, IOException {
		config = new Configuration("valid");
		
		config.loadConfiguration();
	}
	
	@Test(expected = FailedLoadingConfigurationException.class)
	public void testInvalidLoadConfiguration3() throws FailedLoadingConfigurationException, IOException {
		config = new Configuration("valid");
		
		config.loadConfiguration();
	}
	
	@Test(expected = FailedSavingConfigurationException.class)
	public void testInvalidSavingConfiguration() throws FailedSavingConfigurationException, FailedLoadingConfigurationException, IOException{
		config = new Configuration("valid");
		
		config.saveConfiguration();
	}
	
	
}
