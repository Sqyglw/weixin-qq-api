package com.weixin.qiye.bean;

/**
 * Created by sdyang on 2016/5/29.
 */
public class Tag {

    private String tagname;//��ǩ���ƣ�����Ϊ1~64���ֽڣ���ǩ��������������ǩ������

    private String tagid;//��ǩid�����ͣ�ָ���˲���ʱ�����ı�ǩ�����ɶ�Ӧ�ı�ǩid����ָ��ʱ����Ŀǰ����id������

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getTagid() {
        return tagid;
    }

    public void setTagid(String tagid) {
        this.tagid = tagid;
    }
}
