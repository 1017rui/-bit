package operation;

import book.Book;
import book.BookList;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 16:59
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("显示所有图书");
        for(int i=0;i<booklist .getUsedSize() ;i++){
            Book book=booklist .getBook(i);
            System.out.println(book);
        }

    }
}
