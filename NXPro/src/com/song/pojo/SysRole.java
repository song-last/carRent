package com.song.pojo;

public class SysRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.roleid
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private Integer roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.rolename
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private String rolename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.roledesc
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private String roledesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role.available
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    private Integer available;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.roleid
     *
     * @return the value of sys_role.roleid
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.roleid
     *
     * @param roleid the value for sys_role.roleid
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.rolename
     *
     * @return the value of sys_role.rolename
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.rolename
     *
     * @param rolename the value for sys_role.rolename
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.roledesc
     *
     * @return the value of sys_role.roledesc
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public String getRoledesc() {
        return roledesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.roledesc
     *
     * @param roledesc the value for sys_role.roledesc
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role.available
     *
     * @return the value of sys_role.available
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role.available
     *
     * @param available the value for sys_role.available
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }
}