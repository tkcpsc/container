import java.util.TreeSet;

public class container {
    private TreeSet<Character> tree = new TreeSet<>();

    // Default Constructor.
    public container() {

    }
    
    // Overloaded Constructor.
    public container(TreeSet<Character> tree) {
        this.tree = tree;
    }

    public boolean isEmpty() {
        return (tree.size()==0);
    }    
    public void add(char in) {
        tree.add(in);
    }
    public boolean remove(char in) {
        return tree.remove(in);
    }   
    public String toString(){
        return tree.toString();
    }
    
}
