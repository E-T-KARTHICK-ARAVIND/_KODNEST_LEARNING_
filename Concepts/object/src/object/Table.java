package object;

 class Table {
	 int no_Of_Wings;
	 int cost;
	 String colour;
	 String brand;
	 
	 void rotate()
	 {
		 System.out.println("the fan is rotating of colour "+colour+ "and the wings present in the fan is "+no_Of_Wings+" brand of the fan is "+brand+ " and the cost of the fan is"+cost);
		 
	 }
	 void blow_Air()
	 {
		 System.out.println("the colour of the fan which is blowing air is "+colour);
	 }

}
