package methodwithreturntype;

public class Finalmarks {

	public static void main(String[] args) {
		System.out.println("welcpme back");
		
	int	telMarks = teluguMarks();
int engMarks = englishMarks();
	int sciMarks =scienceMarks();
	 int totalmarks=(telMarks +engMarks+sciMarks);
	 
	System.out.println("total marks :"+(telMarks +engMarks+sciMarks));
	percentage();


	}
	static int teluguMarks()
	{
		int telugumarks = 99;
		System.out.println("telugu marks"+telugumarks);
		return telugumarks;
	}
	static int scienceMarks()
	
	{
		int psmarks =40;
		int nsmarks =50;
	int	scmarks = psmarks +nsmarks ;
	System.out.println("science marks"+scmarks);
		return scmarks;
	}

	static int englishMarks()
	{
	
		int paper1 = 50;
		int paper2 = 49;
		int engmarks=paper1+paper2;
		System.out.println("english marks"+engmarks);
		return engmarks;
	}
	static int totalmarks()
	{
		int	telMarks = teluguMarks();
		int engMarks = englishMarks();
			int sciMarks =scienceMarks();
			 int totalmarks=(telMarks +engMarks+sciMarks);
		return totalmarks;
		
	}
	static float percentage()
	{
		float percentage =(totalmarks()/300f)*100;
		System.out.println("percentage is :"+percentage);
		return  percentage;
	}
}




//
//int getMathMarks()
//int getScienceMarks()
//int getEnglishMarks()
//int getTotalMarks()
//double getPercentage()
//char getGrade()
////package com.langfunda.methods;
//
////methods with no arguments + with return return type.
//public class EmployeeSalaryInfo {
//
//	void main() {
//		System.out.println("main method started ");
//
//		double total_sal = getSalaryInfo();
//		double bon = getBonus();
//
//		System.out.println("Total Salary is : " + (total_sal + bon));
//
//		System.out.println("main method ended ");
//	}
//
//	double getBonus() {
//		double bonus = 15000.00;
//		return bonus;
//	}
//
//	double getSalaryInfo() {
//		double totalSalary = 0;
//
//		double sal = 100000.00;
//		double hra = 35000.00;
//
//		totalSalary = sal + hra;
//
//		return totalSalary;
//
//	}
//
//}give me 50+senario