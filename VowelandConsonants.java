import java.util.Scanner;

public class VowelandConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Line : ");
        String line = sc.nextLine();
        line = line.toLowerCase();
        int vCount = 0;
        int cCount = 0;
        int sCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'a' ||
                    line.charAt(i) == 'e' ||
                    line.charAt(i) == 'i' ||
                    line.charAt(i) == 'o' ||
                    line.charAt(i) == 'u') {
                vCount++;
            } else if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                cCount++;
            } else {
                sCount++;
            }
        }
        System.out.println("Count Of Vowel Present In line : " + vCount);
        System.out.println("The Count of Consonant In Line : " + cCount);
        System.out.println("The Count of Spaces In Line : " + sCount);
        sc.close();
    }
}
