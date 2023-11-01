import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2{
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("temp");
        BufferedReader br = new BufferedReader(fr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String gstr = sc.next();

        boolean found = false;
        String str = "";
        while((str = br.readLine()) != null)
        {
            if(gstr.equals(str.toLowerCase())){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Founded");
        }
        else System.out.println("Not founded");

        sc.close();
        br.close();
    }
}