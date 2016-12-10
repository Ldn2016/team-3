import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AddReference {
    
    Input input = new Input();
    
    
    public  void addReference(){
        String referenceCode;
        do{
            referenceCode = input.read();
        }while(referenceCode.length() != 10);
        
        referenceCode = referenceCode.toUpperCase();
        
    }
}
