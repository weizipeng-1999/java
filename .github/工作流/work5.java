package aaa;


import java.util.Scanner;
public class work501{
	public static void main(String[] args)
	{
        //初始化
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();//String是一个类，创建了s对象，nextline读入下一行字符
		String[] a=s.split(" ");
		for(int i=0;i<a.length;i++){
			if(!a[i].equals("") && i!=a.length-1)//将连续空格情况排除
				System.out.print(a[i].length()+" ");
			if(i==a.length-1)
				System.out.print(a[i].length()-1);	
		}
		in.close();
	}
}
