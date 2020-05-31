import java.util.HashMap;

/**
 * @author 张瑞瑞
 * @date 2020/05/31 16:11
 */

class MyHashMap {
    class Node{
        public int key;
        public int value;
        public Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public Node[] array;
    public int usedSize;
    /** Initialize your data structure here. */
    public MyHashMap() {
       array=new Node[1024];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int index=key%array.length;
        for(Node cur=array[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                //需要更新
                cur.value=value;
                return;
            }
        }
        //头插法插入
        Node node=new Node(key,value);
        node.next=array[index];
        array[index]=node;
        this.usedSize++;
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index=key%array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.key==key){
                return cur.value;
            }
            cur=cur.next;
        }
    return -1;//没有找到
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int index=key%array.length;
        Node cur=array[index];

        Node prev=cur;
        while(cur!=null){
            if(cur.key==key){
                //链表的第一个节点为要删除的节点
                if(prev.key==cur.key){
                    array[index]=cur.next;
                }else{
                    prev.next=cur.next;
                }

                return;

            }
            prev=cur;
            cur=cur.next;
        }
    }
}


