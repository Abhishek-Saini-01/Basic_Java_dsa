import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static boolean palindromeString(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                //not a palindrome string
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path){
        int x=0,y=0;
        for(int i=0; i<path.length();i++) {
            char dir = path.charAt(i);
            //South
            if(dir == 'S'){
                y--;
            } else if(dir == 'N'){ //North  
                y++;
            }else if(dir == 'W'){//West
                x--;
            } else {//East
                x++;
            }
        }

        int x2 = x*x;
        int y2 = y*y;

        return  (float)Math.sqrt(x2 + y2); 
    }

    public static String subString(String str, int si, int ei){
        String substr = "";
        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }

    public static String getLargestFruitString(String fruits[]){
        String largest = fruits[0];
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }

    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' &&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
                Integer count = 1;
                while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                    count++;
                    i++;
                }
                sb.append(str.charAt(i));
                if(count>1){
                    sb.append(count.toString());
                }
        }
        return sb.toString();
    }

    public static int lowercaseCaseVovels(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }

    public static boolean anagrams(String str1, String str2){
        char[] strArray = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();

        Arrays.sort(strArray);
        Arrays.sort(strArray2);

        return Arrays.equals(strArray, strArray2);
    }
    public static void main(String[] args) {
        // char str[] = {'a','b','c','d'};
        // String str1 = "abcd";
        // String str2 = new String("abcdef");
        
        Scanner sc = new Scanner(System.in);
        // String name = sc.next(); // takes only single word
        // String name1 = sc.nextLine(); // takes a line

        // System.out.println("Name: " + name);
        // System.out.println("Name: " + name1);
        // System.out.println(name1.length());

        //concatenation
        // String newName = name1 + " " + str1;
        // System.out.println(newName);
        // for (int i = 0; i <newName.length(); i++) {
        //     System.out.print(newName.charAt(i)+" ");
        // }

        // String str = "noon";
        // System.out.println(palindromeString(str));

        // String path = "WNEENESENNN";
        // System.out.println(getShortestPath(path));

        // String str = "helloworld";
        // System.out.println(subString(str, 0, 5));

        // String fruits[] = {"apple", "orange", "banana"};
        // System.out.println(getLargestFruitString(fruits));

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a';ch<='z';ch++){
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        // String str = "hello, i am abhishek";
        // System.out.println(toUpperCase(str));

        // String str = "aaabbccdd";
        // System.out.println(stringCompression(str));


        // Question1:Count how many times lowercase vowels occurred in a String entered by the user
            // String str = sc.next();
            // System.out.println(lowercaseCaseVovels(str));

        // Question 2 :What will be the output of the followingcode?
        // String str = "ShradhaDidi"; 
        // String str1 = "ApnaCollege"; 
        // String str2 = "ShradhaDidi"; 
        // System.out.println(str.equals(str1) +" "+str.equals(str2)); // fasle true

        // Question 3 :What will be the output of the followingcode?
        // String str="ApnaCollege".replace("l","");
        // System.out.println(str);

        // Question 4 :Determine if 2 Strings are anagrams of each other.
        String str1="race";
        String str2="care";
        System.out.println(anagrams(str1, str2));

    }
}
