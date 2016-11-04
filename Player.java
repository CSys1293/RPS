
public abstract class Player {
	
	String name;
	Roshambo value;//Roshambo whatever they pick
	
	public Player(String name, Roshambo value){
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public Roshambo getValue() {
		return value;
	}

	public void setValue() {
		this.value = value;
	}
	//abstract method generateRoshamboApp
	public abstract Roshambo generateRoshambo();
	
	
	
	
	
}



