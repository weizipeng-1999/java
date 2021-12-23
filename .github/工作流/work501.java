package aaa;
import java.util.Scanner;
public class work5 {
		public static boolean isPrime(int i) {
			boolean isPrime = true;
			// 除到i的平方根就可以判断
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0)
					isPrime = false;
			}
			return isPrime;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			String out = n + "=";
			if (isPrime(n)) {
				out = out + n;
			} else {
				while (n != 1) {
					for (int j = 2; j <= n; j++) {
						// 对最后一个进行特殊处理
						if (j == n) {
							n = 1;
							out = out + j;
							break;
						}
						if (n % j == 0) {
							n = n / j;
							out = out + j + "x";
							break;
						}
					}
				}
			}
			System.out.println(out);
			in.close();
		}
	}

