import java.util.Scanner;

public class aaaaa {
	public static void main(String[] args) {
		System.out.print("请输入频率： ");
		Scanner in = new Scanner(System.in);
		int pl =in.nextInt();
		int a ,b;
		a=pl/10;
		b=pl%10;
		if(a<6&&b<10){
			
			switch(b) {
			case 1: 
				System.out.print("Faint signals, barely perceptible,");
				break;
			case 2: 
				System.out.print("Very weak signals,");
				break;
			case 3: 
				System.out.print("Weak signals,");
				break;
			case 4: 
				System.out.print("Fair signals,");
				break;
			case 5: 
				System.out.print("Fairly good signals ,");
				break;
			case 6: 
				System.out.print("Good signals,");
				break;
			case 7: 
				System.out.print("Moderately strong signals,");
				break;
			case 8: 
				System.out.print("Strong signals,");
				break;
			case 9: 
				System.out.print("Extremely strong signals,");
				break;
			
			}
			switch(a) {
			case 1: 
				System.out.print("Unreadable. ");
				break;
			case 2: 
				System.out.print("Barely readable, occasional words distinguishable.");
				break;
			case 3: 
				System.out.print("Readable with considerable difficulty.");
				break;
			case 4: 
				System.out.print("Readablewith practically no difficulty.");
				break;
			case 5: 
				System.out.print("Perfectly readable. ");
				break;
					
			}

		}
	
	}
}
