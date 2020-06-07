package test;

public class Test01 {
    public static void main(String[] args) {
        String str = "Java,Java,String,Hello world!";
        String newStr = str.replaceAll("Java","123");
        System.out.println(newStr);
    }
}
