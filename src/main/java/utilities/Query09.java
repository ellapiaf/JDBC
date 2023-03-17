package utilities;

import Utulities.DatabaseUtilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Utulities.DatabaseUtilty.getColumnData;
import static Utulities.DatabaseUtilty.getColumnNames;

public abstract class Query09 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {



        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/JDBC",
                "postgres",
                "Kuba1070");


   DatabaseUtilty.createConnection();

    String sql01="select * from ogrenciler";
        System.out.println("Sütun isimleri: " + getColumnNames(sql01));

        System.out.println("Okul No: " + getColumnData(sql01, "okul_no"));
        System.out.println("ogrenci_ismi: " + getColumnData(sql01, "ogrenci_ismi"));
        System.out.println("sinif: "+ getColumnData(sql01, "sinif"));
        System.out.println("cinsiyet: " + getColumnData(sql01, "cinsiyet"));


    DatabaseUtilty.closeConnection();

}}


