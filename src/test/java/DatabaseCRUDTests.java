import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.example.utils.DatabaseUtils.executeQuery;
import static org.example.utils.DatabaseUtils.executeUpdate;

public class DatabaseCRUDTests {
    @Test
    void create() throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO users (email, name, password) VALUES ('test1@gmail.com','test user','password')";

        Assert.assertEquals(executeUpdate(query),1);
    }

    @Test
    void read() throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM users limit 3;";

        ResultSet resultSet = executeQuery(query);
        while (resultSet.next()){
            System.out.println(resultSet.getString("email"));
        }
    }

    @Test
    void update() throws SQLException, ClassNotFoundException {
        String query = "UPDATE users SET name='test' WHERE id = 2;";

        Assert.assertEquals(executeUpdate(query),1);
    }

    @Test
    void delete() throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM users WHERE id = 2;";

        Assert.assertEquals(executeUpdate(query),1);
    }
}
