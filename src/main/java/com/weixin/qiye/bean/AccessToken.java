package com.weixin.qiye.bean;

/**
 * AccessToken����ҵ�ŵ�ȫ��ΨһƱ�ݣ����ýӿ�ʱ��Я��AccessToken
 * Created by sdyang on 2016/5/29.
 */
public class AccessToken extends BaseResult{

    private String access_token;//��ȡ����ƾ֤������Ϊ64��512���ֽ�

    private int expires_in;//ƾ֤����Чʱ�䣨�룩

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }
}
