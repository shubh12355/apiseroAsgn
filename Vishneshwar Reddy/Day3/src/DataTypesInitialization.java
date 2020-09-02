import java.util.Scanner;
public class DataTypesInitialization {

	public static void main(String[] args) {
		byte var1 = 5;
		System.out.println("byte: " + var1);
		short var2 = 1234;
		System.out.println("short: "+var2);
		int var3 = 12345;
		System.out.println("int: "+var3);
		long var4 = 1234567890;
		System.out.println("long: "+var4);
		float var5 = 123.4456f;
		System.out.println("float: "+var5);
		double var6 = 12345.67890;
		System.out.println("double: "+var6);
		boolean var7 = true;
		System.out.println("boolean: "+var7);
		char var8 = 'c';
		char var9 = 'd';
		System.out.println("char: "+ var8 +", " + var9);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int var10 = sc.nextInt();
		System.out.println("Scanner o/p: " +var10);
		sc.close();
	}

}
