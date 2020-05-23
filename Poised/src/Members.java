
public class Members {
    //Attributes
	String Members;
	String Name;
	String TelephoneNumber;
	String EmailAddress;
	String PhysicalAddress;
	//Methods
	public Members(String Members, String Name, String TelephoneNumber, String  EmailAddress, String PhysicalAddress ) {
		this.Members= Members;
		this.Name = Name;
		this.TelephoneNumber = TelephoneNumber;
		this.EmailAddress = EmailAddress;
		this.PhysicalAddress = PhysicalAddress;
	
	}
	//String variables to their original words using the toString method
	public String toString() {
		String output = "members: " + Members;
		output += "\nname: " + Name;
		output += "\ntelephonenumber: " + TelephoneNumber;
		output += "\nemailaddress: " + EmailAddress;
		output += "\nphysicaladdress: " + PhysicalAddress;
		
		return output;
		//Return output that is assigned to
	}
	
	public String getUnknownName() {
		String fullName = Name;
		String[] name = fullName.split(" ");
		String newName = name[1];
		return newName;
	}//Return newName
	
}
  


		
	

		
		
    
    


