package donePackage;

import java.util.Comparator;

public class LastNameDescComparator implements Comparator<OneStudent> {

	public int compare(OneStudent arg0, OneStudent arg1) {
		// TODO Auto-generated method stub
		return(arg1.getLastName().compareToIgnoreCase(arg0.getLastName()));
	}

}
