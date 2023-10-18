import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> l_list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int idx,ele=0;
        int choice = -1;

        do {
            System.out.println("Enter Your choice :\n1.InsertAtBegining\n2.InsetGivenPosition\n3.InsertAtLast\n4.DeleteAtBegining\n5.DeleteGivenPosition\n6.DeleteLast\n7.ReverseLinkedList\n8.Display\n0.exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:System.out.print("Enter Element :");
                        ele = sc.nextInt();
                        l_list.addFirst(ele);
                    break;

                case 2:System.out.print("Enter index :");
                        idx= sc.nextInt();
                        System.out.print("Enter element :");
                        ele = sc.nextInt();
                        l_list.add(idx,ele);
                    break;
                
                case 3:System.out.print("Enter Element :");
                        ele = sc.nextInt();
                        l_list.addLast(ele);
                    break;

                case 4:l_list.removeFirst();
                    break;

                case 5:System.out.print("Enter Index :");
                        idx = sc.nextInt();
                        l_list.remove(idx);
                    break;

                case 6:l_list.removeLast();
                    break;
                
                case 7:Collections.reverse(l_list);
                    break;
                
                case 8:for(Integer i : l_list){
                    System.out.print(i+" ");
                    }
                    System.out.println();
                    break;
                case 0:break;
                default:System.out.println("Invalid Input Try again........");
                    break;
            }
        } while (0 != choice);
        sc.close();
    }
}
