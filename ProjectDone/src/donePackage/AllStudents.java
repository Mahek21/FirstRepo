package donePackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class AllStudents {

	protected Vector<OneStudent> data= new Vector<OneStudent>();
	
	public void firstNameSort() {
		OneStudent[] arr= new OneStudent[0];
		arr=data.toArray(arr);
		Arrays.sort(arr, new FirstNameComparator());
		data= new Vector<OneStudent>(Arrays.asList(arr));  
	}
	public void lastNameSort() {
		OneStudent[] arr= new OneStudent[0];
		arr=data.toArray(arr);
		Arrays.sort(arr, new LastNameComparator());
		data= new Vector<OneStudent>(Arrays.asList(arr));  		
	}
	public void yearOfStudyDescSort() {
		OneStudent[] arr= new OneStudent[0];
		arr=data.toArray(arr);
		Arrays.sort(arr, new YOSDescComparator());
		data= new Vector<OneStudent>(Arrays.asList(arr));  
	}
	public void yosAescLnameDescSort() {
		OneStudent[] arr= new OneStudent[0];
		arr=data.toArray(arr);
		Arrays.sort(arr, new YOSAsceComparator());
		Arrays.sort(arr, new LastNameDescComparator());
		data= new Vector<OneStudent>(Arrays.asList(arr));  		
	}
	public AllStudents(String fileName) throws FileNotFoundException {
		Scanner sc= new Scanner(new File(fileName));
		int lineNo=0;
		while (sc.hasNextLine()) {
			String line=sc.nextLine();
			lineNo++;
			try {
				OneStudent one= new OneStudent(line);
				if (data.contains(one)) {
					System.err.println("Database error: "+one.getId()+"\t"+line);
					continue;
				}
				data.add(one);
			}
			catch (Exception ex) {
				System.err.println("Student creation error: "+ex.getMessage()+"\t["+lineNo+"]");
			}
		}
		sc.close();
	}
	public Vector<String> getAllStudents() {
		Vector<String> result= new Vector<String>();
		for (OneStudent one: data) {
			result.add(one.toString());
		}
		return(result);
	}
	public void showStudents() {
		for (OneStudent one: data) {
			System.out.println(one);
		}
	}
	public void showAllStudents(String header) {
		System.out.println(header);
		Vector<String> lines= getAllStudents();
		for (String line: lines)
			System.out.println(line);
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn="D:\\Users\\student-2017\\Desktop\\Student.txt";
		AllStudents all=null;
		try {
			all= new AllStudents(fn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("File Error:\t"+fn);
			System.exit(1);
		}
		all.showAllStudents("Input order");
		all.firstNameSort();
		all.showAllStudents("First name");
		all.lastNameSort();
		all.showAllStudents("Last name");
		all.yearOfStudyDescSort();
		all.showAllStudents("YearOfStudy (descending order)");
		all.yosAescLnameDescSort();
		all.showAllStudents("YearOfStudy (ascending) and LastName (descending)");
	}
}
