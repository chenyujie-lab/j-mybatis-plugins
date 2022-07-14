package jm.plugins.demo.entity;

import jm.dict.plugin.annotation.JDictField;
import jm.dict.plugin.annotation.JIncludeDict;
import jm.dict.plugin.entity.JDictString;

import java.util.Date;

@JIncludeDict
public class Company {
    /**
     * 公司ID
     */
    private Integer id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司状态
     */
    @JDictField(type = "CompanyState", remark = "公司状态字典")
    private JDictString state;

    /**
     * 公司注册时间
     */
    private Date registrationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public JDictString getState() {
        return state;
    }

    public void setState(JDictString state) {
        this.state = state;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
