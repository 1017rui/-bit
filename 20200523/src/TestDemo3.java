import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 张瑞瑞
 * @date 2020/05/25 20:28
 * 比较器
 */
class Person{
    public String name;
    public int age;
    public int score;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        AgeComparator ageComparator =new AgeComparator() ;
        //优先级队列 默认小堆 放到里面的对象需要可以比较否则会报错
        PriorityQueue<Person> priorityQueue =new PriorityQueue<>(ageComparator) ;
        priorityQueue .offer(new Person("bit",16,89));
        priorityQueue .offer(new Person("gaobo",26,66));
        System.out.println(priorityQueue );

    }
    public static void main1(String[] args) {
        Person person1=new Person("bit",16,89);
        Person person2=new Person("gaobo",26,66);
        //比较器
        AgeComparator ageComparator =new AgeComparator();
        System.out.println(ageComparator.compare(person1, person2));
        ScoreComparator scoreComparator =new ScoreComparator() ;
        System.out.println(scoreComparator .compare(person1 ,person2 ));

    }
}
