import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

	@Test
	public void userNameTest() 
	{
		VerifyPattern junit = new VerifyPattern();
		String user = "shreyas";
		String user1 = "sanket";
		boolean isCheck = junit.userName(user);
		if( user == "shreyas" )
		{
			Assert.assertEquals(true, isCheck);
		}
		
		isCheck = junit.userName(user1);
		
		if(user1 == "sanket")
		{
			Assert.assertEquals(true, isCheck);
		}
		
	}
	
	@Test
	public void passwordTest()
	{
		VerifyPattern junit = new VerifyPattern();
		String password = "abcxyz@$123";
		String password1 = "xyzwkd#@9564";
		boolean correctPass = junit.password(password);
		if( password == "abcxyz@$123" )
		{
			Assert.assertEquals(true, correctPass);
		}
		correctPass = junit.password(password1);
		if ( password1 == "133n3kdu" ) 
		{
			Assert.assertEquals(true, correctPass);
		}
	}
	@Test
	public void emailIDTest()
	{
		VerifyPattern junit = new VerifyPattern();
		String useremail = "mr.shreyasshinde@gmail.com";
		String useremail1 = "mr.shindeshreyas73@gmail.co.in";
		boolean isCorrectEmail = junit.emailID(useremail);
		if ( useremail == "mr.shreyasshinde@gmail.com" ) 
		{
			Assert.assertEquals(true, isCorrectEmail);
		}
		isCorrectEmail = junit.emailID(useremail1);
		if ( useremail1 == "shindeshreyas73@gmail.co.in" ) 
		{
			Assert.assertEquals(true, isCorrectEmail);
		}
		
	}
	
	@Test
	public void contactNumTest()
	{
		VerifyPattern junit = new VerifyPattern();
		String contact = "7771759597";
		String contact1 = "9552559946";
		boolean isCorrectContact = junit.contactNum(contact);
		if ( contact == "7771759597" ) 
		{
			Assert.assertEquals(true, isCorrectContact);
		}
		isCorrectContact = junit.contactNum(contact1);
		if ( contact1 == "9552559946" ) 
		{
			Assert.assertEquals(true, isCorrectContact);
		}
		
	}

	@Test
	public void ageTest()
	{
		VerifyPattern junit = new VerifyPattern();
		String age = "21";
		String age1 = "56";
		boolean isCorrect = junit.age(age);
		if ( age == "21" ) 
		{
			Assert.assertEquals(true, isCorrect);
		}
		isCorrect = junit.age(age1);
		if ( age1 == "56" ) 
		{
			Assert.assertEquals(true, isCorrect);
		}
	}
	
	@Test
	public void cityTest()
	{
		VerifyPattern junit = new VerifyPattern();
		String city = "pune";
		String city1 = "delhi";
		boolean isCorrectcity = junit.city(city);
		if ( city == "pune" ) 
		{
			Assert.assertEquals(true, isCorrectcity);
		}
		isCorrectcity = junit.city(city1);
		if ( city1 == "delhi" ) 
		{
			Assert.assertEquals(true, isCorrectcity);
		}
	}
}