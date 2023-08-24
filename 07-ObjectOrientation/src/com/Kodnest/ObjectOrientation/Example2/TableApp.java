package com.Kodnest.ObjectOrientation.Example2;
public class TableApp {
	public static void main(String[] args) {
		Table t1 = new Table();
		Table t2 = new Table();
		t1.seatingCapacity = 6;
		t1.cost = 4500;
		t1.color = "Brown";
		t1.brand = "Green ply";
		t1.allowsToSit();
		t1.allowToWrite();
		System.out.println(t1.seatingCapacity+" "+t1.cost+" "+t1.color+" "+t1.brand);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		t2.seatingCapacity = 4;
		t2.cost = 3500;
		t2.color = "Black";
		t2.brand = "Green ply";
		t2.allowsToSit();
		t2.allowToWrite();
		System.out.println(t2.seatingCapacity+" "+t2.cost+" "+t2.color+" "+t2.brand);
	}
}