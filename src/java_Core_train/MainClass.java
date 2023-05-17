package java_Core_train;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		/*	try {
				int som=10/1;
				System.err.println(som);
			}catch(ArithmeticException a) {
				System.err.println("Error:"+a.getMessage());
			}*/
		/*
			String s1="java string split method sample"; 
			String [] words = s1.split("\\s");
			for(String w:words) {
				System.out.println(w);
			}*/
		
			/*Date date = new Date();
			SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
			String strDate = formater.format(date);
			System.out.println(strDate);*/
			
			ArrayList<String> list = new ArrayList<String>();
			list.add("Baruch");
			list.add("Elsa");
			list.add("Berthelot");
			list.add("Colorince");
			list.add("Duverger");
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
		
		};

}
