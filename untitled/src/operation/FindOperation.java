package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 17:00
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("查找图书");

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name=scanner.nextLine();

        for(int i=0;i<booklist .getUsedSize() ;i++){
            Book book=booklist .getBook(i);
            if(book.getName() .equals(name) ){
                //找到了之后先打印一下书的基本信息
                System.out.println(book);
                System.out.println("查找成功！！");
                return;
            }

        }
        System.out.println("没有你要查找的这本书！！");

    }
}




