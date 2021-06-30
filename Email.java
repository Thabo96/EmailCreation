import java.util.*;

public class Email{
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternativeEmail;
	private String companySuffix = "companyName.com";
	
	//to recieve firstName and LastName
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.print("Email Created" + this.firstName+" "+this.lastName);
		
		//call a method asking for the department
		this.department = setDepartment();
		System.out.println("Department "+this.department);
		
		//call a method that returns a random password
		this.password = this.randomPassword(defaultPasswordLength);
		System.out.println("Your password is: "+this.password);
		
		//combine lements to generate emails
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix; 
		System.out.println("Your email is: "+email);
		
	}
	
	//Ask for the department
	
	private String setDepartment() {
		System.out.println("Enter the department\n1. Sales\n2. Development\n3. Accounting\n0. None");
		
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice==1) {return "Sales";}
		else if(depChoice==2){return "Dev";}
		else if(depChoice==3) {return "Acc";}
		else {return "";}		
	}
	
	
	//generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}	
		
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setmailBoxCapacity(int capacity) {
		this.mailCapacity = capacity;
	}
	
	//set alt email
	public void setAlternativeEmail(String altenativeEmail) {
		this.alternativeEmail = alternativeEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailCapacity;
	}
	public String getAltenativeEmail() {
		return alternativeEmail;
		
	}
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Dispalay Name: "+firstName+" "+lastName+
				"Campany Emai: "+email+
				"MailBox Capacity: "+mailCapacity;//use system.out. to print out
				
	}
	
}

