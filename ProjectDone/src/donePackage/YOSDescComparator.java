package donePackage;

import java.util.Comparator;

public class YOSDescComparator implements Comparator<OneStudent> {

	public int compare(OneStudent arg0, OneStudent arg1) {
		// TODO Auto-generated method stub
		Integer ar0 = arg0.getYearOfStudy();
		Integer ar1 = arg1.getYearOfStudy();
		return(ar1.compareTo(ar0));
	}
}