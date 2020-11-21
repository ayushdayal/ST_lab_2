import static java.lang.Integer.min;

public class Main {
    public static float bill(int mint) {
        float amount = 0;
        int time;

        if(mint>0){
            amount+= 300;
            mint-=120;
        }
        if(mint>0){
            time=min(70,mint);
            amount+=time;
            mint-=70;
        }
        if(mint>0){
            time=min(50,mint);
            amount+=0.8*time;
            mint-=50;
        }
        if(mint>0)
            amount+=0.4*mint;
        return amount;
    }

    public static void main(String[] args) {
       System.out.println(bill(300));
    }
}
