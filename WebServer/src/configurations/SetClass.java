package configurations;

import pachetexceptii.EsuareIncarcareConfigurare;

import pachetexceptii.ExceptieHttp;

import pachetexceptii.ExceptiePortInvalid;

import pachetexceptii.ExceptiiConfigurare;

import pachetexceptii.GazdaInvalida;

import pachetexceptii.MaintenaceDirectory;
import pachetexceptii.RootDirectory;

import validators.MaintenanceDirectoryValidator;
import validators.PortNumberValidator;
import validators.RootDirectoryValidator;



public class SetClass {
	
	private int portNumber = 8080;
	
	private String rootDirectory = "D:\\www_root";
	
	private String maintenanceDirectory = "D:\\www_root\\maintn";

	
	public int getPortNumber() {
		return portNumber;
	}
	
	public void setPort(int portNumber) throws ExceptiePortInvalid {
		if(!PortNumberValidator.validate(portNumber))
			throw new ExceptiePortInvalid();
		this.portNumber = portNumber;
	}
	
	
	public String getMaintenanceDirectory() {
		return maintenanceDirectory;
	}
	
	public void setHost () thwrows GazdaInvalida{
		this.setHost();
		
	}
	
	public void setRootDirectory(String rootDirectory) throws RootDirectory {
		if(!RootDirectoryValidator.validate(rootDirectory))
			throw new RootDirectory();
		this.rootDirectory = rootDirectory;
		
		
		
}
	public void setMaintenanceDirectory(String maintenanceDirectory) throws MaintanaceDirectory {
	
		
		
			throw new InvalidMaintenanceDirectoryException();
		this.maintenanceDirectory = maintenanceDirectory;
	
}

