import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Smith Gameti");
		System.out.println("Programming Assignment 4 - SET\n");

		Set set = new Set();
		String choice = "";

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("Enter Command: ");
			choice = scanner.nextLine();

			String term[] = choice.split(" ");

			if (term.length == 2) {
				if (term[0].trim().equalsIgnoreCase("add")) {
					try {
						int number = Integer.parseInt(term[1]);
						set.add(number);
						System.out.println(set);
					} catch (Exception e) {
						System.out.println("Invalid input, try again");
					}
				} else if (term[0].trim().equalsIgnoreCase("del")) {
					try {
						int number = Integer.parseInt(term[1]);
						set.delete(number);
						System.out.println(set);
					} catch (Exception e) {
						System.out.println("Invaid input, try again");
					}
				} else if (term[0].trim().equalsIgnoreCase("exists")) {
					try {
						int number = Integer.parseInt(term[1]);
						System.out.println(set.exists(number));
					} catch (Exception e) {
						System.out.println("Invaid input, try again");
					}
				} else {
					System.out.println("Invlaid Commanad");
				}
			} else {
				System.out.println(" Usage should be <command><space><number>");
			}
		}

	}

}
