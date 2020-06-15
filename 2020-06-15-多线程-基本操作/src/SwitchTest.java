/**
 * @author 张瑞瑞
 * @date 2020/06/15 21:59
 */
public class SwitchTest {
    public static void main(String[] args) {
        String s1="abc"+"def";
        String s2=new String(s1);
        if(s1.equals(s2) ){
            System.out.println("s1.equal(s2)");
        }
        if(s1==s2){
            System.out.println("s1==s2");
        }
    }
    public static void main1(String[] args) {
        System.out.println("value"+switchit(4));
    }
    public static int switchit (int x){
        int j=1;
        switch(x){
            case 1:j++;
            case 2:j++;
            case 3:j++;
            case 4:j++;
            case 5:j++;
            default:j++;
        }
        return j+x;
    }
}
