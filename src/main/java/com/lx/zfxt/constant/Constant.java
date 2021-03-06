package com.lx.zfxt.constant;

public class Constant {
    public static final String uri = "http://210.45.175.14/default2.aspx";

    public static final String checkCode = "http://210.45.175.14/CheckCode.aspx";
    /**
     * 验证码为空
     */
    public static final String CHECK_NULL_ERROR="验证码不能为空，如看不清请刷新！！";

    /**
     * 验证码不正确
     */
    public static final String CHECK_ERROR="验证码不正确！！";

    /**
     * 密码错误
     */
    public static final String PASSWD_ERROR="密码错误！！";

    /**
     * 字符编码
     */
    public static final String ENCODING="GB2312";

    /**
     * 用户类型
     */
    public static final String RADIO_BUTTON_LIST="学生";


    /**
     * 教务网地址
     */
    public static final String BASE_URL="http://210.45.175.14";

    /**
     * 验证码URL
     */
    public static final String CHECK_IMAGE_URL=BASE_URL+"/CheckCode.aspx";

    /**
     * 登陆URL
     */
    public static final String LOGIN_URL=BASE_URL+"/default2.aspx";

    /**
     * 登陆后主页面URL
     */
    public static final String STUDENT_URL=BASE_URL+"/xs_main.aspx?xh=";

}
