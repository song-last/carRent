package com.song.pojo;

import java.util.Date;

public class SysLogLogin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_login.id
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_login.loginname
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private String loginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_login.loginip
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private String loginip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log_login.logintime
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private Date logintime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_login.id
     *
     * @return the value of sys_log_login.id
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_login.id
     *
     * @param id the value for sys_log_login.id
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_login.loginname
     *
     * @return the value of sys_log_login.loginname
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_login.loginname
     *
     * @param loginname the value for sys_log_login.loginname
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_login.loginip
     *
     * @return the value of sys_log_login.loginip
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public String getLoginip() {
        return loginip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_login.loginip
     *
     * @param loginip the value for sys_log_login.loginip
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log_login.logintime
     *
     * @return the value of sys_log_login.logintime
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log_login.logintime
     *
     * @param logintime the value for sys_log_login.logintime
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }
}