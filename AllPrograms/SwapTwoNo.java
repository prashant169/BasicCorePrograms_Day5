import java.util.*;


public class SwapTwoNo{
        public static void main(String args[]){
			int x,y,t;
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter The Value For x: ");
			x=sc.nextInt();
			System.out.println("Ener The value for  y: ");
			y=sc.nextInt();
			System.out.println("Before swaping Number: "+ x + " " + y  );
			t=x;
			x=y;
			y=t;
			System.out.println("After Swaping the numbers : "+ x + " " + y );
			System.out.println();
		}

}
