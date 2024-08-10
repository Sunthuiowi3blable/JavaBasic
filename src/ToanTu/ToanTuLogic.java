package ToanTu;

public class ToanTuLogic {

    int a = 3;
    int b = 9;
    int c = 23;

    public boolean GT1(){
        return ((a>b)&&(c<b));
    }

    public boolean GT2(){
        return ((a<b)&&(b<c));
    }

    public boolean GT3(){
        return ((a<b)||(b>c));
    }

    public boolean GT4(){
        return ((a>c)||(b>c));
    }
    public static void main(String[] args) {

        ToanTuLogic toantulogic = new ToanTuLogic();

    //Toán tử logic &&
        System.out.println("Giá trị thứ 1: " + toantulogic.GT1());
        System.out.println("Giá trị thứ 2: " + toantulogic.GT2());

    //Toán tử logic ||
        System.out.println("Giá trị thứ 3: " + toantulogic.GT3());
        System.out.println("Giá trị thứ 4: " + toantulogic.GT4());

    }

}
