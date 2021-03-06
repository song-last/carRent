package com.song.mapper;

import com.song.pojo.BusCheck;
import com.song.pojo.BusCheckExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int countByExample(BusCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int deleteByExample(BusCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int deleteByPrimaryKey(String checkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int insert(BusCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int insertSelective(BusCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    List<BusCheck> selectByExample(BusCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    BusCheck selectByPrimaryKey(String checkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int updateByExampleSelective(@Param("record") BusCheck record, @Param("example") BusCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int updateByExample(@Param("record") BusCheck record, @Param("example") BusCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int updateByPrimaryKeySelective(BusCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_check
     *
     * @mbggenerated Sun Dec 01 17:35:42 CST 2019
     */
    int updateByPrimaryKey(BusCheck record);
}