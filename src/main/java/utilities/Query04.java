package utilities;

import java.sql.*;

public class Query04 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/JDBC",
                "postgres",
                "Kuba1070");

        Statement st = con.createStatement();

//        ResultSet rs=st.executeQuery("select* from ogrenciler");
//        ResultSetMetaData rsmd=rs.getMetaData();
//        System.out.println( "Sutun sayisi:"+ rsmd.getColumnCount());
//        System.out.println("1. sutunun ismi :" +rsmd.getColumnName(1));
//        System.out.println("2. sutunun ismi :" +rsmd.getColumnName(2));
//        System.out.println("3. sutunun ismi :" +rsmd.getColumnName(3));
//        System.out.println("4. sutunun ismi :" +rsmd.getColumnName(4));
//
//        System.out.println("Tablo name:"+ rsmd.getTableName(4));
//
//        System.out.println(rsmd.getColumnTypeName(1));
//        System.out.println(rsmd.getColumnTypeName(2));
//
//        System.out.println(rsmd.getSchemaName(1));//SCHEMAmiz olmadigi icin bos bir sey vermez suan

    }
}
