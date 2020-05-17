package Utility;

import java.io.IOException;
import java.sql.*;

public class DBConnection {

    final static String JDBCDriver = "com.mysql.cj.jdbc.Driver";
    final static String USERNAME = "root";
    final static String PASSWORD = "qwertyuiop1.";
    final static String URL = "jdbc:mysql://localhost:3306/school";
    Connection conn;
    Statement stmt;
    PreparedStatement prestat;
    ResultSet rs;

    public DBConnection() throws IOException, SQLException, ClassNotFoundException {
        this.open();
    }

    private boolean open() throws IOException, ClassNotFoundException, SQLException {
        Class.forName(JDBCDriver);
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        return true;
    }

    private void close() throws SQLException {
        if (conn != null){
            conn.close();
        }
        if (stmt != null){
            stmt.close();
        }
        if (prestat != null){
            prestat.close();
        }
        if (rs != null){
            rs.close();
        }
    }

    public ResultSet read(String sql) throws SQLException {
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        return rs;
    }

    public ResultSet read(PreparedStatement sql) throws SQLException{
        prestat = conn.prepareStatement(String.valueOf(sql));
        rs = prestat.executeQuery();
        return rs;
    }

    public boolean write(String sql) throws SQLException{
        stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        return true;
    }

    public boolean write(PreparedStatement sql) throws SQLException{
        prestat = conn.prepareStatement(String.valueOf(sql));
        rs = prestat.executeQuery();
        return true;
        
    }

//    @Override
//    protected void finalize() throws Throwable{}
}
