public class ProjectManagement {

	// Attributes
   String projectname;
   String projectCellphonenumber;
   String BuildingDesign;
   String PhysicalAddress;
   double TotalFeePaid;
   double TotalAmountDue;
   String DeadLine;
   String ERFnumber;
	
	// Methods
   public ProjectManagement(String projectname, String projectCellphonenumber, String BuildingDesign, String PhysicalAddress, double TotalAmountDue, double TotalFeePaid, String DeadLine, String ERFNumber) {
      this.projectname = projectname;
      this.projectCellphonenumber = projectCellphonenumber;
      this.BuildingDesign = BuildingDesign;
      this.TotalFeePaid = TotalFeePaid;
      this.PhysicalAddress = PhysicalAddress;
      this.TotalAmountDue = TotalAmountDue;
      this.DeadLine= DeadLine;
      this.ERFnumber= ERFnumber;
   } 
   // String the variables to their original words
   public String toString() {
      String output = "Project Name: " + projectname;
      output += "\nProject Cell Phone Number:" + projectCellphonenumber;
      output += "\nBuilding Designed:" + BuildingDesign;
      output += "\nTotal Fee Paid: R" + TotalFeePaid;
      output += "\nPhysical Address:" + PhysicalAddress;
      output += "\nTotal Amount Due: R" + TotalAmountDue;
      output += "\nDeadLine:" + DeadLine;
      output += "\nERF Number:" + ERFnumber;
      
      return output;//returns the variable with original words
   }
   
   public String getUnknownprojectname() {//String the getUnknownproject() to newfullname that is linked to the poised class
	   String fullname = BuildingDesign;
	   String[] buildingname = fullname.split(" ");// split the fullname
	   String newfullname = buildingname[0]; //reference the index name
	   return newfullname;
	   
   }// returns newfullname
   
   	
}



