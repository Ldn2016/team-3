public class MainDatabase{
	ArrayList<AddItem> list = new ArrayList<AddItem>();
	Date currentDate = new Date();
	
	public void addItem(String refNumber, String object, boolean status, int points, Date currentDate){
		list.add(AddItem(refNumber, object, status, points, currentDate))
	}
	
}