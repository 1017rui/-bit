import java.io.File;

/**
 * @author 张瑞瑞
 * @date 2020/06/24 18:39
 */
public class FileDemo {
    public static void main(String[] args) {
        //File file=new File("测试目录\\a.txt");
        //模拟文件重命名
        /*File dest=new File("测试目录\\b.txt");
        boolean b=file.renameTo(dest);
        System.out.println(b);
        */
        //模拟剪切-黏贴的操作
       /* File dest=new File("a.txt");
        boolean b=file.renameTo(dest) ;
        System.out.println(b);*/
        //模拟 如果目标文件已经存在：
        //1.普通文件
        //2.目录
        //删除普通文件，删除目录
        /*File file=new File("测试目录\\空文件.txt");
        boolean a=file.delete() ;
        System.out.println(a);*/

           /* File file = new File("测试目录\\空目录");
            boolean a = file.delete();
            System.out.println(a);*/

       /* {
            File file = new File("测试目录\\a.txt");
            boolean a = file.delete();
            System.out.println(a);
        }
        {
            File file=new File("测试目录\\b.txt");
            file.deleteOnExit();
        }*/
        //目录的遍历  只能得到一级孩子
        File file = new File("测试目录\\非空目录\\每日一题");
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        String[] s = file.list();
        for (String str : s) {
            System.out.println(str);
        }
    }
}