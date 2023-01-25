package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.createUsersTable();

        userService.saveUser("Петр", "Петров", (byte) 68);
        userService.saveUser("Николай", "Максименко", (byte) 56);
        userService.saveUser("Максим", "Елагин", (byte) 74);
        userService.saveUser("Евгений", "Дубовицкий", (byte) 46);

        System.out.println(userService.getAllUsers());
        userService.removeUserById(2);
        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();
        userService.dropUsersTable();

    }
}
