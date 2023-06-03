
public class container {
    private char[] arr;
    private int conSize;
    private int arrSize;

    // Default Constructor.
    public container() {
        arr = new char[5];
        conSize = 0;
        arrSize = 5;
    }
    
    // Overloaded Constructor.
    public container(char[] arr, int conSize, int arrSize) {
        this.arr = arr;
        this.conSize = conSize;
        this.arrSize = arrSize;
    }

    public boolean isEmpty() {
        return (conSize==0);
    }    
    public void add(char in) {
        // Appends (in) into array while also incrementing conSize.
        arr[conSize++] = in;
    }
    public boolean remove(char in) {
        if (isEmpty()) return (false);
        for (int i = 0; i < conSize; i++) {
            if (arr[i] == in){
                conSize--;
                arr[i] = arr[conSize];
                return true;
            }
        }
        
        return false;
    }   
    
    
    public String toString(){
        String ret = "";
        for (int i = 0; i < conSize; i++) {
           ret += arr[i] + ", "; 
        }
        // ret += " conSize: " + conSize;
        // ret += ", arrSize: " + arrSize;
        return ret;
    }
    
}
