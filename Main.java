import java.util.*;
import java.lang.*;

class Main{
    public static void main(String[] args) {
        String str1,str2,str3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the three words in different line");
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        str3 = sc.nextLine();
        //String s1 = str3.toUpperCase();
        System.out.println(change(str1,1)+" "+change(str2,2)+" "+str3.toUpperCase());
    }
    public static String change(String str,int n){

        char[] A = str.toCharArray();
        int l=A.length;
        //String collect;
        if(n==1){
            for(int i=0;i<l;i++){
                if (A[i]=='a' ||A[i]=='e'|| A[i]=='i'||A[i]=='o'||A[i]=='u'||A[i]=='A' ||A[i]=='E'|| A[i]=='I'||A[i]=='O'||A[i]=='U' ){
                    A[i]='%';
                }
            }

        }
        if(n==2){
            for(int i=0;i<l;i++){
                if (A[i]!='a' && A[i]!='e'&& A[i]!='i'&& A[i]!='o'&& A[i]!='u'&& A[i]!='A' && A[i]!='E' &&  A[i]!='I'&& A[i]!='O'&& A[i]!='U' ){
                    A[i]='#';
                }
            }
        }
        return String.valueOf(A);
    }
}