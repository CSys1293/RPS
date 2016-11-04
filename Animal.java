import java.util.Random;

public class Animal extends Player{
	public Animal(String name, Roshambo value){
		super(name, value);
		
	}

	@Override
	public Roshambo generateRoshambo() {
		Random rnd = new Random();
		int i = rnd.nextInt(3) + 1;
		if (i==1)
		{return Roshambo.PAPER;}
		else if(i==2)
			{return Roshambo.ROCK;}
		else
			{return Roshambo.SCISSORS;}
	}
	
	//getter name
	//setter n
	//getter value
	//getter value
	//generateRoshambo

public String getName() {
	return name;
}

public void setName() {
	this.name = "Zelda";
}

public Roshambo getValue() {
	return value;
}

public void setValue() {
	this.value = generateRoshambo();
}
}





