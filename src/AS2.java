import java.util.Scanner;

public class AS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Messager m1 = new Messager("M1");
		Messager m2 = new Messager("M2");
		
		//send and get messages
		try {
			m1.connect(m2);
			System.out.println("Enter multiple sentences (enter an empty string to exit):");
			while (true) {
				String sentence = scanner.nextLine();
				if (sentence.isEmpty())
					break;
				else if(sentence.length()>111) {
					System.out.print("\nLimited characters please re-enter");
				}else 
				m1.send(sentence);
			}
			m2.receive();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		scanner.close();
		//display messages of m2
		m2.printAll();
	}
}
