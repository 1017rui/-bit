/**
 * @author 张瑞瑞
 * @date 2020/05/21 18:49
 */
public class TestHeap {
    public int[]elem;
    public int usedSize;
    public TestHeap (){
        this.elem=new int[10];
    }
    //root代表每棵子树的开始位置，len为结束位置
    public void adjustDown(int root,int len) {
        int parent = root;//4
        int child = 2*parent+1;//9
        int max=0;
        while (child < len) {
            //0、判断是否有左右孩子  有的话 找到最大值 C下标表示最大值下标
            if(child+1<len&&this .elem[child]<this.elem[child+1]){
                child++;
            }
            //代码指向到这里，c表示最大值下标
            if(this.elem[child] > this.elem[parent]) {
                //交换
            }else {
                break;
            }
        }

    }

    public void createHeap(int[] array){
        for(int i=0;i<array .length ;i++){
            this.elem[i]=array [i];
            this.usedSize ++;
        }
        //i子树的根节点下标
        for(int i=(this.usedSize-1-1)/2;i>=0;i--){
            adjustDown(i,this.usedSize ) ;
        }
    }
}
