package com.collagehelper.dao;

import com.collagehelper.dataobject.UserDO;

public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sat Apr 20 14:25:17 GMT+08:00 2019
     */
    int deleteByPrimaryKey(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sat Apr 20 14:25:17 GMT+08:00 2019
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sat Apr 20 14:25:17 GMT+08:00 2019
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sat Apr 20 14:25:17 GMT+08:00 2019
     */
    UserDO selectByPrimaryKey(String phone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sat Apr 20 14:25:17 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated Sat Apr 20 14:25:17 GMT+08:00 2019
     */
    int updateByPrimaryKey(UserDO record);
}