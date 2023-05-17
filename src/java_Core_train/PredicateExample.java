package java_Core_train;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child(3);
		Child child2 = new Child(10);
		Child child3 = new Child(15);
		Child child4 = new Child(1);
		Child child5 = new Child(2);
		Child child6 = new Child(5);
		Child child7 = new Child(6);
		Child child8 = new Child(5);
		Child child9 = new Child(10);
		List<Child>childs = Arrays.asList(new Child[] {child1,
				child2,child3,child4,child5,child6,
				child7,child8,child9});
		List <Child>filtered = ChildPredicate.filterChild(childs, ChildPredicate.filterByAge(5));
		
		for (Child child:filtered) {
			System.out.println(child.getAge());
		}
		

	}

}
