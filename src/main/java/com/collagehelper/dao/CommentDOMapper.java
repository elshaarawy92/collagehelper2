package com.collagehelper.dao;

import com.collagehelper.dataobject.CommentDO;

public interface CommentDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int insert(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int insertSelective(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    CommentDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(CommentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int updateByPrimaryKey(CommentDO record);
}