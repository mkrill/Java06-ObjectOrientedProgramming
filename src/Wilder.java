/* 	1. Create a Wilder class
	2. Adds the attributes String firstname and boolean present
	3. Create a constructor to initialise firstname and present 
	4. Add getters and setters for all attributes, according to the conventions
	5. Add a whoAmI() method that returns the text "My name is firstname and I am present" or "My name is firstname and I am not present", depending on the state of the attributes firstname and present 
	6. Create a Classroom class with a main() method
	7. Add references to several instances of the Wilder class inside the main() method of Classroom
	8. For each of the references, display the result of the whoAmI() method in the terminal
	9. Compile and test Classroom: once everything is working perfectly, create a git repository and send it all to GitHub
	10. Share the link to the GitHub repository as your solution
*/
public class Wilder {

	private String firstname;
	private boolean present;

	public Wilder(String fname, boolean present) {
		this.setFirstname(fname);
		this.setPresent(present);
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public boolean isPresent() {
		return present;
	}

	public void setPresent(boolean present) {
		this.present = present;
	}

	public String whoAmI() {
		if (this.isPresent()) {
			return "My name is " + this.getFirstname() + ", and I am present";
		} else {
			return "My name is " + this.getFirstname() + ", and I am not present";			
		}		
	}

}
