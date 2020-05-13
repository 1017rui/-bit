import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/05/13 0:31
 * 顺序表
 */

public class MyArrayList {
   public int[] elem;
   public int usedSize;
   public static final int capacity=10;//数组初始容量为10

    public MyArrayList() {
        this.elem=new int[capacity ];
        this.usedSize =0 ;
    }
//判断下标是否合法
    private void checkPos(int pos){
        if(pos<0||pos>=this.usedSize){
            throw new RuntimeException("下标不合法！") ;
        }
    }
    //在pos位置新增元素
    public void add(int pos,int data){
        //如果顺序表满了进行二倍扩容
        if(this.elem.length==this.usedSize ){
            this.elem= Arrays.copyOf(this.elem,2*this.usedSize) ;
        }
        //判断pos位置是否合法
       if(pos<0||pos>this.usedSize){
            throw new RuntimeException("下标不合法！") ;
        }

        for(int i=this.usedSize;i>pos ;i--){
            this.elem[i]=this.elem[i-1];
        }
        this.elem[pos]=data;
        this.usedSize ++;
    }
    //打印顺序表
    public void display(){
        for(int i=0;i<this.usedSize ;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //判断是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind ){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind ){
                return i;
            }
        }
        return -1;//表示顺序表中没有这个元素
    }
    private boolean isEmpty(){
        return this.usedSize ==0 ;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        //判断顺序表是否为空
        if(isEmpty() ){
            throw new RuntimeException("顺序表为空！") ;
        }
        this.checkPos(pos) ;
        return this.elem[pos];
    }
    //给pos位置的元素设置为value  相当于更新
    public void setPos(int pos,int value){
        this.checkPos(pos) ;
        this.elem [pos]=value;
    }
    //删除顺序表中的元素
    public void remove(int toRemove){
       int pos=this. search(toRemove) ;
       if(pos==-1){
           System.out.println("顺序表中没有你要删除的元素！");
           return;
       }
       for(int i=pos;i<this.usedSize-1 ;i++){
           this.elem[i]=this.elem [i+1];
        }
       this.usedSize--;
    }
    //获取顺序表的长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize =0;
    }
}
