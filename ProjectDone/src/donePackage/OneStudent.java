package donePackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OneStudent implements Comparable<Object>{
	private String firstName;
	private String lastName;
	private Gender gender;
	private int id;
	private int yearOfStudy;

	public OneStudent(String s) throws Exception {
		String[] vals=s.split("[,;\\s;]+");
		if (vals.length!=5) 
			throw new Exception("filed number error: "+s);
		setGender(vals[0]);
		setFirstName(vals[1]);
		setLastName(vals[2]);
		setId(vals[3]);
		setYearOfStudy(vals[4]);
	}
	public void setFirstName(String s) throws Exception {
		Gender g= FirstNames.getGender(s);
		if (g==Gender.GENDER_EROPR)
			throw new Exception("Not proper first name: "+ s);
		if (g!=gender)
			throw new Exception("Gender mismatch: "+g+"\t"+gender+"\t"+s);
		firstName=s;
	}
	public void setLastName(String s) throws Exception {
		Pattern pt= Pattern.compile("([A-Z][a-z]*-[A-Z][a-z]*)|([A-Z][a-z]*)");
		Matcher mt =pt.matcher(s);
		if (!mt.find())
			throw new Exception("last name error: "+s);
		lastName=s;
	}
	public void setGender(String s) throws Exception {
		gender=Gender.fromString(s);
		if (gender==Gender.GENDER_EROPR)
			throw new Exception("Gender error: "+s);
		
	}
	public void setId(String s) throws Exception  {
		try {
		id=Integer.parseInt(s);
		} catch (Exception ex) {
			throw new Exception("id error: "+s);
		}
	}
	public String getFirstName() {
		return(firstName);
	}
	public String getLastName() {
		return(lastName);
	}
	public Gender getGender() {
		return(gender);
	}
	public int getId() {
		return(id);
	}
	public String toString() {
		return(firstName+"\t"+lastName+"\t"+gender+"\t"+id+"\t"+yearOfStudy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public int HashCode(){
		return (new Integer(id).hashCode());
	}
	public boolean equals(Object o) {
		if (o instanceof OneStudent) {
			OneStudent otherStudent=(OneStudent) o;
			return this.id==otherStudent.id;
		}
		return (false);
	}
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if (o instanceof OneStudent) {
			OneStudent otherStudent=(OneStudent) o;
			return (this.id-otherStudent.id);
		}
		return (-1);
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(String s) throws Exception{
		int temp = 0;
		try {
			temp = Integer.parseInt(s);
			} catch (Exception ex) {
				throw new Exception("year of study parsing error: "+s);
			}
		if(temp >=1 && temp <=6){
			yearOfStudy = temp;
		}
		else{
			throw new Exception("Not proper year of study: "+s);
		}
	}

}
