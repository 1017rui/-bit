package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 16:56
 * 添加图书
 */
public class AddOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("新增图书");
        //默认以尾插法的形式放入
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name=scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author=scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price=scanner.nextInt();
        System.out.println("请输入图书的类型：");
        //String type=scanner.nextLine();//error
        String type=scanner.next();
//注意：nextLine()和nextInt()
        //nextInt()只会读取数值，剩下的\n没有被读取
        //nextLine() 以回车符结束 但会读取\n,
        //next()读取String类型  看到空格符或回车符都认为读取结束  不会读取\n
        Book book=new Book(name,author,price,type);
        int curSize =booklist .getUsedSize() ;
        booklist .setBook(curSize,book) ;
        booklist .setUsedSize(curSize+1) ;

        System.out.println("新增图书成功！！");
    }
}
