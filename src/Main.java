
import com.sun.tools.javac.util.Pair;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Main {


public static boolean mmmSatisfaction(LinkedList<Para> mmm) {

    if (mmm.size() != 3) {
        System.out.print("first");

        return false;
    }
    if (mmm.get(0).type != mmm.get(2).type) {
        System.out.print("second");
    return false;
    }
    if (mmm.get(1).type != 2) {
        System.out.print("third");
        return false;
    }
    if (mmm.get(0).type != 1 && mmm.get(0).type != 3) {
        System.out.print("fourth");
        return false;
    }
    if(mmm.get(1).element.length() != 1){
        System.out.print("fifth");
        return false;
    }
    return true;
}

public static int Calcula (int a, int b, String s){
    int c = 0;
    if (a <= 10 && a >= 1 && b <= 10 && b >= 1 && s.length() == 1){
        switch (s){
            case "+":
              c = a + b;
              break;

            case "-" :
                c = a - b;
                break;

            case "*" :
                c = a * b;
                break;

            case "/" :
                c = a / b;
                break;

        }
    }
    return c;

}



    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner keyboard = new Scanner (System.in);
        String primer = keyboard.nextLine();

        LinkedList<Para> kotiki = new LinkedList<>();
        kotiki = IdentifyNumbers.NumberSplit(primer);





/*        String element = "";
        char c = '4';
        element = element + c;
        System.out.println(element.isEmpty() + "  " + element);
        int j = IdentifyNumbers.TypeSymbol(primer.charAt(0));
        System.out.println(j);*/


        int c = 0;
        String c1 = "";

        if (mmmSatisfaction(kotiki)){
            int a = IdentifyNumbers.Chislo(kotiki.get(0).element, kotiki.get(0).type);
            int b = IdentifyNumbers.Chislo(kotiki.get(2).element, kotiki.get(2).type);
            c = Calcula(a,b,kotiki.get(1).element);
            //System.out.println("Answer " + c);

        }
        else {
            System.out.println("No answer");
        }


        if (kotiki.get(0).type == 3){
            c1 = IdentifyNumbers.ConvertRim(c);
            System.out.println(c1);
        }
        else if (kotiki.get(0).type == 1){
            System.out.println(c);
        }


    }


}