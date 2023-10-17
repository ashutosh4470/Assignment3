/* Write a java program to do following operations on Array List(Integer)
a)	Add element
b)	Remove a particular element
c)	Modify
d)	View All elements(Use Iterator)
e)	View a Particular element (get() )
f)	Sort (Collections.sort)
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListQ1{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        int element = 0;
        int idx = 0;

        do{
            System.out.println("Enter your choice\n1.Add element\n2.Modify Element\n3.Remove Element\n4.DisplayAll\n5.DisplayPerticular\n6.sort\n0.Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1: System.out.print("Enter Element : ");
                        element = sc.nextInt();
                        arr.add(element);
                        break;

                case 2: System.out.print("Enter index : ");  
                        idx = sc.nextInt();
                        System.out.print("Enter element :");
                        element = sc.nextInt();
                        arr.set(idx,element);
                        System.out.println();
                        break;

                case 3: System.out.print("Enter index : ");
                        idx = sc.nextInt();
                        arr.remove(idx);
                        System.out.println();
                        break;
                    
                case 4: Iterator it = arr.iterator();
                        while(it.hasNext())
                            System.out.print(it.next()+ " ");
                            System.out.println();
                            System.out.println();

                        break;

                case 5: System.out.print("Enter elements : ");
                        element = sc.nextInt();
                        System.out.println("The element are at "+arr.indexOf(element)+ " Position.");
                        break;

                case 6:
                        Collections.sort(arr);
                        System.out.println("Sorting Done ...");
                        System.out.println();
                        break;
                case 0:break;
                default : System.out.println("Invalid Input");
            }

        }while(0 != choice);
        sc.close();
    }
}