package com.ecommerce;

import java.sql.SQLException;
import java.util.List;

import com.ecommerce.dao.UserDAO;
import com.ecommerce.model.User;

public class test {
    public static void main(String[] args) throws SQLException {
      List<User> users = new UserDAO().getAllUsers();
      for (User user : users) {
          System.out.println("User: " + user.getName() + ", Email: " + user.getEmail()+", Role: " + user.getRole());
      }
    };
}
