import java.util.Scanner;
public class azz1 {
	private static Scanner in;
	public static void main(String[] args) 
	{	
		 in=new Scanner(System.in);
    	 int n=in.nextInt();
    	 int m=in.nextInt();
    	 int i,x,num=0,sum=0;
    	 for(i=2;num<=m;i++) {
    		 int isPrime=1;
    		 for(x=2;x<i;x++) {
    			 if(i%x==0) {
    				 isPrime=0;
    				 break;
    			 }
    		 }
    		 if(isPrime==1) {
    			 num++;
    			 if(num>=n&&num<=m) {
    				 sum+=i;
    			 }
    		 }
    	 }
    	 System.out.println(sum);
}
}
