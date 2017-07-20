package secondPackage;

import java.util.Vector;


public class OneStudent {

	private Gender gender;
	private String firstName;
	private String lastName;
	private int id;
	private final String filePath = "D:\\Users\\student-2017\\Desktop\\PopularNames.txt";
	private PatternMatch patternmatch;
	
	{
		gender = Gender.ERROR;
	}

	public OneStudent(String input) throws Exception{
		super();
		String[] ar = input.trim().split("[;]", 4);
		if(ar.length >3 && ar.length <5){
			try{
				// Checking first @param : gender 
				if(ar[0].equalsIgnoreCase("M") || ar[0].equalsIgnoreCase("F") 
					|| ar[0].equalsIgnoreCase("Male") || ar[0].equalsIgnoreCase("Female")){
					setGender(gender.fromString(ar[0]));
				}
				else{
					throw new Exception("Input " + ar[0] + " is not allowed!");
				}
				// Checking second @param : firstName
				//ftv = new ReadFile();
				Vector<String> vec = new Vector<String>();
				vec = ReadFile.read(filePath);
				int count = 0;
				for (String s: vec) {
					if(s.equalsIgnoreCase(ar[1])){
						setFirstName(s);
						count++;
						break;
					}
				}
				if(count == 0){
					throw new Exception(ar[1]+" not found in the name directory!");
				}
				//Checking third @param : lastName
				boolean checkLastName = PatternMatch.patternMatch(ar[2], "([A-Z][a-z]*-[A-Z][a-z]*)|([A-Z][a-z]*)");
				if(checkLastName){
					setLastName(ar[2]);
				}
				else{
					throw new Exception("Input " + ar[2] +" is invalid");
				}
			
			}
			catch(Exception e){
				throw new Exception(""+e);
			}
		}
		else{
			throw new Exception("You need 4 input parameters, but there's only "+ar.length);
		}
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
