package donePackage;

import java.util.Comparator;

public class LastNameComparator implements Comparator<OneStudent> {

	public int compare(OneStudent arg0, OneStudent arg1) {
		// TODO Auto-generated method stub
		return(arg0.getLastName().compareToIgnoreCase(arg1.getLastName()));
	}

}
