import java.io.*;
import java.util.Scanner;

public class Hello {
  public static void main(String args[]) throws IOException{
    System.out.println("Enter your thing!");
    int num = 0;
    try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
      num = Integer.parseInt(bf.readLine());
    }
    System.out.println("Your num is " + num);
  };
};