import java.util.*;
import java.util.stream.Stream;

public class Hello {
  public static void main(String args[]){
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    
    int res = nums.stream().filter(n -> n%2 == 0).map(n -> n*2).reduce(0, (nl,nw)-> nl+nw);
    
    System.out.println(res);
  };
};