package controlflow;

public class lesson24_break_continue {
    public static void main(String[] args){

        // break = break out of a loop (stop)
        // continue = skip current iteration of a loop (skip)

        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
