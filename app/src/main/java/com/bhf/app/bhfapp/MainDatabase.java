package com.bhf.app.bhfapp;

import com.bhf.app.bhfapp.AddItem;

import java.util.*;
import java.util.Date;
import java.util.HashMap;

public class MainDatabase {
	Date currentDate = new Date();
	HashMap<String, AddItem> database = new HashMap();

	public void addItem(String refNumber, String object, boolean status, int points){
		database.put(refNumber, new AddItem(refNumber, object, status, points, currentDate));
		
	}
	
	public AddItem checkRef(String refNumber){
		return database.get(refNumber);
	}
}
