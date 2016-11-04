
public enum Roshambo{
		ROCK,
		PAPER,
		SCISSORS;
		
	public String toString() {
			if(ordinal()==0)
				return "ROCK";
			else if(ordinal()==1)
				return "PAPER";
			else
				return "SCISSORS";
		}
	
	}



