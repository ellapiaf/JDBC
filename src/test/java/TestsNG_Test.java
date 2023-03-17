import Utulities.DatabaseUtilty;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsNG_Test {

@Test
    public void test01(){

    //Derya Soylu database kayitli mi ?
    DatabaseUtilty.createConnection();
    String sgl="select * from ogrenciler";
    Assert.assertTrue(DatabaseUtilty.getColumnData(sgl,"ogrenci_ismi").contains("Derya Soylu"),
            "DATABASE DE KAYIT BULUNAMADI");

    DatabaseUtilty.closeConnection();
}

@Test
    public void test02(){
   //111 numarali kayit varmi

   DatabaseUtilty.createConnection();
   Assert.assertTrue(DatabaseUtilty.getColumnData("select* from ogrenciler",
           "okul_no").contains(111),"DATABASE'DE KAYIT BULUNAMADI");

   DatabaseUtilty.closeConnection();

}
}
