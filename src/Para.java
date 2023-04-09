class Para
{
    int type;
    String element;

    // static int count = 0;
    Para(int a, String b){
        this.type = a;
        this.element = b;
        //count++;
    }

    void showme(){
        System.out.println(type + "  " + element);
    }


}
