import java.util.*;

public class Hello {
  public static void main(String args[]){
    List<Integer> nums = new ArrayList<>();

    nums.add(45);
    nums.add(981);
    nums.add(7);
    nums.add(18);

    Comparator<Integer> com = new Comparator<>(){
      public int compare(Integer i, Integer j){
        if(i % 10 > j % 10)
          return 1;
        else
          return -1;
      }
    };

    Collections.sort(nums,com);

    System.out.println(nums);

  };
};