import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author 张瑞瑞
 * @date 2020/05/14 17:12
 */
public class Test {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        while(k!=0){
            //建一个新的数组存放迁移之后的情况
            int[][]newArray=new int[m][n];
            //位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
            for(int row=0;row<m;row++){
                for(int column=0;column<n-1;column++){
                    newArray[row][column+1]=grid[row][column];
                }
            }
            //位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
            for(int row=0;row<m-1;row++){
                newArray[row+1][0]=grid[row][n-1];
            }
            //位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
            newArray[0][0]=grid[m-1][n-1];
            grid=newArray;//把迁移后的数组放到grid数组当中
            k--;
        }
        List<List<Integer>> list=new ArrayList<>();
        for(int[] row:grid){
            List<Integer> listRow=new ArrayList<>() ;
            list.add(listRow );
            for(int val: row){
                listRow .add(val);
            }
        }
        return list;

    }
    public static  int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int num1=0;
        int num2=0;
        for(String s:tokens ){
           switch(s){
               case "+"://出栈两个数字进行比较
                   num1=stack.pop();
                   num2=stack.pop();
                   stack.push(num2+num1) ;
                   break;
               case "-":
                   num1=stack.pop();
                   num2=stack.pop();
                   stack.push(num2-num1) ;

                   break;
               case "*":
                   num1=stack.pop();
                   num2=stack.pop();
                   stack.push(num2*num1) ;

                   break;
               case "/":
                   num1=stack.pop();
                   num2=stack.pop();
                   stack.push(num2/num1) ;

                   break;
               default ://说明为数字  遇到数字将其 入栈
                   stack.push(Integer.valueOf(s));//装箱操作（将包装类类型转换为简单类型） 将字符串类型转换为int类型 Integer.valueOf(s)
                   break;

           }

        }
        return stack.peek();

    }
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
       if(pushA.length!=popA.length||pushA.length==0||popA.length==0){
           return false;
       }
       Stack <Integer> stack=new Stack<>() ;//临时栈
        int popIndex=0;//出栈数组的下标
       for(int i=0;i<pushA .length;i++){
           stack.push(pushA[i]);
           while(!stack.empty() &&stack.peek()==popA [popIndex]){
               stack.pop();
               popIndex ++;
           }

       }
       return stack.empty() ;
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        for(String s:ops){
            switch(s){
                case "D"://成绩为上一轮有效成绩的两倍。
                    stack.push(stack.peek()*2);
                    break;
                case "C"://上一轮成绩无效
                    stack.pop();
                    break;
                case "+":
                   int num1= stack.pop();
                   int num2=stack.peek();
                   stack.push(num1);
                   stack.push(num1+num2);

                    break;
                default ://为数字的情况
                    stack.push(Integer .valueOf(s));
                    break;
            }
        }
        int count=0;
        while(!stack.empty() ){
           count+=stack.pop();
        }
        return count;
    }
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character > stackS=new Stack<>();
        Stack<Character > stackT=new Stack<>();
        char[]arrayS=S.toCharArray() ;
        char[]arrayT=T.toCharArray() ;

        for(char c: arrayS){
            switch(c){
                case '#':
                    if(!stackS .empty() ){
                        stackS.pop();
                    }
                    break;
                default :
                    stackS .push(c);
            }
        }
        for(char c: arrayT){
            switch(c){
                case '#':
                    if(!stackT .empty() ){
                        stackT.pop();
                    }
                    break;
                default :
                    stackT .push(c);
            }
        }
        /*if(stackS.size()!=stackT .size() ){
            return false;
        }
        while(!stackS.empty() &&!stackT.empty()){
            if(stackS .pop()!=stackT .pop()){
                return false;
            }
        }
        return true;*/
        return stackS .toString() .equals(stackT .toString() ) ;//将栈转化为字符串判断两个字符串是否相等。
    }


    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> r = new ArrayList<Integer>();// 存放最终收养序列
        ArrayList<Integer> animal = new ArrayList<Integer>();// 存放进入收容所的动物
        int temp=0;
        for (int i = 0; i < ope.length; i++) {
            switch (ope[i][0]) {
                // 有动物进入收容所
                case 1:
                    animal.add(ope[i][1]);
                    break;
                // 有人收养动物
                case 2:
                    // 第一种收养方式
                    if (!animal.isEmpty()&&ope[i][1] == 0) {
                        r.add(animal.get(0));
                        animal.remove(0);
                    }
                    // 收养狗
                    else if (ope[i][1] == 1) {
                        for(temp=0;temp<animal.size();temp++){
                            if(animal.get(temp)>0){
                                r.add(animal.get(temp));
                                animal.remove(temp);
                                break;
                            }
                        }
                    }
                    // 收养猫
                    else if(ope[i][1] == -1){
                        for(temp=0;temp<animal.size();temp++){
                            if(animal.get(temp)<0){
                                r.add(animal.get(temp));
                                animal.remove(temp);
                                break;
                            }
                        }
                    }
                    break;
            }
        }
        return r;
    }
    public static void main(String[] args) {
        int[]pushA={1,2,3,4,5};
        int[]popA={4,3,5,2,1};
        //boolean bool=IsPopOrder(pushA, popA);
       // System.out.println(bool);
        //String[] strings={"5","-2","4","C","D","9","+","+"};
        //int count=calPoints(strings) ;
       // System.out.println(count);
        String str="bxj##tw";

        String str1="bxj###tw";
        boolean bool =backspaceCompare(str,str1) ;
        System.out.println(bool);

    }
    public static void main2(String[] args) {
        String [] strings={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(strings));
    }
    public static void main1(String[]args){
        int[][]array={{1,2,3},{4,5,6},{7,8,9}};
        int k=2;
        List<List<Integer>> list=shiftGrid(array,k) ;
        System.out.println(list);
    }
}
