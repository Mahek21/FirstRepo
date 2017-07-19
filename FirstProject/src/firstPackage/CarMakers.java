package firstPackage;

public enum CarMakers {
	FIAT("FIat"), FORD("Ford"), VOLVO("volvo"), BMW("BMW"), CHRYSLER("chrysler"),
	GM("gm"), NOTKNOWN("Notknown");
	
	private String strg;
	
	CarMakers(String str){
		strg = str;
	}
	
	public String toString()
	{
		if(strg.equalsIgnoreCase("BMW") || strg.equalsIgnoreCase("GM"))
		{
			return strg.toUpperCase();
		}
		else
		{
			strg = strg.toLowerCase();
			char c = strg.charAt(0);
			String temp = c+"";
			temp = temp.toUpperCase();
			strg = strg.replace(c, temp.charAt(0));
		}
		return strg;	
	}
	
	public CarMakers fromString(String str)
	{
		switch(str.toLowerCase()){
		case ("volvo"):
			return(VOLVO);
		case ("ford"):
			return(FORD);
		case ("fiat"):
			return(FIAT);
		case ("bmw"):
			return(BMW);
		case ("gm"):
			return(GM);
		case ("chrysler"):
			return(CHRYSLER);
		}
		
		return (NOTKNOWN);	
	}
}
