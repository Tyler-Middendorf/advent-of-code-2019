import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
class Part2 {
  public static void main(String[] args)throws IOException {
    System.out.println("Booting up!");
    int ans=0;
    int counter=0;
    int buff = 0;
    BufferedReader br = new BufferedReader(new FileReader("input.txt"));
    try {
      StringBuilder sb = new StringBuilder();
      String line = br.readLine();
      System.out.print("||");
      while (line != null) {
        buff++;
        sb.append(line);
        sb.append(System.lineSeparator());
        System.out.print(counter+" : "+ans+"||");
        //beginning of calculation
        int current=(Integer.parseInt(line)/3-2);
        while(current>=0){
          if(current>0)
            ans+=current;
          current=current/3-2;
        }
        //end of calculation!
        if(buff%5==0)
          System.out.print("\n||");
        counter++;
        line = br.readLine();
      }
    String everything = sb.toString();}
    finally {
      br.close();
    }
    System.out.println(("\nfinal")+" = "+ans);
  }
}
