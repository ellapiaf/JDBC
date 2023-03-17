package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query05 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/JDBC",
                "postgres",
                "Kuba1070");

        Statement st = con.createStatement();

        //SORU: Öğrenciler tablosuna yen bir kayıt ekleyin (300, 'Sena Can', 12, 'K')

//        String sql01= "insert into ogrenciler values (304, 'Sena Can', 12, 'K')";
//        int s1 = st.executeUpdate(sql01);
//        System.out.println(s1 + " satir database eklendi");

        //SORU: Öğrenciler tablosuna birden fazla veri ekleyin
        // (400, 'Sena Can', 12, 'K'), (401, 'Sena Can', 12, 'K'), (402, 'Sena Can', 12, 'K')


        //1. YOL
//        String [] veri = {"insert into ogrenciler values (900, 'Sena Can', 12, 'K')",
//                "insert into ogrenciler values (901 'Sena Can', 12, 'K')",
//                "insert into ogrenciler values (902, 'Sena Can', 12, 'K')"};
//
//        int count=0;
//        for(String each:veri){
//            count = count+ st.executeUpdate(each);
//        }
//        System.out.println(count + " satir eklendi");



        //2. YOL
//      String [] veri = {"insert into ogrenciler values (1001, 'Sena Can', 12, 'K')",
//               "insert into ogrenciler values (1002, 'Sena Can', 12, 'K')",
//                "insert into ogrenciler values (1003, 'Sena Can', 12, 'K')"};
//
//      for(String each: veri){
//           st.addBatch(each);          //yukarıdaki dataların hepsini birleştirir
//      }
//      st.executeBatch();              //Dataları tek seferde gönderir.


//        st.close();
//        con.close();









    }

}

