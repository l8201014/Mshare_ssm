package com.zwn.dao;

import com.zwn.model.Fans;

public interface FansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans
     *
     * @mbggenerated
     */
    int insert(Fans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans
     *
     * @mbggenerated
     */
    int insertSelective(Fans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans
     *
     * @mbggenerated
     */
    Fans selectByPrimaryKey(Integer fid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Fans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fans
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Fans record);
}