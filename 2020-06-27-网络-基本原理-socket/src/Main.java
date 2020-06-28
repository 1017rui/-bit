/**
 * @author 张瑞瑞
 * @date 2020/06/27 17:58
 */
import java.util.*;

 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        //先将链表转换为数字然后相加  完了之后将结果在转换成链表
        int a1=0;
        int b1=0;
        int flg=0;
        while(a!=null){
            a1+=(a.val)*(int)Math.pow(10,flg++);
            a=a.next;
        }
        flg=0;
        while(b!=null){
            b1+=(b.val)*(int)Math.pow(10,flg++);
            b=b.next;
        }
        int sum=a1+b1;
        char[] charArr=String.valueOf(sum).toCharArray() ;
        //String.valueOf(sum)是将数字转化成字符串
        //之后.toCharArray()转换成字符数组
        ListNode ret=new ListNode(-1);//虚拟节点
        ListNode tmp=ret;
        for(int i=charArr.length-1;i>=0;i--){
            ListNode newNode=new ListNode(Integer.parseInt(charArr[i]+""));//Integer.parseInt（）是将字符串转化为数字
            tmp.next=newNode;
            tmp=newNode;
        }
        return ret.next;
    }
}