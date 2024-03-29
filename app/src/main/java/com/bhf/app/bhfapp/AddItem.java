package com.bhf.app.bhfapp;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.*;

public class AddItem {
	
	String refNumber;
	String object;
	boolean status;
	int points;
	static Date currentDate;
	
	public AddItem(String refNumber, String object, boolean status, int points, Date currentDate){
		this.refNumber = refNumber;
		this.object = object;
		this.status = status;
		this.points = points;
		this.currentDate = new Date();
	}
	
	public String getRefNumber(){
		return refNumber;
	}
	public String getObject(){
		return object;
	}
	public boolean getStatus(){
		return status;
	}
	public int getPoints(){
		return points;
	}
	public Date getCurrentDate(){
		return currentDate;
	}
}
