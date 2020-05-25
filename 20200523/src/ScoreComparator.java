import java.util.Comparator;

/**
 * @author 张瑞瑞
 * @date 2020/05/25 22:26
 */
public class ScoreComparator implements Comparator <Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.score-o2.score;
    }
}
