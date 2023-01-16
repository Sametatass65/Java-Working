public class Main {
    public static void main(String[] args) {

      KrediUI krediUI = new KrediUI(new TarimKrediManagers());// polymorphism
        krediUI.Hesapla();
    }
}