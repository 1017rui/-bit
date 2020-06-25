import java.io.File;

/**
 * @author 张瑞瑞
 * @date 2020/06/24 19:41
 */
public class ScanDirDepth {
    public static void main(String[] args) {
        File root=new File("测试目录\\非空目录");
         scanDir(0,root);
    }
    /*
    保证node代表的一定是目录
     */
    private static void scanDir(int level,File node){

        //1.先打印节点的绝对路径
        //假设缩减单位为4个空格
        for(int i=0;i<level ;i++){
            System.out.print("    ");
        }
        System.out.println(node.getAbsolutePath() +"\\");
        //2.取节点的所有孩子
        File[] children=node.listFiles() ;
        if(children==null){
            // 防御式编程：理论上不应该出现该情况的
            return;
        }
        // 3. 孩子中的普通文件，直接打印
        //    孩子中的目录，递归，进行深度遍历
        // 隐含的递归停止条件：children 的长度 == 0 的时候，下面的循环没有任何效果

        for(File child:children ){
            if(child.isDirectory() ){//判断文件是否为目录
                scanDir(level+1,child);
            }else if(child.isFile() ){//判断文件是否为普通文件
                for(int i=0;i<level ;i++){
                    System.out.print("    ");
                }
                System.out.println(child.getAbsolutePath());
            }
        }
    }
}