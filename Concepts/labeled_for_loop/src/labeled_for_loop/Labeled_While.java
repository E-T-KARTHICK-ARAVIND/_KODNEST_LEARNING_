package labeled_for_loop;

public class Labeled_While {
	public static void main(String[] args) {
		int j=1;
		r15:while(j<=5)
		{
	     int i=1;
	     duke:while(i<=5)
	     {
	    	 System.out.println("* ");
	    	 i++;
	    	 break r15;
	     }
	     j++;
	     System.out.println();
		}
	}

}
