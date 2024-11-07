public class M2 {
    public static void main(String[] args) {
        String s1="ABCDE";
        int len1=s1.length();
        String s2="";
        for(int i=0;i<len1;i++){
            s2=s1.substring(i,i+1)+s2;
        }
        System.out.println(s2);
    }
}
