public class M3 {
    public static void reverse(String s1){
        int len1=s1.length();
        String s2="";
        for(int i=0;i<len1;i++){
            s2=s1.substring(i,i+1)+s2;
        }
        System.out.println("reversed string="+s2);
    }
    public static void main(String[] args) {
        reverse("ABCDE");
        reverse("prashanth");
        reverse("poorvik");
    }
}
