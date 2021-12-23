import java.util.Scanner;

public class aaaa {

	public static void main(String[] args) {
		System.out.print("请输入北京时间: ");
		Scanner in = new Scanner(System.in);
		int BJT =in.nextInt();
		int c, d, s, t;
		d = BJT % 10;
		t = BJT % 100;
		c = t / 10;
		s = BJT / 100;
		if (0 <=s && s <= 23 && 0 <= t && t <= 59) {
			
			if (s > 8) {
				s = s-8;
				System.out.print("对应的世界协调时为: ");
				System.out.print(s);
				System.out.print(c);
				System.out.print(d);
			}else if (s < 8) {
				s=s-8 + 24;
				System.out.print("对应的世界协调时为: ");
				System.out.print(s);
				System.out.print(c);
				System.out.print(d);
				
			}else if(s == 8) {
				System.out.print("对应的世界协调时为: ");
				System.out.print(c);
				System.out.print(d);
			}
		}else {
			System.out.println("输入错误");
		}
	}
}
