import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/20 13:26
 */
public class ArraysList {
    public int[]elem;//数组
    public int usedSize;//有效数字个数
    public static int capacity=10;
    public ArraysList() {
        //调用构造函数初始化
        //初始化的顺序表长度为10
        this.elem=new int[capacity];
        //初始化的顺序表中有效数字个数为0
        this.usedSize=0;
    }
    //判断pos位置是否合法
    private void checkPos(int pos){
        if(pos<0||pos>this.usedSize){
            throw new RuntimeException("pos位置不合法！") ;
        }
    }
    public void display(){//打印顺序表
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    private boolean isFull(){
        return this.elem.length==this.usedSize;
    }
    public void add(int pos,int data){//在pos位置新增元素
        //如果顺序表已经满了，进行二倍扩容
        if(isFull()){
            this.elem= Arrays.copyOf(this.elem,2*this.usedSize);
        }

        checkPos(pos);
        //位置合法，开始挪元素
        for(int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    //判断是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;//没有找到对应下标
    }
    //判断顺序表是否为空
    private boolean isEmpty(){
        return this.usedSize==0;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        if(isEmpty()){
            throw new RuntimeException("顺序表为空！") ;
        }
        //下标不合法
        if(pos<0||pos>=this.usedSize){
            //return -1;//注意：可能-1就是那个元素，就会引起歧义。
            throw new RuntimeException("pos位置不合法！") ;
        }
        return this.elem[pos];
    }
    //给pos位置的元素设为value
    public void setPos(int pos,int value){
        if(pos<0||pos>=this.usedSize){
            throw new RuntimeException("pos位置不合法！") ;
        }
        this.elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        //1.首先找到toRemove元素的下标i
        //2.[i]=[i+1],把要溢出的元素覆盖掉
        //this.usedSize--;
        int ret=search(toRemove );//找到元素的下标
        for(int i=ret;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    //获取顺序表的长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
}

