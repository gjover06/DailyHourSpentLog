package brahmprojects;

//importing enum
import brahmprojects.BrahmTimeSpent.ActivityType;
import brahmprojects.BrahmTimeSpent.Day;

public class Activity {
	private Day day;
	private double hourSpent;
	private ActivityType activityType;

	public Activity(Day day, double hourSpent, ActivityType activityType) {

		this.day = day;
		this.hourSpent = hourSpent;
		this.activityType = activityType;
	}

	@Override
	public String toString() {
		return "Activity [day=" + day + ", hourSpent=" + hourSpent + ", activityType=" + activityType + "]";
	}

	public Day getDay() {
		return day;
	}

	public double getHourSpent() {
		return hourSpent;
	}

	public ActivityType getActivityType() {
		return activityType;
	}



}
