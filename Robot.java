
public class Robot extends Player{
	//Always selects rock
		public Robot(String name, Roshambo value){
			super(name, value);
			
		}
		//getter name
		//setter name
		//getter value
		//setter value
		//generateRoshambo

		@Override
		public Roshambo generateRoshambo() {
			return Roshambo.ROCK;
		}
		public String getName() {
			return name;
		}

		public void setName() {
			this.name = "Wall-e";
		}

		public Roshambo getValue() {
			return value;
		}

		public void setValue() {
			this.value = Roshambo.ROCK;
		}
		

}
