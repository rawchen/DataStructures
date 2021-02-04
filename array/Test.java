package array;

// 将数组传递给方法
public class Test {
	// 驱动方法
	public static void main(String args[]) {
		int arr[] = {3, 1, 2, 5, 4};

		// 将数组传递给方法sum
		sum(arr);

	}

	//数组元素求和
	public static void sum(int[] arr) {
		// 获取数组值的和
		int sum = 0;

		for (int i = 0; i < arr.length; i++)
			sum += arr[i];

		System.out.println("sum of array values : " + sum);
	}
} 