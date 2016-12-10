import com.bhf.app.bhfapp.AddItem;

import java.util.ArrayList;
import java.util.Date;

public class MainDatabase{
	ArrayList<AddItem> list = new ArrayList<AddItem>();
	Date currentDate = new Date();

	public void addItem(String refNumber, String object, boolean status, int points, Date currentDate){
		list.add(AddItem(refNumber, object, status, points, currentDate));
	}
	
}