/**
 * @author 张瑞瑞
 * @date 2020/06/17 11:13
 * 枚举
 */
public class EnumDemo {
    enum 性别{
        男,女,保密;
    }

    public static void main(String[] args) {
        性别 sex=性别.男 ;
        System.out.println(sex);
        性别[] values=性别.values();
        for(性别 s:values){
            System.out.println(s);
        }
    }
}
