package com.example.smsproject.utils;

/**
 * 签名类型
 *
 * @author bing_huang
 * @since V1.0 2020/07/09 7:40
 */
public enum SignTypeEnum {
    /**
     * 无需签名
     */
    NORMAL("normal"),
    /**
     * md5
     */
    MD5("md5"),
    /**
     * sha1
     */
    SHA1("sha1");
    private String value;

    SignTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
