package jm.plugins.demo.entity;

import jm.dict.plugin.annotation.JDictField;
import jm.dict.plugin.annotation.JIncludeDict;
import jm.dict.plugin.entity.JDictString;

import java.util.Date;
import java.util.List;


@JIncludeDict
public class User implements java.io.Serializable {

    private Integer id;

    private String age;

    private String name;

    @JDictField(type = "sex", remark="这是字典字段，'sex'字典")
    private JDictString sex;

    /**
     * 用户爱好
     */
    private List<UserHobby> hobbys;

    /**
     * 所在公司
     */
    private Company company;

    private String email;
    private String phoneNumber;
    private Date createTime;
    private String[] labels;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JDictString getSex() {
        return sex;
    }

    public void setSex(JDictString sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String[] getLabels() {
        return labels;
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public List<UserHobby> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<UserHobby> hobbys) {
        this.hobbys = hobbys;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}

