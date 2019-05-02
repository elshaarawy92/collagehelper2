package com.collagehelper.dao;

import com.collagehelper.dataobject.APDO;

import java.util.List;

public interface APDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assemble_person
     *
     * @mbg.generated Tue Apr 30 15:58:31 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assemble_person
     *
     * @mbg.generated Tue Apr 30 15:58:31 GMT+08:00 2019
     */
    int insert(APDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assemble_person
     *
     * @mbg.generated Tue Apr 30 15:58:31 GMT+08:00 2019
     */
    int insertSelective(APDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assemble_person
     *
     * @mbg.generated Tue Apr 30 15:58:31 GMT+08:00 2019
     */
    APDO selectByPrimaryKey(Integer id);

    List<APDO> selectByAssembleId(String assembleId);

    List<APDO> selectByPhone(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assemble_person
     *
     * @mbg.generated Tue Apr 30 15:58:31 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(APDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table assemble_person
     *
     * @mbg.generated Tue Apr 30 15:58:31 GMT+08:00 2019
     */
    int updateByPrimaryKey(APDO record);

    int updateByPhoneAndAId(String status,String assembleId,String phone);
}