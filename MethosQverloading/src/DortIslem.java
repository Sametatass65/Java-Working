public class DortIslem {
    public int topla (int... numbs)
    {
        int total = 0;
        for (int i = 0; i < numbs.length; i++)
        {
            total += numbs[i];
        }
        return total;
    }
}
