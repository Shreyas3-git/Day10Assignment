import java.util.Scanner;

class Base
{
	Scanner sc = new Scanner(System.in);
	int mood;
	public String AnalyseMood() {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO MOOD ANALYSER:");
		System.out.println("press 1 if sad:\n press 2 if happy:");
		mood = sc.nextInt();
		
		if (mood == 1)
		{
			System.out.println("Mood is SAD:");
			return "SAD";
		}	
		else
		{	
			System.out.println("Mood is HAPPY:");
			return "HAPPY";
		}
	}
}

public class MoodAnalyser {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Base b1 = new Base();
		String str = b1.AnalyseMood();
		System.out.println("Mood:"+str);
	}

}
