package secondPackage;


public enum Gender {
	MALE("male"), FEMALE("female"), ERROR("error");
	
	private String str;
	
	Gender(String gen){
		str = gen;
	}
	
	public Gender fromString(String str)
	{
		switch(str.toLowerCase()){
		case ("male"):
			return(MALE);
		case ("female"):
			return(FEMALE);
		case ("m"):
			return(MALE);
		case ("f"):
			return(FEMALE);
		}
		return (ERROR);	
	}
	
	public String toString(){
		return str;
	}
	
}
