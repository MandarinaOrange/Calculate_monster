
import com.sun.tools.javac.util.Pair;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;


public class Main {


public boolean mmmSatisfaction(LinkedList<Para> mmm) {

    if (mmm.size() != 3) {
        return false;
    }
    if (mmm.get(0).type != mmm.get(2).type) {
    return false;
    }
    if (mmm.get(1).type != 2) {
        return false;
    }
    if (mmm.get(0).type != 1 || mmm.get(0).type != 3) {
        return false;
    }



    return true;
}


/*   public static List<Pair<Integer, String>> Function (String s){
        List<Pair<Integer, String>> kaka = new ArrayList<>();
        kaka.add(new Pair<>(1, s));
        return kaka;
   }*/


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

        for (Para kotik : kotiki){
            kotik.showme();
        }

        System.out.println(kotiki.get(0).element);

























    }


}