package cn.sm1235.user.pojo;
//用户实体

import java.io.Serializable;

//@Entity
//@Table(name = "tb_user")
public class User implements Serializable {


//    @GeneratedValue(strategy = GenerationType.IDENTITY) //表示自增长
//    @Id
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private Double money;

    public User() {
    }

    public User(Integer id, String username, String password, String sex, Double money) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}