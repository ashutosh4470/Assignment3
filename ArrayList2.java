
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Player> al = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int choice = -1;
		do {
			System.out.println(
					"Enter Your Choice\n1.Add\n2.Update\n3.sortByName\n4.Remove<100\n5.DisplayMax\n6.DisplayAll\n0.Exit\n");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				al = ManagePlayer.addPlayer();
				break;

			case 2:
				ManagePlayer.updatePlayer(al);
				break;

			case 3:
				ManagePlayer.sortPlayer(al);
				break;

			case 4:
				ManagePlayer.removePlayer(al);
				break;

			case 5:
				ManagePlayer.dispMax(al);
				break;

			case 6:
				ManagePlayer.dispPlayer(al);
				break;

			case 0:
				break;
			default:
				System.out.println("Invalid Input");
			}
		} while (0 != choice);

	}
}
