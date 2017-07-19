package com.mahek.practiceone;

public class Student {
	private  Gender  gender;
	private  long id;
	private  int age;
	private  double  sleepHours; //total sleephours
	private  double  lastSleepHours; //last sleephours 
	private  int  noOfSleeps; //no. of sleeps  
	
	
	{
		gender = Gender.ERROR;
	}
	
	public Student(){
		gender = Gender.ERROR;
		id = 0;
		age = 0;
		sleepHours = 0;
		lastSleepHours = 0;
		noOfSleeps = 0;
	}
	
	// 999;21;Female
	public  Student(String  line)  throws Exception {
		String[] ar = line.split("[;]", 3);
		if(ar.length >2){
			try{
			setId(Integer.parseInt(ar[0]));
			setAge(Integer.parseInt(ar[1]));
			setGender(gender.fromString(ar[2]));
			}
			catch(Exception e){
				throw new Exception(""+e);
			}
		}
		else{
			throw new Exception("Input Invalid");
		}
	}
	
	public  boolean gotoSleep(int  hr)  {   //    1< hr < 12...
		if(hr > 1 && hr < 12){
			sleepHours += hr;
			lastSleepHours = hr;
			noOfSleeps++;
			return true;
		}
		else{}
		return false;
		
	}
	public  double  getLastSleepLength()  throws  Exception {
		return lastSleepHours;
			
	}
	public  double  getAverageSleepLength()  throws Exception {
		try{
		return sleepHours/noOfSleeps;
		}
		catch(Exception e){
			throw new Exception(""+e);
		}
			
	}
	public  String  toString()  {
		String  res="";res+=id+"\t"+age+"\t"+gender.toString();
		return(res);
		}

	public double getSleepHours() {
		return sleepHours;
	}
	
	protected void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public int getNoOfSleeps() {
		return noOfSleeps;
	}
	
	public int simpleAdd(int a, int b){
		return a + b;
	}
	
	
	
}


