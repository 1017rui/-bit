import java.util.ArrayList;
import java.util.List;

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

    public static void main1(String[]args){
        int[][]array={{1,2,3},{4,5,6},{7,8,9}};
        int k=2;
        List<List<Integer>> list=shiftGrid(array,k) ;
        System.out.println(list);
    }
}
