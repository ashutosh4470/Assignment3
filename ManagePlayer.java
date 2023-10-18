import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
public class ManagePlayer {

	static ArrayList<Player> addPlayer(){
	Player p1 = new Player(1,"Virat",120,20,70,"India",9,null);
	Player p2 = new Player(2,"MS.Dhoni",150,40,110,"India",15,null);
	Player p3 = new Player(3,"Raina",90,20,60,"India",8,null);
	Player p4 = new Player(4,"K.L.Rahul",80,30,40,"India",11,null);
	Player p5 = new Player(5,"Rohit",90,35,90,"India",10,null);
	
	
	ArrayList<Player> arrlist = new ArrayList<>();
	
	arrlist.add(p1);
	arrlist.add(p2);
	arrlist.add(p3);
	arrlist.add(p4);
	arrlist.add(p5);
	
	return arrlist;
	}
	
	
	static void dispPlayer(ArrayList<Player> al) {
		for( Player p: al) {
			p.displayPlayer();
		}
	}
	
	static void updatePlayer(ArrayList<Player> al) {
		for(Player p : al) {
			if(p.century >= 10) {
				p.category = "A";
			}
			else
				p.category = "B";
		}
		System.out.println(" Update Successfully.....");
	}
	
	static void dispMax(ArrayList<Player> al) {
		Player max = al.get(0);
		for(Player p : al) {
			if(p.totalRun > max.totalRun ) {
				max = p;
			}
		}
		System.out.println("Player which has maximum runs: " + max.player);
	}
	
	static void sortPlayer(ArrayList<Player> al) {
	        Collections.sort(al, Comparator.comparing(Player::getName));
	        System.out.println("Sorting Successfully ......");
	}
	
	
	static void removePlayer(ArrayList<Player> al) {
		Iterator it = al.iterator();
		System.out.println("Removed Successfully....");
		while(it.hasNext()) {
			Player p =(Player) it.next();
			if(p.totalRun < 100) {
				it.remove();
			}
		}
	}
	
	

}

















