public  class Book {
	String name;
	int price;
	String authorName;
	int bookno;
	String publication;

	Book(String name, int price, String authorName, int bookno, String publication) {
		this.name = name;
		this.price = price;
		this.authorName = authorName;
		this.bookno = bookno;
		this.publication = publication;
	}

	public void dispBook() {
		System.out.println("name=" + name + ", price=" + price + ", authorName=" + authorName + ", bookno="
				+ bookno + ", publication=" + publication );
	}
	
	public int getBookno() {
        return bookno;
    }

	public void setPrice(double price){
		this.price =(int) price;
	}

	public String getPublication(){
		return publication;
	}
}
