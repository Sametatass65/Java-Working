public class BakiyeIslemleri {
    private double balanas;
    public void addMoney(double acount)
    {
        balanas = getHesaptakiPara() + acount;

    }
    public void withDraw(double acount) throws Exception {
        if (balanas >= acount)
            balanas= getHesaptakiPara() - acount;
        else {
            throw new BalanceInsufficentException("Yetersiz bakiye");
        }
    }

    public double getHesaptakiPara()
    {
        return balanas;
    }
}
