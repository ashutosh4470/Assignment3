import java.util.Map;
import java.util.HashMap;

public class ManageBook {

	static HashMap<Integer, Book> hmap = new HashMap<>();
	
	static Book b1 = new Book("Java", 200, "Chetan", 1001, "Vision");
	static Book b2 = new Book("c++", 220, "Ram", 1002, "Durga");
	static Book b3 = new Book("C programming", 150, "Rishabh", 1003, "Vision");
	static Book b4 = new Book("Scala", 280, "Pratik", 1004, "BalBharti");
	static Book b5 = new Book("Mysql", 160, "Avishkar", 1005, "textPub");
	
	public static HashMap<Integer, Book> addBook() {
		hmap.put(b1.getBookno(), b1);
		hmap.put(b2.getBookno(), b2);
		hmap.put(b3.getBookno(), b3);
		hmap.put(b4.getBookno(), b4);
		hmap.put(b5.getBookno(), b5);
		
		return hmap;
	}

	static void displayBook(HashMap<Integer, Book> hmap) {
		for (Map.Entry<Integer, Book> entry : hmap.entrySet()) {
			Book b = entry.getValue();
			b.dispBook();
		}
	}

	public static void displayByKey(int key) {
		if (hmap.containsKey(key)) {
			Book b = hmap.get(key);
			b.dispBook();
		} else {
			System.out.println("No book found with the given key.");
		}
	}
	
	public static void reducePrice(String publication){
		for(Map.Entry<Integer,Book> entry : hmap.entrySet()){
			Book b = entry.getValue();
			if(b.getPublication().equals(publication)){
				int currentPrice = b.price;
				double newPrice = currentPrice - (currentPrice * 0.1);
				b.setPrice(newPrice);
			}
		}
		}
	}

