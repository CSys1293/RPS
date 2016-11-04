import java.util.Scanner;

public class RPSValidator {
public char RPSVal(){
		
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nRock, Paper, or Scissors (r/s/p): ");
			response = sc.nextLine();
			if(response.length() != 1){
				continue;
			}
			else if (response.toLowerCase().charAt(0) != 'r' && response.toLowerCase().charAt(0) != 'p'
					&& response.toLowerCase().charAt(0) != 's'){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	
	public char PlayerVal(){
		
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nChoose a opponent Animal or Robot (a/r): ");
			response = sc.nextLine();
			if(response.length() != 1){
				continue;
			}
			else if (response.toLowerCase().charAt(0) != 'r' && response.toLowerCase().charAt(0) != 'a'
					/*&& response.toLowerCase().charAt(0) != 's'*/){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	
	//validates char
	public char YesOrNo(){
		Scanner sc = new Scanner(System.in);
		
		String response = "";
		boolean cont = true;
		while(cont){
			System.out.print("\nPlay Again? (y/n): ");
			response = sc.nextLine();
			if(response.length() != 1){
				continue;
			}
			else if (response.toLowerCase().charAt(0) != 'y' && response.toLowerCase().charAt(0) != 'n'){
				continue;
				}
			else{
				break;
			}
		}
		return response.toLowerCase().charAt(0);
	}
	
	//Breaking while loop if false 
	public boolean loopingAgain(char response){
		if (response == 'y'){
			return true;
		} else{
			return false;
		}
	}
	
	//Closing message
	public void exitting(boolean cont){
		if (cont == false){
			System.out.println(	"\nGoodbye.");
		}
	}
}



