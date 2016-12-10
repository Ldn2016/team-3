package com.bhf.app.bhfapp;

import java.lang.reflect.Array;
import java.util.*;

public class InternalDatabase{
//	static MainDatabase d = new MainDatabase();
	ArrayList<AddItem> database = new ArrayList<AddItem>();
	static InternalDatabase internal = new InternalDatabase();
	
	/*public static void main(String[] args){
		internal.addToList("ABCDEFGHIJ");

		internal.addToList("ABCDEFGHIJ");
	}*/
	public InternalDatabase(){
		database.add(new AddItem("ABCDEFGHIJ", "Bed", false, 10, new Date()));

	}
	
//	public void addToList(String refNumber){
//		if(d.checkRef(refNumber)==null){
//			System.out.println("Invalid reference code");
//		}
//		else{
//			database.add(d.checkRef(refNumber));
//		}
//	}
	public ArrayList<AddItem> getDatabase(){
		return database;
	}
}
