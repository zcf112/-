package dao;

import domain.User;

public interface UserDao {
    /*
        根据user查询password(登陆用)
     */
    String findByUserName(String userName);

    /*
        注册（保存）用户
     */
    void saveUser(User user);
}

