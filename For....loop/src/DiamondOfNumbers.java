
public class DiamondOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		for (int i=1; i<=4; i++) {
			for(int s=1; s<=5-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print(a+"");
				
			}
			System.out.println();
			a++;
			
		}
		for (int i=5; i>=1; i--){
			for(int s=1; s<=5-i; s++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print(a+"");
				
			}
			System.out.println();
			a--;
	   }
	}
}

