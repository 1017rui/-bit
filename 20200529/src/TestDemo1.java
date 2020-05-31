import java.util.HashMap;

/**
 * @author 张瑞瑞
 * @date 2020/05/29 19:47
 */
class HashBuck{
    static class Node{
        public int key;
        public int val;
        public Node next;
        public Node(int key,int val){
            this.key=key;
            this.val=val;
        }
    }
    public Node []array=new Node[10];
    public int usedSize;
    public void put(int key,int val){
        //1.通过设计的哈希函数找到对应的位置。
        int index=key%array.length;
        for(Node cur=array[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                //更新
                cur.val=val;
                return;
            }
        }
        Node node=new Node(key,val);
        node.next=array[index];
        array[index]=node ;
        this.usedSize ++;
        if(loadFactor()>0.75){
            resize();
        }
    }
    public void resize (){
        //扩容  需要重新哈希
        Node[]newArray=new Node[2*this.array .length ];
        for(int i=0;i<array .length;i++){
            Node cur=array[i];
            while(cur!=null){
                Node curNext=cur.next;
                int index=cur.key%newArray .length;
                //以头插法的形式插入到newArray数组当中
                cur.next=newArray [index ];
                newArray[index]=cur;
                cur=cur.next;
            }
        }
        array =newArray ;

    }
    public double loadFactor(){
        //负载因子
        return this.usedSize*1.0/this.array.length;
    }
    public int get(int key){
        int index=key%array .length;
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
public class TestDemo1 {
    public static void main(String[] args) {
        //HashMap <Integer,Integer> hashMap =new HashMap<>() ;
        HashBuck hashBuck =new HashBuck() ;
        for(int i=1;i<7;i++){
            hashBuck .put(i,i);
        }
        hashBuck .put(11,11);
    }
}
