package com.Kodnest.ObjectOrientation.Example1;
public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.eat();
		s2.study();
		s1.sleep();
		s2.eat();
		s1.id = 1;
		s1.name = "Balaji";
		s1.age = 22;
		s1.branch = "CS";
		s2.id = 2;
		s2.name = "Sahana";
		s2.age = 23;
		s2.branch = "EC";
		System.out.println(s1.id+" "+s1.name+" "+s1.age+" "+s1.branch);
		System.out.println(s2.id+" "+s2.name+" "+s2.age+" "+s2.branch);
	}
}
