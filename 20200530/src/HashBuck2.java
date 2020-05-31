import java.util.Objects;

/**
 * @author 张瑞瑞
 * @date 2020/05/30 12:42
 */

class Person{
    public int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
public class HashBuck2<K,V> {
    static class Node<K,V>{
       public K key;
       public V val;
       public Node<K,V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }
    public Node<K,V>[]array=(Node<K,V>[])new Node[10];
    public int usedSize;
    public void put(K key,V val){
        int hash=key.hashCode() ;
        int index=hash%array.length;
        for(Node<K,V> cur=array[index];cur!=null;cur=cur.next){
            //引用类型比较的时候切记不能使用==，要使用equals方法且这个方法是被重写过的
            if(cur.key.equals(key) ){
                //更新
                cur.val=val;
                return;
            }
        }
        //头插法插入
        Node<K,V> node=new Node<>(key,val);
        node.next=array[index];
        array[index]=node;
        this.usedSize++;

        if(loadFactor()>0.75){
            resize();
        }
    }
    public void resize (){
        //进行扩容（二倍扩容）
        //扩容需要重新哈希
        Node<K,V>[] newArray=(Node<K,V>[])new Node[2*this.array.length ];
        for(int i=0;i<array.length;i++){
           Node<K,V> cur=array[i];
            while(cur!=null){
                //后面要修改，所以先记录下来  至关重要
                Node<K,V> curNext=cur.next;
                //拿到要放入新数组的下标
                int hash=cur.key.hashCode() ;
                int index=hash%newArray.length;
                //头插到newArray[index]位置的链表
                cur.next=newArray [index];
                newArray [index]=cur;
                cur=curNext;
            }
        }
        //跳出这个循环之后  将所有的节点全部已经放入了newArray当中
        array=newArray ;
    }
    public double loadFactor (){
        //计算负载因子
        return this.usedSize*1.0/this.array.length;
    }
    public V get(K key){
        //1.找位置
        int hash=key.hashCode() ;
        int index=hash%array.length;
        Node<K,V> cur=array[index];
        //2.遍历单链表开始找  找到返回val值
        while(cur!=null){
            if(cur.key.equals(key) ){
                return cur.val;
            }
            cur=cur.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Person person1=new Person(12) ;
        Person person2=new Person(12) ;
        HashBuck2 <Person,String> map=new HashBuck2<>() ;
        map.put(person1 ,"王琳凯");
        System.out.println(map.get(person2));
    }

    public static void main1(String[] args) {
        Person person1=new Person(12) ;
        Person person2=new Person(12) ;
        System.out.println(person1 .hashCode() );
        System.out.println(person2 .hashCode() );
        System.out.println(person1 .equals(person2 ) );
        /*如果不重写hashCode()和equals()方法会有什么后果？
        *如果不重写hashCode()在哈希表中找对应的位置找不对
        * 如果不重写equals()找到位置，但在比较对象时发现相同的key值但程序认为是不一样的
         */


    }
}
