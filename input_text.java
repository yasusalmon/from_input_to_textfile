import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

class input_text{
  public static void main(String[] args){
    try{
      File file = new File("input.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"Shift-JIS"));
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

      //data input
      Scanner sc = new Scanner(System.in);
      System.out.println("");
      boolean input_judge = false;
      int sc_int = 0;
      while(input_judge == false){
        System.out.println("where do you want to add?");
        sc_int = sc.nextInt();
        if(sc_int <= data_line && 0 < sc_int){
          input_judge = true;
        }else{
          System.out.println("it is not appropriate.");
        }
      }
      System.out.println("ok!");
      System.out.println("what do you want to add?");
      String sc_string = sc.next();
      sc_int--;
      data[sc_int] = data[sc_int] + sc_string + ",";
      System.out.println(data[sc_int]);
      FileWriter fw = new FileWriter(file);
      for(int i = 0;i<data_line;i++){
        fw.write(data[i]);
        fw.write("\r\n");

      }
      fw.close();

    }catch(IOException e){
      System.out.println("no file");
      return;
    }
  }
}
