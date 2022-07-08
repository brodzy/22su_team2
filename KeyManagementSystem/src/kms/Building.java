package kms;

public class Building {
	
	//Vars
	private String name;
	private String code;
	
	//Constuctor
	public Building(String name, String code) {
		this.name = name;
		this.code = code;
	}
	
	public Building() {
	}
	
	//Methods
	public String getName() {
		return name;
	}
	
	//Code must be only 2 digits
	public String getCode() {
		
		if (code.matches("[0-9]+") == false) {
			return "Building code must only contain digits";
		}
		else if (code.length() != 2) {
			return "Building code must be exactly 2 digits";
		}
		return code;
	}
	
}