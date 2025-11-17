package xom;

public class demo {

	int a=10;
	public static void main(String[] args) {
		demo d=new demo();
		String s="hello";
		System.out.println(d);//hashcode is printed
		//tosting is implictly added
		
		System.out.println(s);//tosting is implictly added and overridden here
	}

}
