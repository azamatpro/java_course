import java.io.*;
import java.util.Scanner;

public class Hello {
  public static void main(String args[]) throws IOException{
    System.out.println("Enter your thing!");
    int num = 0;

    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferedReader bf = new BufferedReader(in); 
    Scanner sc = new Scanner(System.in);
    
    num = sc.nextInt();

    System.out.println(num);
  };
};