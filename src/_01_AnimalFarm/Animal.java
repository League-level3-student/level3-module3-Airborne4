package _01_AnimalFarm;

public abstract class Animal {
	int animal = 0;
	public abstract String makeNoise();
	
	public boolean isEating() {
		if (animal == 0) {
			return false;
		}
		else {
			return true;	
		}

	}
	//"Pig", "Cow", "Sheep", "Dog" , "Horse" , "Animal"
	class Pig extends Animal {

		@Override
		public String makeNoise() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	class Cow extends Animal {

		@Override
		public String makeNoise() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	class Sheep extends Animal {

		@Override
		public String makeNoise() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	class Dog extends Animal {

		@Override
		public String makeNoise() {
			// TODO Auto-generated method stub
			return null;
		}
	}
}
