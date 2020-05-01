package operation;

import book.Book;
import book.BookList;

/**
 * @author 张瑞瑞
 * @date 2020/04/30 19:45
 * 显示书籍
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("显示所有图书");
        for(int i=0;i<bookList .getUsedSize() ;i++){
            Book book=bookList .getBook(i);
            System.out.println(book);
        }
    }
}
