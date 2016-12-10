public class InternalDatabase{
	MainDatabase d = new MainDatabase();
	ArrayList<AddItem> database = new ArrayList<AddItem>();
	public static void main(String[] args){
	    addToList("ABCDEFGHIJ");
	}
	
	public void addToList(String refNumber){
		try{
			database.add(d.checkRef(refNumber));
		}
		catch(Exception e){
			System.out.println("Invalid reference code.");
		}
	}
}