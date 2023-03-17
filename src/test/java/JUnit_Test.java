import  Utulities.DatabaseUtilty;
import org.junit.Assert;
import org.junit.Test;

import static Utulities.DatabaseUtilty.*;

public class JUnit_Test {

    @Test
    public void test01(){
     //Nil Naz ve Ali can isimli ogrencilerin DataBase'de kayitli odlgunu dogrula
        DatabaseUtilty.createConnection();

        String sql="select * from ogrenciler";
        System.out.println("ogrenci isimleri:" +getColumnData(sql,"ogrenci_ismi"));
        Assert.assertTrue("Database de kayit bulunamadi",getColumnData(sql,
                "ogrenci_ismi").contains("Ali Can"));

        //getColumnData(sgl,"ogrenci_ismi") tablodaki ogrenci isimlerini verir.

        DatabaseUtilty.closeConnection();





    }

    @Test
    public void test02(){

        //120 numarali kayit var mi?

        createConnection();
        Assert.assertTrue("database de kayit bulunamadi",
                getColumnData("select * from ogrenciler","okul_no").contains(120));
        closeConnection();


    }
}
