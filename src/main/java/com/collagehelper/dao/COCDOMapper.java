package com.collagehelper.dao;

import com.collagehelper.dataobject.COCDO;

import java.util.List;

public interface COCDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_on_comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_on_comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int insert(COCDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_on_comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int insertSelective(COCDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_on_comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    COCDO selectByPrimaryKey(Integer id);

    List<COCDO> selectByCommentId(int commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_on_comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(COCDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comment_on_comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    int updateByPrimaryKey(COCDO record);
}