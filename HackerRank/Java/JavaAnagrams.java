import java.util.Scanner;

public class Solution {

  static boolean isAnagram(String a, String b) {
        // Complete the function
         boolean flag;
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();

        char temp1, temp2;
        String result1, result2;
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp1 = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp1;

                }
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    temp2 = arr2[j + 1];
                    arr2[j + 1] = arr2[j];
                    arr2[j] = temp2;

                }
            }
        }
        result1 = String.valueOf(arr1);
        result2 = String.valueOf(arr2);

        if (result1.equals(result2)) {
            flag = true;
        } else {
            flag = false;
        }

        return flag;
       
    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}