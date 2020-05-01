package operation;

import book.BookList;

/**
 * @author 张瑞瑞
 * @date 2020/04/30 19:45
 * 退出系统
 */
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);//正常退出
    }
}
