import java.util.ArrayList;
import java.util.List;

/**
 * @author 张瑞瑞
 * @date 2020/05/12 17:04
 * 杨辉三角
 */
public class TestMain {
    public  static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>() ;
        if(numRows ==0){
            return ret;
        }
        //ret.add(new ArrayList<>() );
        List<Integer > oneRow=new ArrayList<>() ;
        ret.add(oneRow);

        oneRow .add(1);//第一行的元素添加了一个1
        //直接从第二行开始
        for(int i=1;i<numRows ;i++){
          List<Integer > curRow= new ArrayList<>() ;
          curRow .add(1);//当前行的第一个元素
          List <Integer >prevRow=ret.get(i-1);//拿到当前行的前一行
          for(int j=1;j<i;j++){
             //[i,j]=[i-1,j-1]+[i-1,j]
              int x= prevRow.get(j);
              int y=prevRow .get(j-1) ;
              curRow.add(x+y);

          }
          //最后一个元素
          curRow .add(1);
          ret.add(curRow );
        }
        return ret;

    }
    public static void main(String[] args) {
        int numsRow=4;
        List<List<Integer > > list=generate(numsRow );
        System.out.println(list);

    }
}
