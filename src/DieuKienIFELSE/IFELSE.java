package DieuKienIFELSE;

public class IFELSE {

    int number = 100;

    public void ts(int n){

        if (n == number) {
            System.out.println("TH1");
        }else if (n < number){
            System.out.println("TH2");
        }else if (n > number){
            System.out.println("TH3");
        }else {
            System.out.println("TH4");
        }
    }

    public static void main(String[] args) {
        IFELSE ifelse = new IFELSE();
        ifelse.ts(100);
    }



}
