package array;

public class multiDimensional { 
    public static void main(String args[]) { 
        // 声明和初始化二维数组
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  
        // 打印二维数组
        for (int i=0; i< 3 ; i++) 
        { 
            for (int j=0; j < 3 ; j++) 
                System.out.print(arr[i][j] + " "); 
  
            System.out.println(); 
        } 
    } 
} 