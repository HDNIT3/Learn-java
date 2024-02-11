import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// so sánh hashset với treeset trong java
public class java1 {
  public static void main(String[] args) {
    Set<Integer> set = new HashSet<Integer>();
    set.add(1);
    set.add(2);
    set.add(1);
    set.add(6);
    set.add(5);
    set.add(2);
    
    System.out.println(set);

    Set<Integer> set2 = new TreeSet<Integer>();
    set2.add(1);
    set2.add(2);
    set2.add(1);
    set2.add(6);
    set2.add(5);
    set2.add(2);
    
    System.out.println(set2);
  }
}