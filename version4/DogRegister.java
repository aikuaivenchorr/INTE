
//Mariia Loskutova, malo6383

import java.util.ArrayList;
import java.util.Scanner;

public class DogRegister {
	private static Scanner keyboard = new Scanner(System.in);
	//ta bort dessa variabler och använd metoder som returnerar hund obj och dogIsFound
	//private boolean dogIsFound = false;
	//private Dog currentDog = null;

/*	private boolean dogExists(String name, ArrayList<Dog> dogs) {
		boolean dogIsFound = false;
		for (Dog d : dogs) {
			if (d.getName().equalsIgnoreCase(name)) {
				dogIsFound = true;
				//currentDog = d;
				break;
			} else {
				dogIsFound = false;
			}
		}

		return dogIsFound;
	}*/
	
	public Dog getCurrenDog(String name, ArrayList<Dog> dogs) {
		Dog dog = null;
		for (Dog d : dogs) {
			if (d.getName().equalsIgnoreCase(name)) {
				dog = d;
				break;
				
			}else {
				dog = null;
			}
		}
		
		return dog;
	}
	
/*	private double countTailLength(ArrayList<Dog> dogs, String name) {
		double tailLength = 0.0;
		if(dogs.size() > 0 ) {
			for (Dog d : dogs) {
				if(d.getName().equalsIgnoreCase(name)) {
					tailLength = d.getTailLength();
					break;
				}
			}
		}
		return tailLength;
	}*/

	private void listDogs(ArrayList<Dog> dogs) {
		System.out.print("Ange minsta svanslängd: ");
		double tail = keyboard.nextDouble();
		keyboard.nextLine();
		if(dogs.size() > 0 ) {
			for (Dog d : dogs) {
	
				//d.getTailLength();
	
				if (tail == 0) {
					System.out.println(d);
				} else if ((tail > 0) && (tail < 10) && (tail <= d.getTailLength())) {
					System.out.println(d);
				} else if (tail == 10 && d.getTailLength() >= 10) {
					System.out.println(d);
				}
			}
		} else {
			System.out.println("Fel! Hundregistret är tom");
		}
	}

	private void registerNewDog(ArrayList<Dog> dogs) {
		System.out.print("Namn: ");
		String name = keyboard.nextLine();
		System.out.print("Ras: ");
		String breed = keyboard.nextLine();
		System.out.print("Ålder: ");
		int age = keyboard.nextInt();
		System.out.print("Vikt: ");
		double weight = keyboard.nextDouble();
		keyboard.nextLine();

		dogs.add(new Dog(name, breed, age, weight));
		System.out.println(dogs.get(dogs.size() - 1).getName());
		System.out.println("Hunden " + dogs.get(dogs.size() - 1).getName() + " har lagts till registret!");

	}

	private void increaseDogsAge(ArrayList<Dog> dogs) {
		System.out.print("Skriv hundens namn för att öka ålder: ");
		String name = keyboard.nextLine();

		//boolean dogIsFound = dogExists(name, dogs);
        Dog currentDog = getCurrenDog(name, dogs);
		if (currentDog != null) {
			currentDog.increaseAge();
			System.out.println("Hundens " + currentDog.getName() + "  ålder har stigit!");
		} else {
			System.out.println("Fel! Hund med det namnet fanns ej i registret");
		}
	}

	private void removeDog(ArrayList<Dog> dogs) {
		System.out.print("Skriv hundens namn för att ta bort hunden: ");
		String name = keyboard.nextLine();

		//boolean dogIsFound = dogExists(name, dogs);
        Dog currentDog = getCurrenDog(name, dogs);
		if (currentDog != null) {
			dogs.remove(currentDog);
			System.out.println("Hunden med det angivna namnet " + currentDog.getName() + " är borttagen");
		} else {
			System.out.println("Fel! Hund med det namnet fanns ej i registret");
		}
	}

	public static void main(String[] args) {
		DogRegister register = new DogRegister();
		String command = "";

		ArrayList<Dog> dogs = new ArrayList<>();
		// adds default values
		dogs.add(new Dog("Rolf", "Tax", 3, 3.2));
		dogs.add(new Dog("Archibald", "Labrador", 5, 67));
		dogs.add(new Dog("Malvina", "Pomeranian", 8, 7));
		dogs.add(new Dog("Alf", "Siberian husky", 4, 25));
		dogs.add(new Dog("Violetta", "Akita", 5, 9));

		while (!command.equalsIgnoreCase("Exit") || !command.equalsIgnoreCase("Q")) {
			System.out.print(
					"Ange ett kommando (register new dog/R, increase age/I, list dogs/L, remove dog/D, exit/Q): ");
			command = keyboard.nextLine();
			if (command.equalsIgnoreCase("register new dog") || command.equalsIgnoreCase("R")) {

				register.registerNewDog(dogs);

			} else if (command.equalsIgnoreCase("increase age") || command.equalsIgnoreCase("I")) {

				register.increaseDogsAge(dogs);

			} else if (command.equalsIgnoreCase("list dogs") || command.equalsIgnoreCase("L")) {
				
				register.listDogs(dogs);

			} else if (command.equalsIgnoreCase("remove dog") || command.equalsIgnoreCase("D")) {

				register.removeDog(dogs);

			} else if (command.equalsIgnoreCase("exit") || command.equalsIgnoreCase("Q")) {
				break;
			} else {
				System.out.println("Fel kommando! ");
				continue;
			}

			System.out.print("\n");

		}

		keyboard.close();

		System.out.println("Programmet är stängt!");
	}

}
