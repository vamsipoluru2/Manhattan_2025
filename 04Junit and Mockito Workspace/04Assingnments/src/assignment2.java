class assignment2{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.print("before reverse: ");
		System.out.println("A:-> "+a+" "+"B:-> "+b);
		
		int c;
		
		c=a;
		a=b;
		b=c;
		System.out.print("After reverse: ");
		System.out.println("A:-> "+a+" "+"B:-> "+b);
		

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("after without third variable reverse: ");
		System.out.println("A:-> "+a+" "+"B:-> "+b);
		
		
		System.out.println("Sum of Three Num: "+sum(2,4,5));
		char s='A';
		
		System.out.println(s-'0');
	}
	static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
}

