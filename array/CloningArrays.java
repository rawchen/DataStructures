package array;

// 一维数组克隆
public class CloningArrays {
	public static void main(String[] args) {
		int intArray[] = {1, 2, 3};

		int cloneArray[] = intArray.clone();

		// 在创建深拷贝时打印false
		// 对一维数组
		System.out.println(intArray == cloneArray);

		for (int i = 0; i < cloneArray.length; i++) {
			System.out.print(cloneArray[i] + " ");
		}
	}
}
