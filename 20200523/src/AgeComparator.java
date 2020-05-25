import java.util.Comparator;

/**
 * @author 张瑞瑞
 * @date 2020/05/25 22:22
 */
public class AgeComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.age-o1.age;
    }
}
