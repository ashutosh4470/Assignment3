
public class Player {
	int id;
	String player;
	int totalRun;
	int wickets;
	int matches;
	String country;
	int century;
	String category;
	
	
	public Player(int id,String player, int totalRun, int wickets, int matches, String country, int century, String category) {
		this.id = id;
		this.player = player;
		this.totalRun = totalRun;
		this.wickets = wickets;
		this.matches = matches;
		this.country = country;
		this.century = century;
		this.category = category;
	}
	

	public void displayPlayer()
	{
		System.out.print("Player id : "+id);
		System.out.print(",  Player : "+player);
		System.out.print(",  Total Run : "+totalRun);
		System.out.print(",  Wickets : "+wickets);
		System.out.print(",  matches : "+matches);
		System.out.print(",  country : "+country);
		System.out.print(",  century : "+century);
		System.out.print(",  category : "+category);
		System.out.println();
		
	}
	
	 public String getName() {
	        return player;
	    }
	
}
