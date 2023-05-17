package comparable_comparator_demo;

import java.util.Comparator;

public class RatingComparator implements Comparator<Bus> {

	@Override
	public int compare(Bus o1, Bus o2) {
		// TODO Auto-generated method stub
		return o1.getRating().compareTo(o2.getRating()) ;
	}

}
