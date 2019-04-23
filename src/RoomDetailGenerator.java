import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		double length, width, area, perimeter;
		String prompt;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");

		do {
			System.out.println("");
			System.out.println("Enter Length:");
			length = scan.nextDouble();
			System.out.println("Enter Width :");
			width = scan.nextDouble();
			area = length * width;
			perimeter = 2 * (length + width);
			System.out.println("Area :" + area);
			System.out.println("Perimeter :" + perimeter);
			System.out.println("");
			System.out.println("Continue?(y/n):");
			System.out.println("");
			prompt = scan.next();
		} while (prompt.equalsIgnoreCase("Y"));
		scan.close();

	}

}
