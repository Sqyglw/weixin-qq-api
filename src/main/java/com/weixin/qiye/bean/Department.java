package com.weixin.qiye.bean;

/**
 * Created by sdyang on 2016/5/29.
 */
public class Department {

    private String parentid;//���ײ���id��������idΪ1

    private String name;//�������ơ���������Ϊ1~64���ֽڣ��ַ����ܰ���\:*?"<>��

    private String order;//�ڸ������еĴ���ֵ��orderֵС������ǰ��

    private String id;//����id�����͡�ָ��ʱ�������1����ָ��ʱ���Զ�����

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
