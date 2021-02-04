package array;

//Java数组
public class JavaArray {
	public static void main(String[] args) {

		// 声明一个整数数组
		int[] arr;

		// 为5个整数分配内存
		arr = new int[5];

		// 初始化数组的第一个元素
		arr[0] = 10;

		// 初始化数组的第二个元素
		arr[1] = 20;

		//等等……
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		// 访问指定数组的元素
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at index " + i +
					" : " + arr[i]);
	}
} 