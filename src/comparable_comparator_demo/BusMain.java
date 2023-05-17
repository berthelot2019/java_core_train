package comparable_comparator_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BusMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b1 = new Bus(1000,"Wipro Travels",1500.50d,4.5d);
		Bus b2 = new Bus(1001,"Wipro Travels",1600.50d,3.9d);
		Bus b3 = new Bus(1002,"Wipro Travels",1550.50d,1.8d);
		Bus b4 = new Bus(1003,"Wipro Travels",15700.50d,2.2d);
		Bus b5 = new Bus(1004,"Wipro Travels",1560.50d,4.6d);
		Bus b6 = new Bus(1005,"Wipro Travels",1200.50d,3.5d);
		Bus b7 = new Bus(1006,"Wipro Travels",1250.50d,4.1d);
		
		List<Bus>busList=new ArrayList<>();
		busList.add(b1);
		busList.add(b2);
		busList.add(b3);
		busList.add(b4);
		busList.add(b5);
		busList.add(b6);
		busList.add(b7);
		
		Collections.sort(busList);
		System.out.println("Pinting all the buses");
		for(int i=0;i<busList.size();i++) {
			System.out.println(busList.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Pinting all the buses sorted base on Fare");
		Collections.sort(busList,new FareComparator());
		for(int i=0;i<busList.size();i++) {
			System.out.println(busList.get(i));
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Pinting all the buses sorted base on Fare");
		Collections.sort(busList,new RatingComparator());
		for(int i=0;i<busList.size();i++) {
			System.out.println(busList.get(i));
		}
		
		

	}

}
