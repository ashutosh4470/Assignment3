import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling3 {
    public static void main(String[] args) throws IOException {
        try{
        FileReader fr = new FileReader("temp");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("temp3",false);
        BufferedWriter bw = new BufferedWriter(fw);

        String str ;
        while((str = br.readLine())!= null){
            // System.out.println(str);
            bw.write(str);
            bw.newLine();
        }
        System.out.println("Copying Successfull");
        
        bw.close();
        fw.close();
        br.close();
        fr.close();
        

    }catch(Exception e){
        e.printStackTrace();
    }
    }
}

