//import the scanner for Java
import java.util.Scanner;
public class Poised{

/* 
 * Declares the user to enter their details from picking on whether they are an architect,customer or constructor
 * Secondly they are then declared to enter their personal information
 * They are then declared to enter the Jobs name
 * Enter the personal information of the project management
 * The programme also allows to enter the totalfeepaid 
 * updates both the Deadline(due date) and the total feePaid(Money)
 */

public static void main (String [] args)throws Exception {
  
	Scanner input = new Scanner(System.in);
	// Declares the user to choose the architect, customer or constructor
	System.out.println("Capture the details of: (architect, customer or constructor)");
	String member = input.nextLine();
	// Declares user to enter their name
	System.out.println("New name: ");
	String newname = input.nextLine();
	// Declares user to enter their Telephone number
	System.out.println("New TelephoneNumber: ");
	String newtelephonenumber = input.nextLine();
	// declares the user to enter their email address
	System.out.println("New EmailAddress: ");
	String newemailaddress = input.nextLine();
	// declares the  user to enter the physical address Address
	System.out.println("New PhysicalAddress: ");
	String newphysicaladdress = input.nextLine();
	//Program given the new variable name known as the newPartner
	Members newPartner = new Members(member, newname, newtelephonenumber, newemailaddress, newphysicaladdress ); {
		//If the answer provided by user about the three choices , the all the above info will be displayed with their choice
			boolean architect = member.equals("architect");{
			if(architect == true) {
				System.out.println("New Architect Information: ");
				System.out.println(newPartner.toString());
			}
			boolean Customer = member.equals("Customer");
			if(architect == true) {
				System.out.println("New Customer Information: ");
				System.out.println(newPartner.toString());
			}
			boolean Constractor = member.equals("Contractor: ");
			if(architect == true) {
				System.out.println("\nNew Contractor Information ");
				System.out.println(newPartner.toString());
			}  
		// Details of the project management is then captured below		
				
			    System.out.println("Capture the details of: (Project Management)");
			    String ProjectManagement = input.nextLine();
			//User is declared to enetr the name of the project	
				System.out.println("Project Name: ");
				String projectname = input.nextLine();
			// User is declared to enter the project's cellphone number	
				System.out.println("project Cellphone number: ");
				String projectCellphonenumber = input.nextLine();
			//User is declared to enter the project's Building design
				System.out.println("Building Design");
				String BuildingDesign = input.nextLine();
			// declared to enter the Project's physical address
				System.out.println("PhysicalAddress: ");
				String PhysicalAddress = input.nextLine();
				// Declares to enter the total fee paid
				System.out.println("Total Fee Paid: ");
				double FeePaid = input.nextDouble();
				//Declares the user to enter the total amount due
				System.out.println("Total Amount Due: ");
				double AmountDue = input.nextDouble();
				// declares the user to enter the date for deadline
				System.out.println("DeadLine: ");
				String DeadLine = input.nextLine();
				// declares the user to insert the ERF number
				System.out.println("ERFNumber: ");
				String ERFNumber = input.nextLine();
			// new name is  assigned to the project
	             ProjectManagement Partner = new ProjectManagement( projectname, projectCellphonenumber, BuildingDesign, PhysicalAddress, FeePaid, AmountDue, DeadLine, ERFNumber );{
	            
	            if(projectname.equals("")) {
	            	String newprojectname = Partner.getUnknownprojectname() + " " + newPartner.getUnknownName();
	            	String newreplaceName = projectname.replace("", newname);
	            	
	            	ProjectManagement newProjectManagement = new ProjectManagement(newreplaceName, projectCellphonenumber, BuildingDesign, PhysicalAddress, FeePaid, AmountDue, DeadLine, ERFNumber);
	            }
	             
	            	//Poised newProject = new ProjectManagement((projectname, projectCellPhoneNumber, projectBuildingDesign, PhysicalAddress, TotalFeePaid, TotalAmountDue, DeadLine, ERFnumber );{
	                System.out.println("\nNew ProjectManagement Information: ");
	                System.out.println(newPartner.toString());
	            }
	             elif:{
	            	//PoisedInfo newProject = new ProjectManagement((projectname, projectCellPhoneNumber, projectBuildingDesign, PhysicalAddress, TotalFeePaid, TotalAmountDue, DeadLine, ERFnumber );{
		                System.out.println("\nNew ProjectManagement Information: ");
		                System.out.println(Partner.toString()); 
	             }
	            //Ask the user if they want to update the projects deadline.
	            System.out.println("Do you want to change the Deadline?(yes or no )");
	            String ChangeDeadLine = input.nextLine();
				
	            //If user wants to update deadline, display the values assigned.
	             if (ChangeDeadLine.equals("yes")); {
	            	System.out.println("Please enter New DeadLine: ");
	            	String newDeadLine = input.nextLine();
	            	
	            	ProjectManagement newProjectManagement = new ProjectManagement(projectname, projectCellphonenumber, BuildingDesign, PhysicalAddress, FeePaid, AmountDue, newDeadLine, ERFNumber);
	            }
	            	
	            	System.out.println("\nProject Information: ");
	            	System.out.println();
	            	System.out.println(newPartner.toString());
	            	
	            }
			//update projectManagement
			System.out.println("Do you want to change the FeePaid?(yes or no)");
			String ChangeFeePaid = input.nextLine();
            if (ChangeFeePaid.equals("yes")); {
           	System.out.println("Please enter New FeePaid: ");
           	String newFeePaid = input.nextLine();
           	
           }
           	// Prints updated Deadline date 
           	System.out.println("\nProject Information: ");
           	System.out.println();
           	System.out.println(newPartner.toString());
			
			
	}
 }
	
}


	


	




	

      