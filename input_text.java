import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;

class input_text{
  public static void main(String[] args){
    try{
      File file = new File("input.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
      String[] data = new String[10000];
      int data_line = 0;
      //data read and set and output
      while((data[data_line] = br.readLine()) != null){
        System.out.println(data[data_line]);
        data_line++;
      }
      //data_line output
      System.out.println(data_line);
      br.close();

      Scanner sc = new Scanner(System.in);
      System.out.println("");
      boolean input_judge = false;
      while(input_judge == false){
        System.out.println("where do you want to add?");
        int sc_int = sc.nextInt();
        if(sc_int <= data_line && 0 < sc_int){
          input_judge = true;
        }else{
          System.out.println("it is not appropriate.");
        }
      }
      System.out.println("ok!");
      System.out.println("what do you want to add?");
      String sc_string = sc.next();

    }catch(IOException e){
      System.out.println("no file");
      return;
    }
  }
}
