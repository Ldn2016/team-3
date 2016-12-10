import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddReference {
    InternalDatabase internalDatabase;
    Input input = new Input();
    
    
    public  void addReference(){
        String referenceCode;
        do{
            referenceCode = input.read();
        }while(referenceCode.length() != 10);
        
        referenceCode = referenceCode.toUpperCase();
        internalDatabase.addToList(referenceCode);
        
        
    }
    
    public void setMainDatabase(InternalDatabase internalDatabase){
        this.database = internalDatabase;
    }
}
