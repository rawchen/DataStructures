package array;

// 用于说明如何创建对象数组
class Student {
	public int roll_no;
	public String name;

	Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
}

public class JavaArray2 {
	public static void main(String[] args) {

		// 声明一个整数数组
		Student[] arr;

		// 为5个Student类型的对象分配内存
		arr = new Student[5];

		// 初始化数组的第一个元素
		arr[0] = new Student(1, "aman");

		// 初始化数组的第二个元素
		arr[1] = new Student(2, "vaibhav");

		// 等等...
		arr[2] = new Student(3, "shikar");
		arr[3] = new Student(4, "dharmesh");
		arr[4] = new Student(5, "mohit");

		// 访问指定数组的元素
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " +
					arr[i].roll_no + " " + arr[i].name);
	}
} 