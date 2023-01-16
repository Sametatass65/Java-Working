public class KrediUI{
    BaseKrediManagers _baseKrediManagers; //base classın örneğini oluşturuyorsun
    public KrediUI(BaseKrediManagers baseKrediManagers){// constructer
        this._baseKrediManagers = baseKrediManagers; // örenğini oluşturduğun basein bir basekredimanager olduğunu söylüyorsun
    }
    public void Hesapla()
    {
        _baseKrediManagers.Hesapla(" işlem tamamlanmıştır.");
    }
}
