import java.util.*;

public class InternalDatabase{
	static MainDatabase d = new MainDatabase();
	ArrayList<AddItem> database = new ArrayList<AddItem>();
	static InternalDatabase internal = new InternalDatabase();
	
	/*public static void main(String[] args){
		internal.addToList("ABCDEFGHIJ");
		d.addItem("ABCDEFGHIJ", "Bed", false, 10);
		internal.addToList("ABCDEFGHIJ");
	}*/

	
	public void addToList(String refNumber){
		if(d.checkRef(refNumber)==null){
			System.out.println("Invalid reference code");
		}
		else{
			database.add(d.checkRef(refNumber));
		}
	}
	
	public String[][] getInternalDatabase{
	    String [][] databaseAsStr;
	    String[] temp;
	    int n;
	    DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	    
	    for(int i = 0; i < database.length(); i++){
	        
	        n = 0;
	        databaseAsStr[i][n++] = database.get(i).getRefNumber();
	        databaseAsStr[i][n++] = database.get(i).getObject();
	        databaseAsStr[i][n++] = Integer.toString(database.get(i).getPoints());
	        databaseAsStr[i][n++] = df.format(database.get(i).getCurrentDate());
	        
	    }
	    return databaseAsStr;
	}
	
}
