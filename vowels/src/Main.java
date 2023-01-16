public class Main {
    public static boolean is_vowels(char letter) {
        char lowerCase[] = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        char upperCase[] = {'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü'};
        int i;
        i = 0;
        while (i < lowerCase.length) {
            if (letter == lowerCase[i] && letter == upperCase[i])
                return (true);
            i++;
        }
        return (false);
    }

    public static void main(String[] args) {
        char let = 'A';
        if(is_vowels(let)) // her türlü true ise anlamını veriyor
            System.out.println(let + " is vowels");
        else
            System.out.println(let + " is not vowels");
    }
}