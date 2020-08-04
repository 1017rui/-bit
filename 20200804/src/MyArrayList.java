import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/08/04 10:53
 */
/*
自己实现顺序表
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;//记录顺序表中的元素
    public static final int capacity=10;//数组容量

    public MyArrayList() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }
    //下标异常判断
    private void checkPos(int pos){
        if(pos<0 || pos>=this.usedSize){
            //下标位置不合法
            throw new RuntimeException("下标位置不合法！");
        }
    }
    //打印顺序表
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    //在pos位置新增元素
    public void add(int pos,int data){
        //首先判断顺序表是否已经放满
        if(isFull()){
            //进行二倍扩容
            this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if(pos<0 || pos>this.usedSize){
            //下标位置不合法
            throw new RuntimeException("下标位置不合法！");
        }
        //将pos位置开始到最后一个位置的元素全部王后挪一位，将pos腾开
        for(int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;

    }
    //判断顺序表中是否包含某个元素
    public boolean contains(int toFind){
        for(int i=0;i<this.usedSize-1;i++){
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind){
        for(int i=0;i<this.usedSize-1;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;
    }
    //获取pos位置的元素
    public int getPos(int pos){
        checkPos(pos);
        return this.elem[pos];
    }
    //给pos位置的元素设为value
    public void setPos(int pos,int value){
        if(isEmpty()){
            throw new RuntimeException("顺序表为空");
        }
        checkPos(pos);
        this.elem[pos]=value;//相当于更新值
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        int index=search(toRemove);//该元素的下标
        if(index==-1){
            throw new RuntimeException("没有需要删除的元素");
        }
        for(int i=index+1;i<this.usedSize;i++){
            this.elem[i-1]=this.elem[i];
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
    public boolean isEmpty(){
        return this.elem.length==0;
    }
    public boolean isFull(){
        return this.elem.length==this.usedSize;
    }


}
