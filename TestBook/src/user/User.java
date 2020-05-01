package user;

import book.BookList;
import operation.IOperation;

/**
 * @author 张瑞瑞
 * @date 2020/04/30 19:49
 * 用户
 */
public abstract class User {
    protected  String name;
    protected IOperation [] operations ;

    public User(String name) {

        this.name = name;
    }
    public abstract  int menu();
    public void doOperation( BookList bookList,int choice){

        this.operations [choice].work(bookList);
    }
}
