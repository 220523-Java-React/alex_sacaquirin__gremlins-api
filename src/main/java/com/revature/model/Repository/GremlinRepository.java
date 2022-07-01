package com.revature.model.Repository;

import com.revature.model.Gremlin;
import com.revature.model.util.ConnectionUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GremlinRepository implements DAO<Gremlin> {
    @Override
    public Gremlin create(Gremlin gremlin) {
        String sql = "insert into gremlins(name, age, color, isEvil) values(?,?,?,?)";

        // try with resources to auto close connection
        try(Connection connection = ConnectionUtility.getInstance()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, gremlin.getName());
            statement.setInt(2, gremlin.getAge());
            statement.setString(3, gremlin.getColor());
           statement.setBoolean(4,gremlin.getIsEvil());

            if(statement.executeUpdate() == 1) {
                return gremlin;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Gremlin> getAll() {
        List<Gremlin> gremlins = new ArrayList<>();

        String sql = "select * from gremlins";

        try(Connection connection = ConnectionUtility.getInstance()) {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while(rs.next()) {
                gremlins.add(new Gremlin()
                        .setName(rs.getString("name"))
                        .setColor(rs.getNString("color"))
                        .setAge(rs.getInt("age"))
                        .setEvil(rs.getBoolean("isEvil")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gremlins;
    }

}
