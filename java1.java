// import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// so sánh hashset với treeset trong java
public class java1 {
  public static void main(String[] args) {
    List<Integer> set = new ArrayList<>();
    set.add(1);
    set.add(2);
    set.add(1);
    set.add(6);
    set.add(5);
    set.add(2);
    set.add(1);
    set.add(21);
    set.add(5);
    set.add(10);
    set.add(1);
    set.add(6);
    set.add(5);
    set.add(2);
    
    System.out.println(set);

    Set<Integer> set2 = new TreeSet<Integer>(set);
    
    System.out.println(set2);
  }
}