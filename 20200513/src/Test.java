import java.util.*;

/**
 * @author 张瑞瑞
 * @date 2020/05/13 21:42
 */
//输入: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
//输出: 11
//员工1自身的重要度是5，他有两个直系下属2和3，而且2和3的重要度均为3。因此员工1的总重要度是 5 + 3 + 3 = 11。
//一个员工最多有一个直系领导，但是可以有多个直系下属
//员工数量不超过2000。

// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", importance=" + importance +
                ", subordinates=" + subordinates +
                '}';
    }
}

public class Test {
    public static int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee e: employees) {
            map.put(e.id, e);
        }
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        int result = 0;
        while (!queue.isEmpty()) {
            Employee e = queue.poll();
            result += e.importance;
            for (int subId: e.subordinates) {
                queue.offer(map.get(subId));
            }
        }
        return result;


    }
//在一个小镇里，按从 1 到 N 标记了 N 个人。传言称，这些人中有一个是小镇上的秘密法官。
//
//如果小镇的法官真的存在，那么：
//
//小镇的法官不相信任何人。
//每个人（除了小镇法官外）都信任小镇的法官。
//只有一个人同时满足属性 1 和属性 2 。
//给定数组 trust，该数组由信任对 trust[i] = [a, b] 组成，表示标记为 a 的人信任标记为 b 的人。
//
//如果小镇存在秘密法官并且可以确定他的身份，请返回该法官的标记。否则，返回 -1。
//示例 1：
//
//输入：N = 2, trust = [[1,2]]
//输出：2
//示例 2：
//
//输入：N = 3, trust = [[1,3],[2,3]]
//输出：3
//示例 3：
//
//输入：N = 3, trust = [[1,3],[2,3],[3,1]]
//输出：-1
//示例 4：
//
//输入：N = 3, trust = [[1,2],[2,3]]
//输出：-1
//示例 5：
//
//输入：N = 4, trust = [[1,3],[1,4],[2,3],[2,4],[4,3]]
//输出：3
 //分别用两个数组存储，一个用来存储入度数，也就是相信你的人的个数，数组下标就是代表该人，1到N
//另外一个用来存储出度数，也就是你相信的人的个数
//入度数等于N-1，出度数为0，则这个人就是法官，否则无法确定法官。
//用时：128ms，内存消耗16MB
public int findJudge(int N, int[][] trust) {
    int[] trustyou =new int[N];
    int[] youtrust =new int[N];
    for(int[] array:trust ){
        int start=array[0];
        int end=array[1];
        youtrust [start]++;
        trustyou [end]++;
    }
    for(int i=1;i<=N;i++){
        if(trustyou [i]==N-1&&youtrust [i]==0){
            return i;
        }
    }
    return -1;


}

    public static void main(String[] args) {
        MyLinkedList my=new MyLinkedList() ;
        /*my.addAtHead(12);
        my.addAtHead(13);
        my.addAtHead(14);
        my.addAtHead(15);
        my.addAtHead(16);*/
        my.addAtTail(23) ;
        my.addAtTail(24) ;
        my.addAtTail(25) ;
        my.addAtTail(26) ;
        my.addAtTail(27) ;
        my.addAtIndex(1,111);
        my.deleteAtIndex(1) ;
        System.out.println(my.get(4));
        my.display() ;

    }
    public static void main2(String[] args) {
       int N=4;
       int[][] trust=new int[3][2];
    }
    public static void main1(String[] args) {
        List<Employee> list=new ArrayList<>() ;
        List<Integer> list1=new ArrayList<>() ;
        List<Integer> list2=new ArrayList<>() ;
        List<Integer> list3=new ArrayList<>() ;
        list1.add(2);
        list1 .add(3);

        Employee employee1=new Employee(1,15,list1) ;
        Employee employee2=new Employee(2,10,list2) ;
        Employee employee3=new Employee(3,5,list3) ;

        list.add(employee1 );
        list.add(employee2 );
        list.add(employee3 );
        System.out.println(list);

        System.out.println(getImportance(list, 1));

    }
}
