import java.util.Arrays;
/**
 * @author 张瑞瑞
 * @date 2020/04/19 20:26
 */
public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;//有效的数据个数
    public static final int capacity=10;//初始容量
    public MyArrayList (){
        this.elem=new int [capacity];
        this.usedSize=0;
    }

             // 打印顺序表  
            public void display() {
               for(int i=0;i<this.usedSize;i++){
                   System.out.print((this.elem[i] + " "));
               }
                System.out.println();
            }
            private boolean isFull(){
                /*if(this.usedSize==this.elem.length){
                    return true;
                }
                return false;*/
                return this.usedSize==this.elem.length;
            }
            private void checkPos(int pos){
                if(pos<0||pos>this.usedSize){
                    throw new RuntimeException("pos位置不合法！");
                }
            }
             // 在 pos 位置新增元素    
            public void add(int pos, int data) {
                checkPos(pos);
                if(isFull()){//顺序表是满的

                    this.elem=Arrays.copyOf(this.elem,2*this.elem.length);//二倍扩容
                    //return;
                }

                /*if(pos<0||pos>this.usedSize){//pos位置不合法
                    return;
                }*/
                for(int i=this.usedSize-1;i>=pos;i--){
                    this.elem[i+1]=this.elem[i];
                }
                this.elem[pos]=data;
                this.usedSize++;
            }
            // 判定是否包含某个元素
            public boolean contains(int toFind) {
            for(int i=0;i<this.usedSize ;i++){
                if(this.elem[i]==toFind){
                    return true;
                }
            }
            return false;

            }
            // 查找某个元素对应的位置  
            public int search(int toFind) {
                for(int i=0;i<this.usedSize ;i++){
                    if(this.elem[i]==toFind){
                        return i;
                    }
                }
                return -1;
            }
            private boolean isEmpty(){
               return this.usedSize==0;
            }
             // 获取 pos 位置的元素  
            public int getPos(int pos) {
               //1.看顺序表是否为空
                //2.看pos是否合法
                if(isEmpty()){

                    throw new RuntimeException("顺序表为空！");
                }
                checkPos(pos);
                return this.elem[pos];
            }
        // 给 pos 位置的元素设为 value  相当于更新。
            public void setPos(int pos, int value) {
                //checkPos(pos);
                if(pos<0||pos>=this.usedSize){
                    throw new RuntimeException("pos位置不合法！");
                }
                this.elem[pos]=value;
            }
             //删除第一次出现的关键字key  
             public void remove(int toRemove) {
                 //1.找key在哪里，并且知道它的下标
                 //2.[i]=[i+1]
                 //3.userSize--

              /*  int key=0;
                 for( int i=0;i<this.usedSize-1;i++){
                     if(this.elem[i]==toRemove){
                         key=i;
                         break;
                     }
                 }
                 for(int j=key;j<this.usedSize-1;j++){
                     elem[j]=elem[j+1];
                 }
                 this.usedSize--;*/
                int index=search(toRemove);
                if(index==-1){
                    System.out.println("没有需要删除的数字！");
                    return ;
                }
                 for(int i=index;i<this.usedSize-1;i++){
                     elem[i]=elem[i+1];
                 }
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


    public static void main(String[] args) {
        MyArrayList myArrayList1=new MyArrayList();
        MyArrayList myArrayList2=new MyArrayList();
    }
}