package array;

//数组下标越界异常
public class JavaArray3 {
	public static void main(String[] args) {
		int[] arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;

		for (int i = 0; i <= arr.length; i++)
			System.out.println(arr[i]);
	}
}