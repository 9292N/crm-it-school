package kg.itschool.crm.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface CrudDao<Model> {
    Model save(Model model);
    Model findById(Long id);

    default Connection getConnection() throws SQLException {
        final String URL = "jdbc:postgresql://localhost:5432/crm";
        final String USERNAME = "postgres";
        final String PASSWORD = "'";

        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
