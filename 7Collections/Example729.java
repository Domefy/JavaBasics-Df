import java.util.*;
public class Example729
{
  public static void main(String[] args)
  {
    int[] arr={9,8,3,5,2};            //定义一个数组
    System.out.print("排序前：");
    printArray(arr);
    Arrays.sort(arr);               //调用 Arrays 的 sort方法进行排序
    System.out.print("排序后：");
    printArray(arr);

    int index=Arrays.binarySearch(arr,3);     //Arrays.binarySearch(arr,3)二分查找 指定元素3的索引
    System.out.println(" 数组排序后元素3的索引是："+index);

    int[] copied=Arrays.copyOfRange(arr,1,7);   //Arrays.copyOfRange(arr,1,7) 将原数组中的元素复制到新的数组中
     System.out.print("将原数组中的索引1-4的元素放到新的数组中");
    for(int i=0;i<copied.length;i++){
        System.out.print(copied[i]+" ");

    }

    
    Arrays.fill(arr,8);       // Arrays.fill(arr,8); 将数组中的元素都替换成 8               
    for(int i=0;i<arr.length;i++){
      System.out.println(i+":"+arr[i]);
    }

    String arrString=Arrays.toString(arr);   // 不是对Object 的toString（）进行重写，只是犯规指定数值的字符串
    System.out.println("返回字符串："+arrString);
                  
   
  }

  public static void printArray(int[] arr){   //打印方法
    System.out.print("[");
    for(int x=0;x<arr.length;x++){
      if(x!=arr.length-1){
        System.out.print(arr[x]+",");
      }else{
        System.out.print(arr[x]+"]");
      }

    }

  }
}
/* 报错：     没有将包导入  解决办法：import java.util.*;
Example29.java:8: error: cannot find symbol
    Arrays.sort(arr);
    ^
  symbol:   variable Arrays
  location: class Example29
1 error

运行结果： 排序前：[9,8,3,5,2]排序后：[2,3,5,8,9]
*/