/**
 * @author 张瑞瑞
 * @date 2020/05/30 11:55
 */
class HashBuck{

    static class Node{
        public int key;
        public int val;
        public Node next;
        //提供构造方法
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array=new Node[10];
    public int usedSize;

    public void put(int key,int val){
        //1.通过设计的哈希函数找到对应的位置
        int index=key%array.length;
        //2.遍历array[index]下标下的这个链表，判断是否之前put进去过key值
        //如果有，将key值对应的val值更新。
        //没有，将其头插法插入这个链表当中。
        for(Node cur=array[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                //更新
                cur.val=val;
                return;
            }
        }
        //否则，头插法插入这个链表
        Node node=new Node(key,val);
        node.next=array[index];
        array[index]=node;
        this .usedSize++;

        if(loadFactor()>0.75){
            resize();
        }
    }
    public void resize (){
        //进行扩容（二倍扩容）
        //扩容需要重新哈希
        Node[] newArray=new Node[2*this.array.length ];
        for(int i=0;i<array.length;i++){
            Node cur=array[i];
            while(cur!=null){
                //后面要修改，所以先记录下来  至关重要
                Node curNext=cur.next;
                //拿到要放入新数组的下标
                int index=cur.key%newArray.length;
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

    //根据key值返回对应的val值
    public int get(int key){
        int index=key%array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.key==key){
                return cur.val;
            }
            cur=cur.next;
        }
        return -1;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        HashBuck hashBuck =new HashBuck() ;
        for (int i = 1; i <8 ; i++) {
            hashBuck .put(i,i);
        }
        hashBuck .put(11,101);
        System.out.println(hashBuck.get(11));

    }
}
