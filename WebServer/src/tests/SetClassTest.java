package tests;

import org.junit.Test;

import pachetexceptii.EsuareIncarcareConfigurare;

import pachetexceptii.ExceptieHttp;

import pachetexceptii.ExceptiePortInvalid;

import pachetexceptii.ExceptiiConfigurare;

import pachetexceptii.GazdaInvalida;

import pachetexceptii.MaintenaceDirectory;
import pachetexceptii.ExceptiePortInvalid;




public class SetClassTest {
	
	@Test(expected = ExceptiePortInvalid.class)
	
	
	public void testInvalidPortNumber1() throws ExceptiePortInvalid {
		
		
		Persist persist = new Persist();
		
		persist.setPort(0);
	}
	
	@Test(expected = ExceptiePortInvalid.class)
	
	
	public void testInvalidPortNumber2() throws ExceptiePortInvalid {
		
		
		Persist persist = new Persist();
		
		
		
		
		persist.setPort(12000);
	}
	
	

	
	@Test
	public void testValidPortNumber() throws ExceptiePortInvalid {
		Persist persist = new Persist();
		
		persist.setPort(1024);
	}
	
	@Test
	public void testValidSetRootDirectory() throws ExceptiePortInvalid {
		Persist persist = new Persist();
		
		persist.setRootDirectory("D:\\folder1\\folder2");
	}
	
	
	
	@Test(expected = ExceptiePortInvalid.class)
	
	
	public void testInvalidSetRootDirectory1() throws ExceptiePortInvalid {
		
		
		Persist persist = new Persist();
		
		
		persist.setRootDirectory("file.txt");
	}
	
	
	
	@Test(expected = ExceptiePortInvalid.class)
	public void testInvalidSetRootDirectory2() throws ExceptiePortInvalid {
		Persist persist = new Persist();
		
		
		persist.setRootDirectory("file.txt");
	}
	
	@Test
	public void testValidMaintenanceDirectory() throws ExceptiePortInvalid {
		
		Persist persist = new Persist();
		
		
		
		persist.setMaintenanceDirectory("Main_Folder");
	}
	
	@Test(expected = MaintenaceDirectory.class)
	public void testInvalidMaintenanceDirectory1() throws MaintenaceDirectory {
		
		
		Persist persist = new Persist();
		
		
		
		
		persist.setMaintenanceDirectory("folder1");
	}
	
	@Test(expected = MaintenaceDirectory.class)
	
	
	public void testInvalidMaintenanceDirectory2() throws MaintenaceDirectory {
		
		
		Persist persist = new Persist();
		
		
		persist.setMaintenanceDirectory("new.txt");
		
	}
}