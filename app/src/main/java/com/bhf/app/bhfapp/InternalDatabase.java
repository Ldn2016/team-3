import java.util.*;

public class InternalDatabase{
	MainDatabase d = new MainDatabase();
	ArrayList<AddItem> database = new ArrayList<AddItem>();

	static InternalDatabase internal = new InternalDatabase();
	/*public static void main(String[] args){
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
}