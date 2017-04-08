import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("请输入年龄： ");
		int age = scanner.nextInt();
		if (age>=18&&age<=50) {
			System.out.println("该年龄在18-50之间。");
		} else {
			System.out.println("该年龄不在18-50之间。");
		}
		scanner.close();
		
	}
}
