package com.weixin.qiye.bean;

import java.util.List;

/**
 * Created by sdyang on 2016/5/29.
 */
public class UserList extends BaseResult{

    private List<User> userlist;//��Ա�б�

    private String[] partylist;//��Ա��������

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public String[] getPartylist() {
        return partylist;
    }

    public void setPartylist(String[] partylist) {
        this.partylist = partylist;
    }
}
