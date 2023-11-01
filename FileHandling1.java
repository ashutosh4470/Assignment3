import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling1 {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("temp");
        BufferedReader br = new BufferedReader(fr);
        int charcnt = 0;
        int wordcnt = 0;
        int linecnt = 0;
        String str ;
        try{
        while((str = br.readLine())!=null){
            System.out.println(str);
            linecnt++;
            charcnt += str.length();
            String[] words = str.split(" ");
            wordcnt += words.length;
        }
        System.out.println("\nCharacters :"+charcnt);
        System.out.println("Words :"+wordcnt);
        System.out.println("Lines :"+linecnt);

        br.close();
    }catch(IOException e){
        e.getMessage();
    }
    }
}
