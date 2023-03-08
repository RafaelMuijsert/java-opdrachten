package Week5;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Opdracht 1: Verpakkingen

		Verpakking verpakking1 = new Verpakking(3, 3, 3, true);
		Verpakking verpakking2 = new Verpakking(1, 2, 3, false);
		Verpakking verpakking3 = new Verpakking(1, 2, 3, true);
		Verpakking verpakking4 = new Verpakking(3, 1, 2, false);
		Verpakking verpakking5 = new Verpakking(3, 2, 1, true);

		System.out.println(verpakking4.equals(verpakking1));
		System.out.println(verpakking4.equals(verpakking2));
		System.out.println(verpakking3.equals(verpakking5));

		// Opdracht 2: Strings
		String teVergelijkenMet = "Java";



		Scanner in = new Scanner(System.in);

		System.out. println(
				"input (te vergelijken met: \"" + teVergelijkenMet + "\" :");



		String gebruikerInput = in. nextLine();

		System.out. println("je input was: \"" + gebruikerInput + "\"");

		System.out.println(gebruikerInput == teVergelijkenMet);
		System.out.println(gebruikerInput.equals(teVergelijkenMet));

		// Opdracht 3: Bestaande equals begrijpen

		GekDing gekDing1 = new GekDing(5);
		GekDing gekDing2 = new GekDing(6);
		GekDing gekDing3 = new GekDing(5);

		System.out.println("Gekke dingen");

		System.out.println(gekDing1.equals(gekDing2));
		System.out.println(gekDing1.equals(gekDing3));
		System.out.println(gekDing2.equals(gekDing1));
		System.out.println(gekDing1.equals(null));

		/* gekDing1.equals(gekDing2) is true als:
		gekDing2 is null
		gekDing1.waarde is groter dan gekDing2.waarde
		gekDing1.waarde is 1 en gekDing2.waarde is -1
		*/
	}
}
