package test00;
import java.util.*;
public class test03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int dx = 0,dy=0;
        int wx = 15,wy=15;

        int dc = 0,wc=0;
        for(int i=0;i<256;i++){
            char D = s1.charAt(i);
            char W = s2.charAt(i);
            if(D == 'U'){
                if(dx>0){
                    dx-=1;
                }

            }
            if(D == 'D'){
                if(dx<15){
                    dx-=1;
                }

            }
            if(D == 'R'){
                if(dy<15){
                    dy+=1;
                }

            }
            if(D == 'L'){
                if(dx<15){
                    dx-=1;
                }

            }
        }



    }






}
