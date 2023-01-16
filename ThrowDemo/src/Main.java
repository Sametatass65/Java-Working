public class Main {
    public static void main(String[] args) throws Exception {
        BakiyeIslemleri bakiyeIslemleri = new BakiyeIslemleri();
        System.out.println(bakiyeIslemleri.getHesaptakiPara());
        bakiyeIslemleri.addMoney(25);

        System.out.println(bakiyeIslemleri.getHesaptakiPara());
        bakiyeIslemleri.withDraw(5);
        System.out.println(bakiyeIslemleri.getHesaptakiPara());

        bakiyeIslemleri.withDraw(40);
        System.out.println(bakiyeIslemleri.getHesaptakiPara());

    }
}