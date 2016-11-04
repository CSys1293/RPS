import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		RPSValidator rpsv = new RPSValidator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Rock Paper Scissors");
		System.out.print("Enter your name: ");
		
		String name = scan.nextLine();
		
		
		int playCount = 0;
		int oppCount = 0;
		int drawCount = 0;
		
		
		
		char opp1 = rpsv.PlayerVal();
		boolean condition = true;
		Player ply2 = getOpponent(opp1);
		do {
		
			//get rps value
		char ch = rpsv.RPSVal();
		Roshambo choice1 = getPlayerValue(ch); 
		//set opponent value
		ply2.setName();
		ply2.setValue();
		Roshambo choice2=ply2.getValue();
		//get roshambo value
		
		//print what each player choose
		//keep count
		
		System.out.println("\n" + name + ";" + choice1.toString() + "\n");
		System.out.println(ply2.getName() + ";" + choice2.toString());
		
		
		
		
		
		if((choice1==Roshambo.PAPER && choice2==Roshambo.ROCK) 
                ||(choice1==Roshambo.ROCK && choice2==Roshambo.SCISSORS)
                ||(choice1==Roshambo.SCISSORS && choice2==Roshambo.PAPER)){
                System.out.println(name + " wins!");
                playCount++;
            }
        else if(choice1==choice2){
            System.out.println("Draw");
            drawCount++;
        }else{
            System.out.println(ply2.getName() + " wins");
            oppCount++;
        }
        System.out.printf("\n%s has %d wins - %d ties - %d loses", 
                name, playCount, drawCount, oppCount);
		
		
		
		char ch2 = rpsv.YesOrNo();
		condition = rpsv.loopingAgain(ch2);
		}while(condition);
		System.out.println("Thanks for playing!");
		//print count
		//loop again
		//while what?
		//exit message
	}
	public static Roshambo getPlayerValue(char rps){
		if (rps == 'r'){
			return Roshambo.ROCK;
		}else if (rps == 's'){
			return Roshambo.SCISSORS;
		}else{
			return Roshambo.PAPER;
		}
	}
	
	public static Player getOpponent(char choosingOpp){
		Player opponent;
		if (choosingOpp == 'r'){
			opponent = new Robot(null, null);
		} else{
			opponent = new Animal(null, null);
		}
		return opponent;
	}
	}




