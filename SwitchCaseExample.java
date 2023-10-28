import java.util.*;
public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch (str) {
            case "abc":
                System.out.println("there is abc");
                break;
            
            case "xyz":
                System.out.println("there is xyz");
                break;

            default:
            System.out.println("no condition matches");
                break;
        }
        sc.close();
    }
}
