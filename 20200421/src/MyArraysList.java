import java.util.Arrays;

/**
 * @author 张瑞瑞
 * @date 2020/04/21 13:11
 */

//顺序表  相当于数组  数据元素连续存放
public class MyArraysList {
    public int[]elem;//数组
    public int usedSize;//数组中有效元素的个数
    public  static final int capacity=10;//数组容量

    //定义一个构造方法用于初始化
    public MyArraysList (){
        this.elem=new int[capacity];
        this. usedSize=0;
    }
    //实现下列的方法

    // 打印顺序表0
    public void display() {
        for(int i=0;i<this.usedSize;i++){
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {

        //如果顺序表已经满了，还有对其进行二倍扩容
        if(this.elem.length==this.usedSize){
            //说明顺序表满了
           this.elem =Arrays.copyOf(this.elem,2*this.usedSize);//进行二倍扩容
        }
        //1.要判断pos位置是否合法
       if(pos<0||pos>usedSize){
           throw new RuntimeException("pos位置不合法！");
       }
        //2.如果要在pos位置新增一个元素，首先要把pos以及后面的位置全都往后挪一位，把pos位置腾开、
        for(int i=this.usedSize-1;i>pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        //3.把data放在pos位置上。
        this.elem[pos]=data;
        //4.usedSize++
        this.usedSize++;

    }

   // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i=0;i<this.usedSize;i++){
            if(this.elem[i]==toFind){
                return i;
            }
        }
        return -1;//没找到
    }
//把判断pos位置是否合法封装成一个方法
    private void checkPos(int pos){
        if(pos<0||pos>=this.usedSize){
            throw new RuntimeException("pos位置不合法！") ;
        }
    }
    //把判断一个顺序表是否为空封装成一个方法
    private boolean isEmpty(){
        return this.usedSize==0;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        /*if(pos<0||pos>=usedSize){
           // return -1;//会出现歧义，-1也可以理解成 元素
            throw new RuntimeException("pos位置不合法！") ;
        }*/
        //如果顺序表为空的话，需要抛出异常
        if(isEmpty()){
            throw new RuntimeException("顺序表为空！") ;
        }
        this.checkPos(pos);//判断pos位置是否合法
        return this.elem[pos];

    }

    // 给 pos 位置的元素设为 value  相当于更新pos位置的值
    public void setPos(int pos, int value) {
        if(isEmpty()){
            throw new RuntimeException("顺序表为空！") ;
        }
        this.checkPos(pos);//判断pos位置是否合法
        this.elem[pos]=value;

    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        //1.找到关键字的下标
        int ret=this.search(toRemove);
        if(ret==-1){
            System.out.println("没有需要删除的元素！");
            return;//跳出这个方法，不执行后面的语句
        }
        //2.把后面的数字全部往前挪一位，把要删的关键字覆盖掉
        for(int i=ret;i<usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        //3.usedSize--;
        this.usedSize--;

    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
     }

    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }

}
