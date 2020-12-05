package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Book{
	int id;
	String name,State,City,Hometown;
	int Salary;
	public Book(int id, String name, String State, String City, String Hometown, int Salary) {
		this.id=id;
		this.name=name;
		this.State=State;
		this.City=City;
		this.Hometown=Hometown;
		this.Salary=Salary;
		
	}
}


public class Constructor {
	public static void main(String[] args) {
		
	Set<Book>obj=new HashSet<Book>();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																							
	Book b1=new Book(1,"paru","AP","bhimavaram","gnp",1000);
	Book b2=new Book(2,"ganga","Ap","bvrm","tpg",20000);
	Book b3=new Book(3,"devi","TS","CH","Ongole",40000);
	obj.add(b1);
	obj.add(b2);
	obj.add(b3);
	for(Book e:obj) {
		System.out.println(e.id+" "+e.name+" "+e.State+" "+e.City+" "+e.Hometown);
	}
	
	}
}