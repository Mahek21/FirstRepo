package com.mahek.practiceone;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Boolean var;
		Student stu = new Student("999;21;MaLe");
		var = stu.gotoSleep(10);
		if(var == false){
			throw new Exception("Woah! You are'nt allowed to sleep now.");
		}
		System.out.println(stu.toString());
		System.out.println("The Average Sleep Length : " + stu.getAverageSleepLength());
		System.out.println("The Last Sleep Length : " + stu.getLastSleepLength());
		System.out.println("The No. of Sleeps : " + stu.getNoOfSleeps());
		System.out.println("The Total Sleep Hours : " + stu.getSleepHours());
	}

}
