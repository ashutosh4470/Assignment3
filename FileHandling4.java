import java.io.IOException;
import java.util.Scanner;
public class FileHandling4 {
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
       int choice = -1;
       do{
            System.out.println("Enter choice\n1.WriteObject\n2.ReadObject\n3CheckResult\n4.ResultCount\n0.Exit");
            choice = sc.nextInt();

        switch(choice)
        {
            case 1:ManageFH4.writeObj();
                   break;
            
            case 2:ManageFH4.readObj();
                   break;

            case 3:ManageFH4.checkResult();
                    break;

            case 4:System.out.print("Enter Subject:");
                    String sub = sc.next();
                    ManageFH4.ResultCount(sub);
                    break;

            case 0:break;
            default:System.out.println("Invalid Choice");
        }
       }while(0 != choice);
       sc.close();
    }
}
