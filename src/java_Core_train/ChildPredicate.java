package java_Core_train;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ChildPredicate {
	static Predicate<Child> filterByAge(int x){
		return a->a.getAge()>x;
	}
	
	static List<Child> filterChild(List<Child>childs,Predicate<Child>predicate){
		return childs.stream().filter(predicate).collect(Collectors.<Child>toList());
	}
}
