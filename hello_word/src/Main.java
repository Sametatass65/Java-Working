public class Main {
    public static boolean ft_number_is_prime(int nb)
    {
        int i;
        i = 2;
        if (nb < 2)
            return (false);
        while (i < nb)
        {
            if((nb % i) == 0)
                return (false);
            i++;
        }
        return (true);
    }
    public static void main(String[] args) {
        int sayi;
        sayi =0 ;
        if(!(ft_number_is_prime(sayi)))
        {
            System.out.println(sayi + " değeri bir asal sayi değildir!!");
        }else
            System.out.println(sayi + " değeri bir asal sayidir!!");
    }
}