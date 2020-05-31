package dao;

import domain.Friend;

import java.util.List;

/**
 * @author asus
 */
public interface FriendDao {
    /**
     * 添加好友
     */
    int addFriend(Friend friend);

    /**
     * 删除好友(待定)
     */
    int deleteFriend(Integer id);

    /**
     * 更新好友
     */
    void updateFriend(Friend friend);

    /**
     * 查询对应用户的好友  select * from user which userId = "xx"
     */
    List<Friend> findAll(Integer userId);


    /**
     * 按姓名模糊查询
     */
    List<Friend> findByName(String friendName);

    ///**
    //    查询总记录条数(待定)
    // */
    //int findTotal();


    ///*
    //    根据条件查询用户
    // */
    //List<User> findByVo(QueryVo vo);

    ///**
    //    根据Id查询用户
    // */
    //User findById(Integer id);
}
