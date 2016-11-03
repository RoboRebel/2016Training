/**
 * Created by adamu on 10/31/2016.
 */
public class Test {
    public static void main(String args[]){
        int x = 12;
        x = myFunction(x);
        System.out.println(x);
    }
    private static int myFunction(int input){
        int output = input * 3;
        return output;
    }

}
