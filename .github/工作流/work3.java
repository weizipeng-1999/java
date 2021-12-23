import java.util.Scanner;
public class azz1 {
	private static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{	
int a=0,b=0;
for(int i=sc.nextInt();i>=0;i=sc.nextInt()) {
    if(i%2!=0)
       b++;
    else
        a++;
}
System.out.println(b+" "+a);
}
}
