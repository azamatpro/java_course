import java.util.*;

public class Hello {
  public static void main(String args[]){
    List<Integer> nums = new ArrayList<Integer>();

    // nums.add(1);
    // nums.add(2);
    // nums.add(3);
    // nums.add(4);

    //System.out.println(nums.indexOf(2)); // to get index of value
    //System.out.println(nums.indexOf(0)); // to get value of index
    for(int i = 0; i< 10; i++){
      nums.add(i + 1);
    }
    System.out.println(nums);
  };
};