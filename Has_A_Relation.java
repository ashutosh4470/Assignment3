
class Author
{
    private String name;
    private String email;
    private char gender;

    Author(String name,String email,char gender)
    {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString() {
        return "Author [email=" + email + ", gender=" + gender + "]";
    }
}

class Book 
{
    private String name;
    private Author author;
    private double price;
    private int qty;

    Book(String name,Author author,double price,int qty)
    {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName()
    {
        return name;
    }

    public Author getAuthor()
    {
        return author;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQty()
    {
        return qty;
    }

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public String toString() {
        return "Book [name=" + name + ", author=" + author.getName() + ", price=" + price + ", qty=" + qty + "]";
    }
    
}


public class Has_A_Relation {
    public static void main(String[] args) {
        Author author = new Author("p.l.deshpande","pldeshpande@gmail.com",'M');
        Book book = new Book("book1",author,54.60,4);
        System.out.println("Book Name : "+book.getName());
        System.out.println("Author Name : "+book.getAuthor().getName());
        System.out.println("Author Email : "+book.getAuthor().getEmail());
        System.out.println("Author Gender: "+book.getAuthor().getGender());
        System.out.println("Book Price : "+book.getPrice());
        System.out.println("Book Quantity : "+book.getQty());
        System.out.println(book.toString());

    }
}