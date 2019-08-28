package day1examples;

public class emp {

	
		private String companyname;
		private String empname;
		private String decision;
		private int empna;
		private String salary;

		public void store(String string1,String string2,String string3,String string4,int tempna)
		{
			companyname=string1;
			empname=string2;
			decision=string3;
			salary=string4;
			empna=tempna;
	}
		public void view()
		{
			System.out.println("Company name    :"+companyname);
			System.out.println("Employee name   :"+empname);
			System.out.println("Decision        :"+decision);
			System.out.println("Salary          :"+salary);
			System.out.println("Employee number :"+empna);
			System.out.println("-----------next--------------");
			
		}
		
		public static void main(String[] args) {
			emp kesavan=new emp();
			emp  raja=new emp();
			
			kesavan.store("cts","kesavan","developer","75000",258);
			raja.store("tcs","raja","designer","60000",589);
			kesavan.view();
			raja.view();
			}
}
