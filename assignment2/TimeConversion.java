import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in seconds you want to convert into time format");
        int totalSeconds  = sc.nextInt();
        sc.close();

		int hour = totalSeconds / 3600;
		int rem = totalSeconds  % 3600;
		int minutes= rem / 60;
		int seconds= rem % 60;

		System.out.println(hour+":"+minutes+":"+seconds);
	}

}
