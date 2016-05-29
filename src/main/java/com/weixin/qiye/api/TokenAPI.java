package com.weixin.qiye.api;

import com.client.LocalHttpClient;
import com.weixin.qiye.bean.AccessToken;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;

/**
 * AccessToken����API
 * Created by sdyang on 2016/5/29.
 */
public class TokenAPI extends BaseAPI{

    /**
     * ��ȡAccessToken
     * AccessToken��Ҫ��CorpID��Secret����ȡ����ͬ��Secret�᷵�ز�ͬ��AccessToken��
     * ���������AccessToken��Ч��Ϊ7200�룬��Ч�����ظ���ȡ������ͬ�����
     * access_token���ٱ���512�ֽڵĴ洢�ռ䡣
     * ����˵��
     * https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=id&corpsecret=secrect
     * Https����ʽ: GET
     * ÿ��secret�����˶�Ӧ�á�ͨѶ¼�Ĳ�ͬȨ�ޣ���ͬ�Ĺ�����ӵ�в�ͬ��secret��
     * @param corpid
     * @param corpsecret
     * @return
     */
    public static AccessToken getToken(String corpid,String corpsecret){
        HttpUriRequest httpUriRequest = RequestBuilder.get()
                .setUri(BASE_URI + "/gettoken")
                .addParameter("corpid", corpid)
                .addParameter("corpsecret", corpsecret)
                .build();
        return LocalHttpClient.executeJsonResult(httpUriRequest, AccessToken.class);
    }
}
