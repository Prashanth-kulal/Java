
import java.util.Random;
public class TestPassword {
    public static void main(String[] args){
        
        String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower="abcdefghijklmnopqrstuvwxyz";
        String number="0123456789";
        String all=upper+lower+number;
        Random rand1=new Random();
        int r1=rand1.nextInt(25);
        int r2=rand1.nextInt(9);
        String s1="";
        s1=upper.substring(r1,r1+2)+lower.substring(r1,r1+2)+number.substring(r2,r2+2)+all.substring(r1,r1+2);
        System.out.println(s1);
        
        
       
    }
    
    }
    

