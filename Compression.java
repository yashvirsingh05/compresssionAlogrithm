import java.util.Scanner;

public class Compression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        char c=' ';
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c!=ch[i]){
                if(count>0){
                    System.out.print(count);
                }
                System.out.print(ch[i]);
                c=ch[i];
               count=0;
            }
            count++;
        }
        System.out.print(count);
        }

}
