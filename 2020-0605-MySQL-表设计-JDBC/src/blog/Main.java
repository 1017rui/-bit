package blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 张瑞瑞
 * @date 2020/06/07 22:37
 * 博客系统
 */
public class Main {


    //功能菜单列表
    private static List<String> featureList=new ArrayList<>() ;
    //具体的操作列表
    private static List<Action> actionList =new ArrayList<>() ;

    private static void initFeatureList() {
        //已完成
        featureList.add("用户注册");
        featureList.add("用户登录");
        featureList.add("查看文章列表-按照发表时间倒序给出");
        featureList.add("发表文章-要求先登录");
        featureList.add("查看指定文章内容");
        featureList.add("评论指定文章-要求先登录");
        featureList.add("点赞指定文章-要求先登录");
        featureList .add("取消点赞指定文章-要求先登录");
        featureList .add("查找标题中包含某些字符的文章列表");
    }
    private static void initActionList(){

        //用户注册
        actionList .add(new UserRegisterAction() );
        //用户登录
        actionList .add(new UserLoginAction() );
        //查看文章列表
        actionList .add(new ArticleListAction() );
        //发表文章
        actionList .add(new ArticlePublishAction() );
        //查看指定文章内容
        actionList .add(new ArticleDetailAction() );
        //评论指定文章
        actionList .add(new CommentArticleAction() );
        //点赞指定文章
        actionList .add(new LikeArticleAction() );
        //取消点赞指定文章
        actionList .add(new CancelLikeArticleAction() );
        //查找标题中包含某些字符的文章列表
        actionList .add(new ContainCharacterArticleListAction() );

    }
    public static void main(String[] args) {

        //使用该方法初始化功能菜单列表
        initFeatureList();
        //使用该方法初始化具体操作列表
        initActionList() ;
        Scanner scanner=new Scanner(System.in);
        //写一个大循环
        while(true){
            //给出菜单
            showMenu();
            //给出提示
            showPrompt();
            //让用户选择要执行那个功能
            int select=scanner .nextInt() ;
            //分发

            //根据具体的用户输入执行具体的动作。
            doAction(select);
        }
    }

    //根据具体的用户输入执行具体的动作。
    private static void doAction(int select) {
        if(select ==0){
            System.out.println("欢迎下次再来！！");
            //选择0 退出
            System .exit(0) ;
        }
        //打印出你选择的功能。
        System.out.println("您的选择是："+featureList.get(select -1) );
        if(select-1<actionList .size() ){
            Action action =actionList .get(select-1);
            action .run();
        }else{
            System.out.println("该功能尚未支持，敬请期待！");
        }
    }

    //给出提示
    private static void showPrompt() {
        System.out.print("请输入功能的序号>");
    }

    //给出菜单
    private static void showMenu() {
        System.out.println("欢迎使用《博客系统》，支持以下功能：");
        for (int i = 0; i < featureList.size(); i++) {
            System.out.printf("  %d. %s%n", i + 1, featureList.get(i));
        }
        System.out.println("  0. 退出");
    }

}
