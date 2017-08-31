package cn.gold.john;

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
}
