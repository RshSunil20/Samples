package mycode;

public class Fibinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0, n2 =1, n3, total=10;
		System.out.println(n1 + "\n" + n2);
		
		for (int i =2; i<=total; i++)
		{
			n3 =n1+n2;
			System.out.println(+n3);
			n1=n2;
			n2= n3;
		
		}

	}
}