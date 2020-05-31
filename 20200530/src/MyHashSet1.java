/**
 * @author 张瑞瑞
 * @date 2020/05/31 22:14
 */
//数组+双向链表 实现
class MyHashSet1 {
    class Node{
        public int val;
        public Node prev;
        public Node next;
        public Node(int val){
            this.val=val;
        }

    }
Node[] array=new Node[100];
    /** Initialize your data structure here. */
    public MyHashSet1() {

    }

    public void add(int key) {
        int index=key%array.length ;
        Node cur=array[index];
        Node node=new Node(key);
        //如果该下标下的链表是第一次add元素
        if(cur==null){
          array[index]=node;
          return;
        }
       while(cur.next!=null){
            if(cur.val==key){
                //已经存在一个值为val的节点了，无须再次插入。
                return;
            }
            cur=cur.next;
        }

        node.prev=cur;
        cur.next=node;
    }

    public void remove(int key) {
        int index=key%array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.val==key){
                //找到要删除的节点
                if(cur==array[index]){
                    if(cur.next!=null) {
                        cur.next.prev = null;
                    }
                    array[index]=cur.next;
                    return;
                }
                Node prevCur=cur.prev ;
                Node nextCur=cur.next ;
                if(prevCur !=null) {
                    prevCur.next = nextCur;
                }
                if(nextCur !=null) {
                    nextCur.prev = prevCur;
                }
                return;
            }
            cur=cur.next;
        }
        //没有需要删除的节点
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index=key%array.length;
        Node cur=array[index];
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
}

