package labledDo;

public class do1 {

	public static void main(String[] args) {
		int j=1;
		r15:do
		{
	     int i=1;
	     duke:do
	     {
	    	 System.out.println("* ");
	    	 i++;
	    	 break r15;
	     }while(i<=5);
		}while(j<=5);
	}

}
