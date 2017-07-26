package donePackage;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class FirstNames {
	
	protected static HashSet<String> maleNames= new HashSet<String>();
	protected static HashSet<String> femaleNames= new HashSet<String>();
	protected static String defaultFileName="D:\\Users\\student-2017\\Desktop\\PopularNames.txt";
	
	public static void loadNames(String fileName) throws IOException {
		Scanner sc= new Scanner(new File(fileName));
		HashSet<String> x=null;
		while (sc.hasNextLine()) {
			String elem=sc.nextLine();
			if (elem.contains("###Boys'"))
				x=maleNames;
			if (elem.contains("#### Girls'"))
				x=femaleNames;
			if (x!=null)
				x.add(elem.toLowerCase());
		}
		sc.close();
	}
	public static Gender getGender(String s) throws IOException {
		if (maleNames.size()==0)
			loadNames(defaultFileName);
		if (maleNames.contains(s.toLowerCase()))
				return Gender.MALE;
		if (femaleNames.contains(s.toLowerCase()))
				return Gender.FEMALE;
		return (Gender.GENDER_EROPR);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
