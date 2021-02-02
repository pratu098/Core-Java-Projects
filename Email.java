package emailapp;

import java.util.Scanner;

public class Email {
	private String Firstname;
	private String Lastname;
	private String Password;
	private int defaultPasswordlength=10;
	private String email;
	private String department;
	private int mailBoxCapacity;
	private String alternateEmailAddress;
	private String companyname="nqlcompany.com";
	
	//Constuctor to receive the firstname amd lastname
	public Email(String firstname, String lastname) {
		this.Firstname=firstname;
		this.Lastname=lastname;
		System.out.println("Email Created:"+this.Firstname+" "+this.Lastname);
	      
		//Call a method for department
		this.department=setDepartment();
		System.out.println("Department:"+this.department);
	    
		//Call a method for password
		this.Password=randomPassword(defaultPasswordlength);
		System.out.println("Your password is:"+this.Password);
	    
		//Combine elements to generate email
		email=Firstname.toLowerCase()+"."+Lastname.toLowerCase()+"@"+department+"."+companyname;
		System.out.println("your email is:"+email);
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.println("Enter the department:\n1. for Software\n2. for IT support\n3. for Sales\n4. for none");
		Scanner in = new Scanner(System.in);
		int deptchoice=in.nextInt();
		if(deptchoice==1) {return "Software";}
		else if(deptchoice==2) {return "ItSupt";}
		else if(deptchoice==3) {return "Sales";}
		else return "";
	}
	
	//Generate a Random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!#$&";
		char[] password= new char[length];
		for(int i=0;i<length;i++) {
			int random=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmailAddress=altEmail;
	}
	
	//Set the password
	public void changePassword(String password) {
		this.Password=password;
	}
	
	public int getmailBoxcapacity() {return mailBoxCapacity;}
	public String getAlternateEmail() { return alternateEmailAddress;}
	public String getPassword() {return Password;}
	
	public String showInfo() {
		return "Display Name:"+Firstname+" "+Lastname+
				"\nCompany Email:"+email+
				"\nMailBox capacity:"+mailBoxCapacity+"mb";
	}
}


