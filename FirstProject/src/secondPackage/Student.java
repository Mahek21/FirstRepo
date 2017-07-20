package secondPackage;

import java.util.Vector;

public class Student {

	private final String filePath = "D:\\Users\\student-2017\\Desktop\\PopularNames.txt";

	protected Vector<OneStudent> data = new Vector<OneStudent>();

	public void readFromFile(String fn) throws Exception {
		Vector<String> inData = ReadFile.read(fn);
		for (String line : inData) {
			try {
				OneStudent one = new OneStudent(line);
				data.add(one);
			} catch (Exception ex) {
				System.err.print("error in " + line + "\n");
			}
		}
	}

	public Vector<OneStudent> getStundets() {
		return (data);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			OneStudent stu = new OneStudent("M;John;Brown;21");
	}

}
