package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 16:59
 */
public class DelOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("删除图书");

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入删除图书的名字：");
        String name=scanner.nextLine();

        for(int i=0;i<booklist .getUsedSize() ;i++){
            Book book=booklist .getBook(i);
            if(book.getName() .equals(name) ){
                //要删除书的下标
                for( int pos=i;pos<booklist .getUsedSize()-1;pos++){
                    Book book1=booklist .getBook(pos+1) ;
                    booklist .setBook(pos,book1);
                }
                booklist .setUsedSize(booklist .getUsedSize() -1) ;
                System.out.println("删除成功！！");
                return ;
            }

        }
        System.out.println("没有你要删除的这本书！！");


    }
}
