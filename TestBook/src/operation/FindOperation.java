package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/04/30 19:46
 * 查找书籍
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner=new Scanner(System.in);

        System.out.println("请输入图书的名字：");
        String name=scanner.nextLine();

        for(int i=0;i<bookList .getUsedSize() ;i++){
            Book book=bookList .getBook(i);
            if(book.getName().equals(name)){
                System.out.println(book);
                System.out.println("查找成功!");
                return;

            }
        }
        System.out.println("没有这本的书！");
    }
}
