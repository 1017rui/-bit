import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/23 16:40
 * 实现一个堆
 */
public class TestHeap {//堆的底层是一个数组
    public int[] elem;
    public int usedSize;
    public TestHeap(){
        //初始化数组
        this.elem=new int[10];
    }
    //创建一个堆
    public void createHeap(int[] array){
        //首先把array数组中的值全部拷贝到elem数组当中
        for(int i=0;i<array.length;i++){
            this.elem[i]=array[i];
            this.usedSize++;
        }
        //调整为大根堆

        for(int i=(this.usedSize -1-1)/2;i>=0;i--){
            adjustDown(i,this.usedSize) ;
        }
    }
    //root 根节点
    //len 数组的长度  结束的位置
    public void adjustDown(int root,int len){//向下调整
        int parent=root;
        int child=2*root+1;
        while (child<len){
            //能进入这个循环说明该节点肯定有左孩子
            //现在判断是否有右孩子
            if(child+1<len){
                //始终保持child当中存放的元素是左右孩子的最大值
                if (this.elem[child]<this.elem[child+1]){
                    child++;
                }
            }
            if(this.elem[parent ]<this .elem[child]){
                //进行交换
                int tmp=this.elem [parent];
                this.elem[parent]=this.elem[child];
                this.elem[child]=tmp;
                parent=child;
                child=2*parent+1;
            }else{
                break;
            }
        }
    }
    //在堆中插入一个元素
    public void push(int val){
        if(this.isFull() ){
            //进行扩容
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        //插入最后一个位置
        this.elem[this.usedSize ]=val;
        this.usedSize ++;
        //进行向上调整
        adjustUp(this.usedSize-1) ;
    }
    public void adjustUp(int child){
        int parent=(child-1)/2;
        while(child >0){
            if(this.elem[parent ]<this.elem[child]){
                int tmp=this.elem[parent ];
                this.elem[parent ]=this.elem[child];
                this.elem[child]=tmp;
                child=parent ;
                parent =(child-1)/2;
            }else{
                break;
            }
        }

    }
    //在堆中删除一个元素
    public void pop(){
        //判断是否为空
        if(this.isEmpty() ){
            System.out.println("堆为空！");
            return ;
        }
        //交换堆头和堆尾的元素
        int tmp=this.elem[0];
        this.elem[0]=this.elem[this.usedSize-1];
        this.elem[this.usedSize-1]=tmp;
        //删除堆尾
        this.usedSize--;
        //将堆重新调整尾大根堆
        adjustDown(0,this.usedSize) ;
    }
    //拿到堆首元素
    public int peek(){
        if(this.isEmpty() ){
            System.out.println("堆为空！");
            return -1;
        }
        return this.elem[0];
    }
//使用大根堆进行从小到大的排序
    public void heapSort(){
        int end=this.usedSize-1;
        while(end>0){
            //交换堆头和end的元素
            int tmp=this.elem[0];
            this.elem[0]=this.elem[end];
            this.elem[end]=tmp;
            //将剩余的元素再次调整为大根堆
            adjustDown(0,end) ;
            end--;
        }
    }
    public boolean isEmpty(){
        return this.usedSize==0;
    }
    public boolean isFull(){
        return this.usedSize==this.elem.length;
    }
    public void show(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
}
