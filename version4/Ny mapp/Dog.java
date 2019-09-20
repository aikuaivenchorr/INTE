//Mariia Loskutova, malo6383

public class Dog {
	private String name;
	private String breed;
	private int age;
	private double weight;
	
	//tailLength ska altid vara rätt, så ingen variabel, bara metod
	//private double tailLength;

	public Dog(String name, String breed, int age, double weight) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	//ska uppdatera svanslength
	public int getAge() {
		//räkna svans
		return age;
	}

	public double getWeight() {
		return weight;
	}
/*
	public double getTailLength() {
		 
		return setTailLength();
	}*/

	//ska vara private!
	public double getTailLength() {
		double tailLength;
		if (breed.equalsIgnoreCase("tax") || breed.equalsIgnoreCase("dachshund")) {
			tailLength = 3.7;
		} else {
			tailLength = (age * weight) / 10;
		}
		
		return tailLength;
	}

	public void increaseAge() {
		age++;
	}

	public String toString() {
		return String.format("%s %s %d år %.1f kg svans=%.1f", name, breed, age, weight, getTailLength());
	}

}
