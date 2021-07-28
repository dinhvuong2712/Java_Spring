package Demo.DataAccess;

import java.sql.*;
import java.util.List;

public class SqlDataAccess {
    private final String url;
    private final String user;
    private final String password;
    private final String serverName;
    private final String databaseName;

    private Connection connect;
    private PreparedStatement prepared;

    public SqlDataAccess(){
        serverName = "DESKTOP-O0C1GDJ";
        databaseName = "ManagerGoods";

        url = "jdbc:sqlserver://" + serverName + ";databaseName=" + databaseName;
        user = "sa";
        password = "866162648";
    }

    public Connection getConnect() {
        if (connect != null){
            return connect;
        }

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

            connect = DriverManager.getConnection(url,user,password);

            System.out.println("Sql server connected (^ v ^)");
        }catch (Exception ex){
            System.out.println("Sql error message:");
            ex.printStackTrace();
            System.out.println("Sql connect failed");
        }

        return connect;
    }

    public void closeConnection(){
        if (connect != null){
            try{
                connect.close();
                prepared.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
            }
            connect = null;
            prepared = null;
        }
    }

    public ResultSet getTable(String query, List<String> parameters){
        ResultSet resultSet = null;

        try {
            prepared = getConnect().prepareStatement(query);

            for (int i = 0; i < parameters.size(); i++) {
                prepared.setString(i + 1, parameters.get(i));
            }

            resultSet = prepared.executeQuery();

        }catch (Exception ex){
            System.out.println("Get table error:");

            ex.printStackTrace();
        }

        parameters.clear();

        return resultSet;
    }

    public boolean executeNoneQuery (String query, List<String> parameters){
        boolean result = false;

        try {
            prepared = getConnect().prepareStatement(query);

            for (int i = 0; i < parameters.size(); i++) {
                prepared.setString(i + 1, parameters.get(i));
            }

            result = ((prepared.executeUpdate() == 0) ? false : true);
        }catch (Exception ex){
            System.out.println("Get table error:");

            ex.printStackTrace();
        }

        parameters.clear();

        return result;
    }
}
