package domain;

public class User {
    private String name;
    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkThis(String nameIn, int passwordIn) {
        if (this.name.equals(nameIn) && this.password == passwordIn) return "登录成功";
        else return "登陆失败";
    }

    //@Override
    //public String toString() {
    //    return "User{" +
    //            "name='" + name;
    //}

    //public void sayHello() {
    //    System.out.println("Hello");
    //}

}
