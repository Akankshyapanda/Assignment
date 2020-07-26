package assignment5;

public class OneDayCricket extends Cricket {

		
		public OneDayCricket(int targetScore) {
			super(50, targetScore);
		}
		double calcCurrentRunrate(int currentScore, int currentOver) {
		return currentScore/currentOver;
		}
		double calcReqdRunrate(int RemainingRuns, int RemainingOver)
		{
			return RemainingRuns/RemainingOver;
		}


}
