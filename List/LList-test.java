package LList;
import java.awt.event.ActionEvent;

public class test_list {
    public static void main(String args[]){
        LList aList = new LList();
        aList.append(new Node("7", null));
        aList.append(new Node("4", null));
        aList.append(new Node("2", null));
        aList.append(new Node("1", null));
        aList.append(new Node("5", null));
        aList.append(new Node("9", null));
        aList.print();
        System.out.println();
        aList.first_append(new Node("0",null));
        System.out.println(aList.pop());
        System.out.println(aList.pop());
        aList.print();
        System.out.println();
        System.out.println(aList.first_pop());
        System.out.println(aList.first_pop());
        aList.print();
        System.out.println();
        aList.sorting();
        aList.print();
        System.out.println("\n" + gcd(27, 75));
    }

    public static int gcd(int x, int y){
        if(y == 0) {
            return x;
        }
        return gcd(y, x % y);
    }
}
