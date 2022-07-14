package jm.plugins.demo.entity;

import jm.dict.plugin.annotation.JDictField;
import jm.dict.plugin.annotation.JIncludeDict;
import jm.dict.plugin.entity.JDictString;

@JIncludeDict
public class UserHobby {
    private Integer userId;

    @JDictField(type = "hobby", remark = "爱好字典")
    private JDictString hobby;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public JDictString getHobby() {
        return hobby;
    }

    public void setHobby(JDictString hobby) {
        this.hobby = hobby;
    }
}
