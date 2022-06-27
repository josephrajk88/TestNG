package Java;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {
public static void main(String[] args) {
	List <Object> List1 = new ArrayList<>();
	List1.add ("Oraniam");
	List1.add ("True");
	List1.add ("J");
	List1.add (100);
	
	Object o1=List1.get(0);
	
	List <Object> List2 = new ArrayList<>();
	List2.add("X");
	List2.add(10);
	
	List <Object> List3 = new ArrayList<>();
	List3.add("Y");
	List3.add(20);
	
	List <Object> List4 = new ArrayList<>();
	List4.add("Z");
	List4.add(30);
	
	List <List <Object>> BigList=new ArrayList<>();
	BigList.add(List1);
	BigList.add(List2);
	BigList.add(List3);
	BigList.add(List4);
	
	System.out.println("BigList Is--"+BigList);   //BigList Is--[[Oraniam, True, J, 100], [X, 10], [Y, 20], [Z, 30]]
	List <Object> List5 =  BigList.get(1);
	System.out.println(List5);
	Object obj=List5.get(0);
	System.out.println(obj);
	
	//Easiest Method below
	System.out.println(BigList.get(0).get(1));
	System.out.println(BigList.get(3).get(1));
	
}

}
