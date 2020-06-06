package array;

// Java程序演示
// 克隆多维数组
public class CloneMultidimensionalArray {
    public static void main(String[] args) {
        int intArray[][] = {{1,2,3},{4,5}};

        int cloneArray[][] = intArray.clone();

        // 将打印false
        System.out.println(intArray == cloneArray);

        // 创建浅拷贝时打印为true
        // 即子阵列是共享的
        System.out.println(intArray[0] == cloneArray[0]);
        System.out.println(intArray[1] == cloneArray[1]);
    }

}
