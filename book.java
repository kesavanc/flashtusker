/**
 * 
 */
package day1examples;

public class book {
	String bookname;
	String authorname;
	String publishername;
	int price;

public void store(String string1,String string2,String string3,int tprice)
	{
	      bookname=string1;
		  authorname=string2;
		 publishername=string3;
		price=tprice;
	}
public void display()
{
	System.out.println("Bookname      :"+bookname);
	System.out.println("Authorname    :"+authorname);
	System.out.println("Publishername :"+publishername);
	System.out.println("Price         :"+price);
	System.out.println("------------th---------------");
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book java= new book();
		book oracle=new book();
		
		java.store("javalanguage","kes","sun",250 );
		
		oracle.store("oraclelanguage","bill","mi",580);
		java.display();
		oracle.display();
		

	

		
	}

}
