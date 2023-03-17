package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Query03 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/JDBC",
                "postgres",
                "Kuba1070");

        Statement st = con.createStatement();

        //Soru: "workers" adında bir table oluşturup "worker_id, worker_name, worker_salary" sütunlarını ekleyin.

//        String sql01 = "Create Table workers (worker_id Varchar(10), worker_name varchar (20), worker_salary int)";
//        st.execute(sql01);

        //Soru: Tabloya worker_address sutunu ekleyelim

//        String sql02 = "Alter Table workers add worker_address varchar (50)";
//        st.execute(sql02);

        //Soru: Workers tablosunu silelim
//       String sql03 = "Drop Table workers";
//       st.execute(sql03);

        //Note :execute() -> create, drop, alter table (DDL) icin kullanılır.

//      con.close();
//      st.close();


    }
}