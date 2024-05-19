import java.io.*;
import java.util.Scanner;

public class Hello {
  public static void main(String args[]) throws IOException{
    System.out.println("Enter your thing!");
    BufferedReader bf = null;
    int num = 0;
    try{
      bf = new BufferedReader(new InputStreamReader(System.in));
      num = Integer.parseInt(bf.readLine());
    }
    finally{
      bf.close();
    }
    System.out.println("Your num is " + num);
  };
};