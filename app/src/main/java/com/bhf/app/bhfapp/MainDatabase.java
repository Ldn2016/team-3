
package com.bhf.app.bhfapp;

import com.bhf.app.bhfapp.AddItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MainDatabase {
	static Date currentDate = new Date();
	static HashMap<String, AddItem[]> database = new HashMap();
	//int[] array = {1,2};

	public MainDatabase(){
		addItem();
	}
	public static void addItem(){
		AddItem[] array = {new AddItem ("ABCDEFGHIJ", "Bed", false, 125, currentDate), new AddItem("ABCDEFGHIJ", "Mug", false, 5, currentDate)};
		database.put("ABCDEFGHIJ", array);

		array = {new AddItem("BCDEFGHIJA", "Mug", false, 5, currentDate)};
		database.put("BCDEFGHIJA", array);

		database.put("CDEFGHIJAB", new AddItem("CDEFGHIJAB", "t-shirt", false, 10, currentDate));
		database.put("DEFGHIJABC", new AddItem("DEFGHIJABC", "CD", false, 5, currentDate));
		database.put("EFGHIJABCD", new AddItem("EFGHIJABCD", "Shoes", false, 12, currentDate));
		database.put("FGHIJABCDE", new AddItem("FGHIJABCDE", "Hat", false, 5, currentDate));
		database.put("GHIJABCDEF", new AddItem("GHIJABCDEF", "Wardrobe", false, 100, currentDate));
		database.put("HIJABCDEFG", new AddItem("HIJABCDEFG", "Watch", false, 50, currentDate));
		//many other items will be included and other which can be specified
	}
	
	public static AddItem checkRef(String refNumber){
		return database.get(refNumber);
	}
}
