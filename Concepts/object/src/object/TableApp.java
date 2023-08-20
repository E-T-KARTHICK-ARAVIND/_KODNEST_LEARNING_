package object;

public class TableApp {

	public static void main(String[] args) {
    Table t1= new Table();
    t1.no_Of_Wings=3;
    t1.cost=2500;
    t1.colour="black";
    t1.brand="orient";
    System.out.println(+t1.no_Of_Wings +" "+t1.cost+" "+t1.colour+" "+t1.brand);
    t1.rotate();
    t1.blow_Air();
    
    Table t2= new Table();
    t2.no_Of_Wings=4;
    t2.cost=2000;
    t2.colour=" Matt black";
    t2.brand="usha";
    System.out.println(+t2.no_Of_Wings +" "+t2.cost+" "+t2.colour+" "+t2.brand);
    t2.rotate();
    t2.blow_Air();
    
    Table t3= new Table();
    t3.no_Of_Wings=3;
    t3.cost=3500;
    t3.colour="brown";
    t3.brand="havells";
    System.out.println(+t3.no_Of_Wings +" "+t3.cost+" "+t3.colour+" "+t3.brand);
    t3.rotate();
    t3.blow_Air();
    
    
    
	}

}
