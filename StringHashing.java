import java.util.*;
public class StringHashing {
    public static long new1(String s){
        long hashvalue=0;
        long p=31;
        long pp=1;
        for(char ss:s.toCharArray()){
            hashvalue=hashvalue+(ss-'a'+1)*pp;
            pp*=p;
        }
        return hashvalue;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        long nn1=new1(n1);
        long nn2=new1(n2);
        System.out.println(nn1+" "+nn2);
        System.out.println(nn1==nn2?"Equal":"Not Equal");
    }
    
}
