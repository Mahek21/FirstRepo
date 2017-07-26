package donePackage;

import java.util.Comparator;

public class FirstNameComparator implements Comparator<OneStudent> {

	public int compare(OneStudent o1, OneStudent o2) {
		// TODO Auto-generated method stub
		return (o1.getFirstName().compareToIgnoreCase(o2.getFirstName()));
	}
}
