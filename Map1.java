import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
	public static void main(String[] args) {
		HashMap<Integer, Book> hmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int key = 0;
		String publication = "";
		int choice = -1;

		do {
			System.out.println("Enter your choice:\n1.add\n2.display\n3.displayByKey\n4.ReducePrice\n0.exit");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					hmap = ManageBook.addBook();
					break;

				case 2:
					ManageBook.displayBook(hmap);
					break;

				case 3:
					System.out.print("Enter Key :");
					key = sc.nextInt();
					ManageBook.displayByKey(key);
					break;

				case 4:
					System.out.print("Enter Publication : ");
					publication = sc.next();
					ManageBook.reducePrice(publication);
					break;
				case 0:
					break;
				default:
					System.out.println("Invalid Input  try again ...");
			}
		} while (0 != choice);

		sc.close();
	}

}
