package com.weixin.qiye.bean;

import java.util.List;

/**
 * ��ԱUser
 * Created by sdyang on 2016/5/29.
 */
public class User {

    private String userid;//��ԱUserID����Ӧ����˵��ʺţ���ҵ�ڱ���Ψһ�������ִ�Сд������Ϊ1~64���ֽ�

    private String name;//��Ա���ơ�����Ϊ1~64���ֽ�

    private int department;//��Ա��������id�б�,������20��

    private String  position;//ְλ��Ϣ������Ϊ0~64���ֽ�

    private String mobile;//�ֻ����롣��ҵ�ڱ���Ψһ��mobile/weixinid/email���߲���ͬʱΪ��

    private int gender;//�Ա�1��ʾ���ԣ�2��ʾŮ��

    private String email;//���䡣����Ϊ0~64���ֽڡ���ҵ�ڱ���Ψһ

    private String weixinid;//΢�źš���ҵ�ڱ���Ψһ����ע�⣺��΢�źţ�����΢�ŵ����֣�

    private String avatar_mediaid;//��Աͷ���mediaid��ͨ����ý��ӿ��ϴ�ͼƬ��õ�mediaid

    private Attrs extattr;//��չ���ԡ���չ������Ҫ��WEB����˴��������Ч���������δ֪���Եĸ�ֵ

    public static class Attrs{
        List<Attr> attrs;

        public List<Attr> getAttrs() {
            return attrs;
        }

        public void setAttrs(List<Attr> attrs) {
            this.attrs = attrs;
        }

        public Attrs(){

        }
        public Attrs(List<Attr> list){
            this.attrs = list;
        }
    }

    public static class Attr{
        private String name;
        private String value;

        public Attr(){

        }

        public Attr(String name,String value){
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeixinid() {
        return weixinid;
    }

    public void setWeixinid(String weixinid) {
        this.weixinid = weixinid;
    }

    public String getAvatar_mediaid() {
        return avatar_mediaid;
    }

    public void setAvatar_mediaid(String avatar_mediaid) {
        this.avatar_mediaid = avatar_mediaid;
    }

    public Attrs getExtattr() {
        return extattr;
    }

    public void setExtattr(Attrs extattr) {
        this.extattr = extattr;
    }
}
