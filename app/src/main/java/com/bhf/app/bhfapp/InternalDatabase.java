package com.bhf.app.bhfapp;

import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class InternalDatabase{
	static ArrayList<AddItem> database = new ArrayList<AddItem>();
	static InternalDatabase internal = new InternalDatabase();
	
	/*public static void main(String[] args){
		internal.addToList("ABCDEFGHIJ");

		internal.addToList("ABCDEFGHIJ");
	}*/

	public static void addToList(String refNumber){
		if(MainDatabase.checkRef(refNumber)==null){
			//go back to invalid
		}
		else{
			database.add(MainDatabase.checkRef(refNumber));
		}
	}
	public ArrayList<AddItem> getDatabase(){
		return database;
	}

	public String[][] getInternalDatabase(){
		String[][] databaseAsStr = new String[database.size()][];
		String[] temp;
		int n;
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


		for(int i = 0; i < database.size(); i++){

			n = 0;
			databaseAsStr[i][n++] = database.get(i).getRefNumber();
			databaseAsStr[i][n++] = database.get(i).getObject();
			databaseAsStr[i][n++] = Integer.toString(database.get(i).getPoints());
			databaseAsStr[i][n++] = df.format(database.get(i).getCurrentDate());

		}
		return databaseAsStr;
	}

}
