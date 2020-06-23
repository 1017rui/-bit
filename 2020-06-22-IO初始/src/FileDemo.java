import java.io.File;
import java.io.IOException;

/**
 * @author 张瑞瑞
 * @date 2020/06/22 20:30
 */
public class FileDemo {
    public static void main(String[] args) {
        //String path="D:\\-bit\\2020-06-22-IO初始\\测试目录\\a.txt";//\\是转义
        //String path="Main.java";
        String path="测试目录\\hello.txt";
        //String path="a\\b\\c\\d\\e\\hello.txt";
        File file=new File(path);//路径对应的文件，但文件可能实际上不存在
        //以下判断是否 的前提：文件存在，如果不存在肯定为false
        //常见属性
        //System.out.println(file.isFile());//判断文件是否为普通文件
        //System.out.println(file.isDirectory());//判断文件是否为文件夹
        //System.out.println(file.isAbsolute() );//判断文件是否是以绝对路径创建的
       // System.out.println(file.isHidden() );//判断文件是否为隐藏文件
        System.out.println(file.exists() );//判断文件是否真实（实际）存在
        //System.out.println(file.getAbsolutePath() );//获得文件的绝对路径
        // System.out.println(file.getPath() );//获得文件的普通路径（创建路径）
        //System.out.println(file.getName() );//打印文件名称
        //System.out.println(file.getParent() );//打印文件上一级路径
        //System.out.println(file.canRead() );//判断文件是否可读
        //System.out.println(file.canWrite() );//判断文件是否可写
        //System.out.println(file.canExecute() );//判断文件是否有执行权限
       //测试目录2\hello.txt
        //要创建这个文件，要求测试目录2首先存在，所以会出错
        boolean mkdir=file.mkdir() ;//创建目录
        System.out.println(mkdir );
        /*System.out.println("会把中间没有的目录循环创建出来");
        boolean mkdirs=file.mkdirs();
        System.out.println(mkdirs );*/

    }

}
