package crux_online.basics;
public class ConditionalDemo {

    public static void main(String[] args) {
        int a = 10, b=20, c=30;
        if(a<b){
            System.out.println("in if");
        }else{
            System.out.println("in else");
        }

        if(c<b){
            System.out.println("in if");
        }else{
            System.out.println("in else");
        }
    }
}