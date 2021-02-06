public class P10{
	public static void main(String args[]){
		int a=1,b=1;
		int c=a+b;
		System.out.print(a+", "+b+", "+c);
		for(int i=0;i<10;i++){
			a=c;
			c=c+b;
			System.out.print(", "+c);
			b=a;
		}
	}
}