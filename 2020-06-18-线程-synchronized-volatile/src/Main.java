/**
 * @author 张瑞瑞
 * @date 2020/06/19 11:47
 */
import java.util.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x0 = scanner.nextLong();
        long m = 1000000007;//取模的值
        long s = 100000; //神秘力量使用的次数

        long[] begin = new long[3]; //f(x) = 4x+3 执行3次

        //3次的取值
        begin[0] = x0;
        begin[1] = (4 * begin[0] + 3) % m;
        begin[2] = (4 * begin[1] + 3) % m;

        long minStep = s;
        long cur = 0;
        int step = 0; //执行的步数
        for (int i = 0; i < 3; i++) {
        cur = begin[i];
        step = i;
        while (cur != 0 && step < minStep) {
        cur = (8 * cur + 7) % m; //g(x) = 8x+7 执行
        step++;
        }
        minStep = minStep < step ? minStep : step;
        }
        if (minStep < s) { //如果执行步长没有超过s输出最小步长
        System.out.println(minStep);
        } else {//超过返回-1
        System.out.println(-1);
        }
    }

}
//1. 先求出所有可能的出栈序列【不一定合法】
//2. 判断出栈序列是否合法
//3. 对合法的出栈序列进行排序后输出
/*public class Main {
    private static List<int[]> list = new ArrayList<>();   //存放所有可能的出栈序列【不一定合法】
    private static List<String> res = new ArrayList<>();   //存放最终所有合法的出栈序列

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            backTrace(n, arr, 0);
            for (int[] t : list) {
                if (isLegal(arr, t, n)) {
                    String s = arrToStr(t, n);
                    res.add(s);
                }
            }
            //对最终结果按字典序排序后再输出
            Collections.sort(res);
            for (String r : res) {
                System.out.println(r);
            }
        }
    }

    //数组变成字符串，方便最后结果按字典序进行排序
    private static String arrToStr(int[] t, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(t[i]);
            if (i != n - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    //判断出栈序列是否合法
    //将进站序列依次压入栈中，如果栈顶元素和出站序列元素相同，
    // 那么栈顶元素出栈，同时出栈序列向后走一步，继续比较；如果不相同，那么继续进站序列入栈
    //直到进站序列元素全部压入栈中。
    //最后如果栈为空，说明出栈序列合法；否则，出栈序列就是不合法的
    private static boolean isLegal(int[] in, int[] out, int n) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            stack.push(in[i]);
            while (j < n && !stack.isEmpty() && out[j] == stack.peek()) {
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    //求解所有可能的出栈序列【不一定合法】
    private static void backTrace(int n, int[] arr, int beginIndex) {
        if (beginIndex == n - 1) {   //此时只剩下一个元素，不用再交换了，并将此时所得数组存入集合list中
            int[] tmp = arr.clone();
            list.add(tmp);
            return;
        }
        for (int i = beginIndex; i < n; i++) {
            swap(arr, i, beginIndex);
            backTrace(n, arr, beginIndex + 1);
            swap(arr, i, beginIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

 */