import java.util.regex.Pattern;
import java.util.Scanner;

class VerifyPattern
{
		Scanner sc = new Scanner(System.in);
		
		private String userNameRegex,passwordRegex,emailRegex,contactRegex,userAgeRegex,usercityRegex;

	public boolean userName(String userName)
	{
		userNameRegex = "^[A-Za-z]*";
		Pattern.compile(userNameRegex);
		
	
		if ( userName.matches(userNameRegex) )
		{
			System.out.println("Name is valid:");
			String str = userName;
			return true;
		}
		else
		{
			System.out.println("Name is not valid:");
			return false;
		}
	}

	public boolean password(String userPass)
	{
		passwordRegex = "^[[^[0-9]]a-zA-Z]*[0-9[\\W]]{3,7}$";

		Pattern pt = Pattern.compile(passwordRegex);
		if ( userPass.matches(passwordRegex) )
		{	
			System.out.println("password is valid:");
			return true;
		}
		else
		{
			System.out.println("not valid password:");
			return false;
		}
	}

	public boolean emailID(String userEmail)
	{
		emailRegex = "^[a-z0-9-\\+]+[\\.[a-z0-9]]*@[a-z]{1,7}[\\.[a-z]]*$";
		
		Pattern pt = Pattern.compile(emailRegex);

		if ( userEmail.matches(emailRegex) )
		{
			System.out.println("email is valid:");
			return true;
		}
		else
		{
			System.out.println("email is not valid:");
			return false;
		}
	
	}

	public boolean contactNum(String contact)
	{
		contactRegex = "^[7-9]{1}[0-9]{9}$";

		Pattern pt = Pattern.compile(contactRegex);

		if ( contact.matches(contactRegex) )
		{
			System.out.println("contact number is valid:");
			return true;
		}
		else
		{
			System.out.println("contact is not valid:");
			return false;
		}
		
	}

	public boolean age(String age)
	{
		userAgeRegex = "^[0-9]{0,3}$";

		Pattern pt = Pattern.compile(userAgeRegex);

		if ( age.matches(userAgeRegex) )
		{
			System.out.println("age is valid:");
			return true;
		}
		else
		{
			System.out.println("age is not valid:");
			return false;
		}
		
	}

	public boolean city(String city)
	{
		usercityRegex = "^[a-zA-Z]{1,13}$";

		Pattern pt = Pattern.compile(usercityRegex);

		if ( city.matches(usercityRegex) )
		{
			System.out.println("city name is valid:");
			return true;
		}
		else
		{
			System.out.println("city is not valid:");
			return false;
		}
		
	}

	
}

public class UserRegistration 
{

	public static void main(String[] args) 
	{
		VerifyPattern v1 = new VerifyPattern();
		v1.userName("shreyas");
		v1.password("abcxyz@$123");
		v1.emailID("mr.shreyasshinde26@gmail.com.in");
		v1.contactNum("9890396486");
		v1.age("21");
		v1.city("Pune");

	}

}
