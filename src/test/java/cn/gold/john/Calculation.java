package cn.gold.john;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Calculation {

    //static int i;
    public static  void main(String arg[]){

        //冒冒泡测试
       /* int[] arrayInt = {2,1,8,10,99,22,33,4,12,4};
        maopao(arrayInt);
        for(int i=0;i<arrayInt.length;i++){
            System.out.println(arrayInt[i]);
        }*/
       /* int i = 5;
        int s = (i++)+(++i)+(i--)+(--i);
        System.out.println(s);*/

        //数字分割,升降排序
        String str = "1,6,7,0,4,99,44,11,77";
        //System.out.println(splitAndsort(str,"asc"));
        System.out.println(splitAndsort(str,"desc"));
    }

    /**
     * 冒泡算法
     * @param arrayInt
     */
    public static void maopao(int[] arrayInt){
        for(int i=0;i<arrayInt.length;i++){
            for(int j=i+1;j<arrayInt.length;j++){
                if(arrayInt[i]<arrayInt[j]){
                    int temp = arrayInt[i];
                    arrayInt[i]=arrayInt[j];
                    arrayInt[j]=temp;
                }
            }
        }
    }
    //现在输入n个数字，以逗号，分开；然后可选择升或者降序排序
    public static String splitAndsort(String s,String type){
        String[] ss = s.split(",");
        int[] ii = new int[ss.length];
        for(int i=0;i<ii.length;i++){
            ii[i] = Integer.parseInt(ss[i]);
        }
        Arrays.sort(ii);
        StringBuffer sb = new StringBuffer();
        if(type.equals("asc")){
            for(int i=0;i<ii.length;i++){
                sb.append(ii[i]);
            }
            return  sb.toString();
        }
        if(type.equals("desc")){
            for(int i=ii.length-1;i>0;i--){
                sb.append(ii[i]+" ");
            }
            return  sb.toString();
        }
        return  null;
    }
    //插入排序
    public static int[] insertSort(int[] arr){
        int tmp;
        for(int i = 1; i < arr.length; i++) {
            // 待插入数据
            tmp = arr[i];
            int j;
            for(j = i - 1; j >= 0; j--) {
                // 判断是否大于tmp，大于则后移一位
                if(arr[j] > tmp) {
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
            System.out.println(i + ":" + Arrays.toString(arr));
        }
            return arr;
    }
    @Test
    public void insertSort(){
        int[] array = {1,5,2,66,22,234,123,556,23,90};
        int temp;
        for(int i=1;i<array.length;i++){
            temp = array[i];
            int j;
            for(j=i-1;j>=0;j--){
                if(array[j]>temp)
                    array[j+1] = array[j];
                else
                    break;
            }
            array[j+1] = temp;
            System.out.println(i + ":" + Arrays.toString(array));
        }
    }
}
