package loop;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Multiplication Table
		int n=5;
		for(int i=1;i<=10;i++)
			System.out.printf("%d x %d = %d \n",n,i,n*i);
		
		// Practice 4: Table in reverse order
		int m=5;
		for(int j=10;j!=0;j--)
			System.out.printf("\n\n %d x %d = %d",m,j,m*j);
	}

}
