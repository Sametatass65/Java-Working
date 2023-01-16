public class Main {
    public static boolean ft_number_is_perfectnumbers(int num)
    {

        int i;
        i = 1;
        int total = 0;

        if(num < 1)
            return (false);
        while (i < num)
        {
            if(num % i == 0)
                total += i;
            i++;
        }
        if (total == num)
            return (true);
        else
            return (false);
    }
    public static void main(String[] args) {
        int nb = 496;

        if(ft_number_is_perfectnumbers(nb))
            System.out.println(nb + " is a perfect number.");
        else
            System.out.println(nb +" is not a perfect number.");
    }
}