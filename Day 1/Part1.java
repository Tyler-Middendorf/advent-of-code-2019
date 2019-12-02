import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
class Part1 {
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
        counter++;
        System.out.print(counter+" : "+ans+"||");
        ans+=(Integer.parseInt(line)/3-2);
        if(buff%5==0)
          System.out.print("\n||");
        line = br.readLine();
      }
    String everything = sb.toString();}
    finally {
      br.close();
    }
    System.out.println(("\nfinat")+" = "+ans);
  }
}
