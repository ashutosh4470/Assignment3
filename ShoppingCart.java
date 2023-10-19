import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    ArrayList<String> cart = new ArrayList<>();

    public void addItem(String item) {
        cart.add(item);
        System.out.println(item +" Added to Cart..");
    }

    public void removeItem(String item) {
        if(cart.remove(item)){
            System.out.println(item+" Item Removed..");
        }else
        System.out.println(item+" not found in cart..");

    }

    public void emptyCart() {
        cart.removeAll(cart);
        System.out.println("Cart is Empty now");
    }

    public void viewItems() {
        for (String items : cart) {
            System.out.println(items);
        }
    }

    public void viewShopItems(ArrayList<String> shop) {
        for (String items : shop) {
            System.out.println(items);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Bag");
        cart.add("BeautyProducts");
        cart.add("dress");
        cart.add("shoes");
        cart.add("bucket");
        cart.add("Socket");

        ShoppingCart sCart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("---------------------------------");
            System.out.println(
                    "Enter Your choice :\n1.viewShopsItems\n2.addItem\n3.removeItem\n4.viewItems\n5.emptyCart\n0.exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("----Shops Items----");
                    sCart.viewShopItems(cart);
                    break;

                case 2:
                    System.out.print("Enter Item :");
                    String item = sc.next();
                    sCart.addItem(item);
                    break;

                case 3:
                    System.out.print("Enter Item :");
                    item = sc.next();
                    sCart.removeItem(item);
                    break;

                case 4:
                    System.out.println("----Cart Items----");
                    sCart.viewItems();
                    break;

                case 5:
                    sCart.emptyCart();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

        } while (0 != choice);

    }
}
