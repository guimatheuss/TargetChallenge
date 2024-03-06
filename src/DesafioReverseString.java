import java.util.Scanner;

public class DesafioReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para ser invertida: ");
        String entrada = scanner.nextLine();

        System.out.println("String invertida: " + inverterString(entrada));
    }

    public static String inverterString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}