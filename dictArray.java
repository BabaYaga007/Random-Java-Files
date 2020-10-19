// Array Implementation of Dictionary (Passed 2/5 test cases, others TLE)

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] names= new String[n];
        int[] phones = new int[n];
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            names[i]=name;
            phones[i]=phone;
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            int flag=0;
            for(int j=0;j<n;j++) {
                if(names[j].equalsIgnoreCase(s)) {
                    System.out.println(names[j]+"="+phones[j]);
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}