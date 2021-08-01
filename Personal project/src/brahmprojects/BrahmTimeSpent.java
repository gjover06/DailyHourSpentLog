package brahmprojects;
import java.util.Scanner;

/*
 * George Samu
 * Purpose: The purpose of this program is to identify how my friend Brahm spends his time in a day
 * Date: 7/20/21
 */

public class BrahmTimeSpent {

	//enumerators are written inside of a class, outside of a class or outside of the method
	//Brahm's activities written in enumeration and constants
	public enum ActivityType{SLEEP,EAT,EXERCISE,WORK,SOCIALIZE,CLEANING,FAMILY_TIME,MISCELLANEOUS}
	public enum Day{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY}



	

	public static void main(String[] args) {


		//prompt the user by welcoming them and giving instructions
		//create a scanner object 

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi welcome to your program");
		System.out.println("Please enter your first name");
		String name = keyboard.nextLine();
		System.out.println("Hi " + name + " I will be asking you some questions to determine "
				+ "how you spent your day");

		//determining the day of the week by writing an if statement and an switch statement

		System.out.println("What day of the week is it?");
		String dayOfTheWeek = keyboard.nextLine(); 

		dayOfTheWeek = dayOfTheWeek.toUpperCase();

		//create an if statement to make a decision
		//set dayOfTheWeek to equals one of the days of the week .equals is used to compare strings
		if(dayOfTheWeek.equals("MONDAY") || dayOfTheWeek.equals("TUESDAY") || dayOfTheWeek.equals("WEDNESDAY") ||
				dayOfTheWeek.equals("THURSDAY") || dayOfTheWeek.equals("FRIDAY") || dayOfTheWeek.equals("SATURDAY")
				|| dayOfTheWeek.equals("SUNDAY"))
		{

			//convert a string to an enumerator
			Day daySpent = Day.valueOf(dayOfTheWeek);
			switch (daySpent)
			{
			case SUNDAY:
			case MONDAY:
			case TUESDAY:
			case WEDNESDAY:
			case THURSDAY:
			case FRIDAY:
			case SATURDAY:
				//find out what he did today(Day of the Week)
				System.out.println("lets see what you did on " + dayOfTheWeek);

				//ask questions about activities
				//create switch statement to determine how many hours 
				System.out.print("How many hours have you spent today so far? " );
				double hourSpentSoFar = keyboard.nextDouble();
				keyboard.nextLine();
				//write an if statement to make a decision if hours is > 24 hours print an error code
				if (hourSpentSoFar <= 0)
				{
					System.out.print("Error please enter a positive integer");
				}
				else if ((hourSpentSoFar > 0) && (hourSpentSoFar <= 24))
				{
					//prompt user to know what they did today 
					System.out.println("Between SLEEP, EAT,EXERCISE,WORK,SOCIALIZE,CLEANING,FAMILY TIME, and MISCELLANEOUS");
					System.out.println("What activity did you do the most today? "); 
					String activityStr = keyboard.nextLine();
					activityStr = activityStr.toUpperCase();
					activityStr = activityStr.replaceAll(" ","_");
					if (activityStr.equals("SLEEP") || activityStr.equals("EAT") || activityStr.equals("EXERCISE") || activityStr.equals("Work")
					|| activityStr.equals("SOCIALIZE") || activityStr.equals("CLEANING") || activityStr.equals("FAMILY_TIME") ||
					activityStr.equals("MISCELLANEOUS"))
					{
						ActivityType activityType = ActivityType.valueOf(activityStr);
						
//					switch (numberOfActivities)
//					{
//					case SLEEP:
//					case EAT:
//					case EXERCISE:
//					case WORK:
//					case SOCIALIZE:
//					case CLEANING:
//					case FAMILY_TIME:
//					case MISCELLANEOUS:
							System.out.print("How many hours did you spend " + activityStr + "today");
							double hours = keyboard.nextDouble();
							Activity activity = new Activity(daySpent, hours,activityType);
							System.out.println(activity);
					
				//	}//end switch
					 }
					 else 
						 System.out.println("This activityStr is not in the category of activities. Please enter an activity in the list. ");
					//
				}
				else
					System.out.println("There is no more than 24 hours in a day try again");
			default:
				break;
			}//end of switch 	
		}
		else
			System.out.println("There is no such thing as "+ dayOfTheWeek + "Try again");


	}

}
