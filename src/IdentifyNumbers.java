import java.util.LinkedList;

public class IdentifyNumbers {

    public static int TypeSymbol(char c){
        int i;
        if (c == '0' || c== '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            i = 1;                                                 //арабские
        }
        else if (c == '*' || c == '/' || c == '+' || c == '-'){   //умножение деление
            i = 2;
        }
        else if (c == 'I' || c == 'V' || c == 'X'){  //римские
            i = 3;
        }
        else if (c == ' ') {  //пробел
            i = 4;
        }
        else {
            i = 5;            //НЛО
        }
        return i;

    }

public static int Chislo(String s, int i){
        int chislo = 0;
        if (i == 1){
            chislo = Integer.parseInt(s);
        }
        if (i == 3) {
            switch (s) {
                case "I" :
                    chislo = 1;
                    break;
                case "II" :
                    chislo = 2;
                    break;
                case "III" :
                    chislo = 3;
                    break;
                case "IV" :
                    chislo = 4;
                    break;
                case "V" :
                    chislo = 5;
                    break;
                case "VI" :
                    chislo = 6;
                    break;
                case "VII" :
                    chislo = 7;
                    break;
                case "VIII" :
                    chislo = 8;
                    break;
                case "IX" :
                    chislo = 9;
                    break;
                case "X" :
                    chislo = 10;
                    break;
            }
        }


        return chislo;
    }


    public static LinkedList<Para> NumberSplit(String s){
        LinkedList<Para> stroka = new LinkedList<>();
        String element = "";
        int type = 0;
        int stringSize = s.length();

        for (int i = 0; i < stringSize; ++i){
            if (IdentifyNumbers.TypeSymbol(s.charAt(i)) == 4) {
                continue;
            }
            if (i == (stringSize-1) ) {

                element = element + s.charAt(i);
                type = IdentifyNumbers.TypeSymbol(s.charAt(i));
                //System.out.println(element);
                stroka.add(new Para(type, element));
                break;


            }
            if (IdentifyNumbers.TypeSymbol(s.charAt(i)) != IdentifyNumbers.TypeSymbol(s.charAt(i+1))){
                element = element + s.charAt(i);
                //System.out.println(element);
                type = IdentifyNumbers.TypeSymbol(s.charAt(i));
                stroka.add(new Para(type, element));
                element = "";
                continue;
            }
            if (IdentifyNumbers.TypeSymbol(s.charAt(i)) == type || element.isEmpty()) {
                element = element + s.charAt(i);
                type = IdentifyNumbers.TypeSymbol(s.charAt(i));

            }
        }


        return stroka;
    }

public static String ConvertRim(int c){
        String answer = "";
        if (c <= 0){
            return "Cannot!";
        }

        int sot = 0, des = 0, edin = 0;
        sot = c / 100;
        des = (c - 100*sot) / 10;
        edin = (c - 100*sot - 10*des);

        if (sot == 1) {
            return "C";
        }
        switch (des) {
            case 1:
                answer = answer + "X";
                break;

            case 2:
                answer = answer + "XX";
                break;
            case 3:
                answer = answer + "XXX";
                break;
            case 4:
                answer = answer + "XL";
                break;
            case 5:
                answer = answer + "L";
                break;
            case 6:
                answer = answer + "LX";
                break;
            case 7:
                answer = answer + "LXX";
                break;
            case 8:
                answer = answer + "LXXX";
                break;
            case 9:
                answer = answer + "XC";
                break;
        }
        switch (edin) {
            case 1:
                answer = answer + "I";
                break;

            case 2:
                answer = answer + "II";
                break;
            case 3:
                answer = answer + "III";
                break;
            case 4:
                answer = answer + "IV";
                break;
            case 5:
                answer = answer + "V";
                break;
            case 6:
                answer = answer + "VI";
                break;
            case 7:
                answer = answer + "VII";
                break;
            case 8:
                answer = answer + "VIII";
                break;
            case 9:
                answer = answer + "IX";
                break;

        }
return answer;


}

}




