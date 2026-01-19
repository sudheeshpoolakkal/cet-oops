import java.util.Scanner;

class Exp33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int vowels = 0, consonants = 0, digits = 0, special = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                special++;
            }
        }
        
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants + ", Digits: " + digits + ", Special Characters: " + special);
        scanner.close();
    }
}

