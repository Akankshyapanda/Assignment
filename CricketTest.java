package assignment5;
	import java.util.*;
	public class CricketTest {
		public static void main(String ar[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter Target Runs:");
			int targetRuns=sc.nextInt();
			System.out.println(" enter the Current Over:");
			int currentOver=sc.nextInt();
			System.out.println(" enter the Current Score:");
			int currentScore=sc.nextInt();
			OneDayCricket object=new OneDayCricket(targetRuns);
			object.setCurrentOver(currentOver);
			object.setCurrentScore(currentScore);
			System.out.println("Current Run rate:");
			System.out.println(object.calcCurrentRunrate(currentScore, currentOver));
			System.out.println("Required Run rate:");
			System.out.println(object.calcReqdRunrate((targetRuns-currentScore),(object.getMaxOver()-currentOver)));
		}
	}

