package domain;

/**
 * @author asus
 */
public class User {
    private int userId;
    private String userName;
    private String password;

    public int checkThis(String nameIn, String passwordIn) {
        System.out.println(nameIn);
        System.out.println(passwordIn);
        if (this.getUserName().equals(nameIn) && this.getPassword().equals(passwordIn)) {
            //登录成功
            return 1;
        } else {
            //登陆失败
            return 0;
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

