
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        StringFunctions stringfunctions = new StringFunctions();
        Boolean output;
        String outputString = new String();
        output = stringfunctions.doubleX("axxbb");
        System.out.println("Hello doubleX(\"axxbb\") "+output);
        output = stringfunctions.doubleX("axaxax");
        System.out.println("Hello doubleX(\"axaxax\") "+output);
        stringfunctions.doubleX("xxxxx");
        System.out.println("Hello");

    }
}