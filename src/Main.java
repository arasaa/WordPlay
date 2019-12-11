import java.util.*;

public class Main {

    public static void main(String[] args) {



        Scanner count = new Scanner(System.in);
        System.out.println("write ... ");
        String outPut = count.nextLine();
        System.out.println("\nchar  " + myCharNumerate(outPut));
        System.out.println("\n______________________________________________________________________________");
        System.out.println("words  " + myWordNumerate(outPut));
        System.out.println("\n______________________________________________________________________________");
        System.out.println("sentence  " + mySenteceNumerate(outPut));
        System.out.println("\n______________________________________________________________________________");
        System.out.println("long word is " + lengthiestString(outPut));
        System.out.println("\n______________________________________________________________________________");
        System.out.println("long sentence is  " + lengthiestString1(outPut));
        System.out.println("\n______________________________________________________________________________");


        String[] word = outPut.split(" ");
        Map<String , Integer> wordMap = new HashMap<>();

        for(String str : word){
            if(wordMap.get(str) !=null){
                wordMap.put(str , wordMap.get(str) + 1);
            }else{
                wordMap.put(str , 1);
            }
        }
        Set<String> str2 = wordMap.keySet();
        for(String str : str2){
            if (wordMap.get(str) > 1 ){
                System.out.println(" word :  " + str + " repeated :  " + wordMap.get(str) + " time :  ");

            }
        }
    }
public static int myCharNumerate(String a) {

        int countt = 0;

        for (int i = 0; i < a.length(); i++) {
        if (a.charAt(i) == ' ' || a.charAt(i) == '.') {
        countt++;
        }
        }
        return (a.length() - countt);
        }


public static int myWordNumerate(String b) {
        int count1 = 0;
        for (int i = 0; i < b.length(); i++) {
        if (b.charAt(i) == ' ') {
        count1++;
        }
        }
        return (count1 + 1);
        }

public static int mySenteceNumerate(String n) {
        int count2 = 0;
        for (int i = 0; i < n.length(); i++) {
        if (n.charAt(i) == '.') {
        count2++;
        }
        }
        return count2 + 1;

        }

public static String lengthiestString(String s1) {
        int max = 0;
        String s2 = new String();
        StringTokenizer t = new StringTokenizer(s1, " ");
        while (t.hasMoreTokens()) {
        String s3 = t.nextToken();
        int n = s3.length();
        if (n > max) {
        max = n;
        s2 = s3;
        }
        }
        return s2;
        }


public static String lengthiestString1(String s1) {
        int max = 0;
        String s2 = new String();
        StringTokenizer t = new StringTokenizer(s1, ".");
        while (t.hasMoreTokens()) {
        String s3 = t.nextToken();
        int n = s3.length();
        if (n > max) {
        max = n;
        s2 = s3;
        }
        }
        return s2;
        }



        }




