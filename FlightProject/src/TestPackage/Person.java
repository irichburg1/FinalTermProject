package TestPackage;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	private StringProperty firstName = new SimpleStringProperty(this,"firstName","");  //Abstract class type of object that you can read and write to

	
	//Returns the StringProperty object
	public StringProperty firstNameProperty() {
		return firstName;
	}
	
	//Return the first name value
	public String getFirstName() {
		return firstName.get();
	}

	//set the first name value
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	
	
	
	
}
