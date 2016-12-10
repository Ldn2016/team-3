import java.util.*;

public class InternalDatabase{
	MainDatabase d = new MainDatabase();
	ArrayList<AddItem> database = new ArrayList<AddItem>();
<<<<<<< HEAD
	//public static void main(String[] args){
	  //  addToList("ABCDEFGHIJ");
	//}
=======
	static InternalDatabase internal = new InternalDatabase();
	/*public static void main(String[] args){
		internal.addToList("ABCDEFGHIJ");
	}*/
>>>>>>> af7f07dacaaf295fa4b5909c02e55223f6568321
	
	public void addToList(String refNumber){
		if(d.checkRef(refNumber)==null){
			System.out.println("Invalid reference code");
		}
		else{
			database.add(d.checkRef(refNumber));
		}
	}
}