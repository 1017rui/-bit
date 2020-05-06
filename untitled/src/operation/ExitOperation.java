package operation;

import book.BookList;

/**
 * @author 张瑞瑞
 * @date 2020/05/06 17:00
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList booklist) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
