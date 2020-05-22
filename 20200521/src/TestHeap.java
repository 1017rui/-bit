import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/21 18:49
 */
public class TestHeap {//堆的底层是一个数组
    public int[]elem;
    public int usedSize;//数组长度
    public TestHeap (){//用于初始化数组
        this.elem=new int[10];
    }
    //向下调整(一次调整)
    //root代表每棵子树的开始位置，len为结束位置
    public void adjustDown(int root,int len) {
        int parent = root;//双亲结点
        int child = 2*parent+1;//孩子节点

        while (child <len) {//肯定有左孩子
            //0、判断是否有右孩子  有的话 找到最大值 Child下标表示最大值下标
            if(child+1<len){
                //说明有右孩子
               child= this.elem[child]>this.elem [child+1]?child:child+1;
            }
            //否则不做任何操作，child中仍是原来左孩子的下标
            //代码指向到这里，child表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //如果孩子节点大于根节点进行交换
                int tmp=this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=tmp;
                parent =child ;//双亲节点指向孩子节点
                child=2*parent+1;//孩子节点指向新的孩子节点
            }else {//孩子节点小于根节点 直接结束
                break;
            }
        }
    }
    //创建一个堆
    public void createHeap(int[] array){
        for(int i=0;i<array .length ;i++){
            this.elem[i]=array [i];
            this.usedSize ++;
        }
        //i子树的根节点下标  如果孩子节点为n，则根节点为（n-1）/2
        for(int i=(this.usedSize-1-1)/2;i>=0;i--){
            adjustDown(i,this.usedSize ) ;
        }
    }

    //在堆中插入一个元素
    public void push(int  val){
        //0.判断当前堆是否是满的  满了扩容
        if(this.isFull() ){
            this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
        }
        //1.放到数组的最后一个位置
        this.elem[this.usedSize]=val;
        this.usedSize ++;
        //2.进行调整
        adjustUp(this.usedSize-1);

    }
    public void adjustUp(int  child){
        int parent=(child-1)/2;
        while(child>0){
            if(this.elem[child]>this.elem[parent]){
                int tmp=this.elem[child];
                this.elem[child]=this.elem[parent];
                this.elem[parent]=tmp;
                child=parent;
                parent=(child-1)/2;
            }else{
                break;
            }
        }
    }
    public boolean isFull(){//判断当前堆是否满了
        return this.usedSize ==this.elem.length ;

    }
    //堆的删除
    public void pop(){
        //0.判断堆是否为空
        if(isEmpty() ){
            System.out.println("当前堆为空！");
            return;
        }
        //1.最后一个元素和堆顶元素进行交换
        int tmp=this.elem[0];
        this.elem[0]=this.elem[this.usedSize -1];
        this.elem[this.usedSize -1]=tmp;
        this.usedSize--;
        //2.调整0号下标这棵树
        adjustDown(0,this.usedSize) ;
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    //拿到堆头元素
    public int peek(){
        if(isEmpty() ){
            System.out.println("当前堆为空！");
            return -1;
        }
        return this.elem[0];
    }
    //从小到大排序  使用大根堆 从大到小 使用小根堆
    public void heapSort(){
        int end=this.usedSize-1;//指向最后一个元素
        while(end>0){
            int tmp=this.elem[0];
            this.elem[0]=this.elem[end];
            this.elem[end]=tmp;
            adjustDown(0,end);
            end--;
        }
    }
    public void show(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

}
