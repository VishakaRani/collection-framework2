package framework2;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al1=new ArrayList();
		Student s1=new Student(1,"vishaka");
		//adding elements into array list
		Integer i=new Integer(10);
		al1.add(i);
		al1.add(new String ("vishakaRani"));
		al1.add("vish");
		al1.add(s1);
		System.out.println(al1.size());
		System.out.println(al1.get(2));
		al1.set(2, "madhu");
		System.out.println(al1.get(2));
		al1.remove(2);
		//System.out.println(al1);	
		
		ArrayList al2=new ArrayList();
		al2.addAll(al1);
		al2.add("java");
		
		Iterator it1=(Iterator)al2.iterator();
		while (it1.next())
		{
			Object o=(it1.next());
			System.out.println(o);
		
	}

}


}
