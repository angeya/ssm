package pojo;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    private Integer deptid;
    private Date birthday;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public Date getDate() {
        return birthday;
    }

    public void setDate(Date date) {
        this.birthday = date;
    }
}
