public class M4 {
    public static String reverse(String s1){
    int len1=s1.length();
    String s2="";
    for(int i=0;i<len1;i++){
        s2=s1.substring(i,i+1)+s2;
    }
    return s2;
}
public static void main(String[] args) {
    System.out.println(reverse("prashanth"));
}
}
