package secondPackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ReadFile {

	public Vector<String> read(String fn) throws IOException {
		Vector<String> result= new Vector<String>();
		Scanner sc= new Scanner(new File(fn)); 
		while (sc.hasNextLine()) {
			String line= sc.nextLine();
			result.add(line);
		}
		sc.close();
		/*for (String s: result) {
			System.out.print(s);
		}*/
		return(result);
	}
}
