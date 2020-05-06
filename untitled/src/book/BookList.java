package book;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 16:50
 * 顺序表 相当于图书馆 存放书
 */
public class BookList {
    private Book[]books=new Book[100];//设定最多存100本书
    private int usedSize=0;//书的数量，初始值为0
    //调用构造方法 用于初始化  先放（初始化）了三本书在里面
    public BookList (){
        books[0]=new Book("三国演义","罗贯中",100,"小说");
        books[1]=new Book("水浒传","施耐庵",100,"小说");
        books[2]=new Book("西游记","吴承恩",100,"小说");
        this.usedSize =3;
    }
    //在Book类型名为books的这个数组中的pos位置添加一本书
    public void setBook (int pos,Book book){

        this.books[pos]=book;
    }
    public Book getBook(int pos){
            return this.books[pos];
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {

        this.usedSize = usedSize;
    }
}
