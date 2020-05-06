package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 16:57
 * 借阅图书
 */
public class BorrrowOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("借阅图书");

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name=scanner.nextLine();

        for(int i=0;i<booklist .getUsedSize() ;i++){
            Book book=booklist .getBook(i);
            if(book.getName() .equals(name) ){
                //可以借阅
                if(book.isBorrowed()){
                    System.out.println("这本书已经被借阅了！！");
                    return;
                }
                book.setBorrowed(true) ;
                System.out.println("借阅图书成功！！");
                return;
            }

        }
        System.out.println("没有你要借阅的这本书！！");

    }
}
