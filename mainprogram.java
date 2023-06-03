/**
 * mainprogram
 */
public class mainprogram {

    public static void main(String[] args) {
        container c1 = new container();
        c1.add('A');
        System.out.println(c1);
        c1.add('B');
        System.out.println(c1);
        c1.remove('B');
        System.out.println(c1);
        c1.remove('A');
        System.out.println(c1);
        

    }
}