import java.util.*;

public class Hello {
  public static void main(String args[]){
    Map<String, Integer> students = new HashMap<String, Integer>();

    students.put("Azamat",90);
    students.put("Aziz",74);
    students.put("Bakhodir",89);
    students.put("Farrukh",83); // puts new element

    students.remove("Rafikh",80); // removes
    students.remove("Rafikh",90);

    System.out.println(students);

    System.out.println(students.values()); // return values of map in list
    System.out.println(students.keySet()); // return keys of map in list

    for(String key: students.keySet()){
      System.out.println(key + " - " + students.get(key));
    }

  };
};