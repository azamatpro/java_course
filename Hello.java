import java.util.*;

public class Hello {
  public static void main(String args[]){
    //Set<Integer> nums = new HashSet<Integer>(); // makes valuse unique
    Set<Integer> nums = new TreeSet<Integer>(); // makes values unique and sorts

    nums.add(199);
    nums.add(23);
    nums.add(38);
    nums.add(42);
    nums.add(42);

    Iterator<Integer> values = nums.iterator();
    while(values.hasNext()) System.out.println(values.next());

  };
};