package domain;

/**
 * @author asus
 */
public class User {
    private String name;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkThis(String nameIn, String passwordIn) {
        System.out.println(nameIn);
        System.out.println(passwordIn);
        if (this.getName().equals(nameIn) && this.getPassword().equals(passwordIn)) {
            return "登录成功";
        } else {
            return "登陆失败";
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

