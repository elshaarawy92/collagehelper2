package com.collagehelper.dataobject;

public class CommentDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.id
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    private String comment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.phone
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.goods_id
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comment.time
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    private String time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.id
     *
     * @return the value of comment.id
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.id
     *
     * @param id the value for comment.id
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.comment
     *
     * @return the value of comment.comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.comment
     *
     * @param comment the value for comment.comment
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.phone
     *
     * @return the value of comment.phone
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.phone
     *
     * @param phone the value for comment.phone
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.goods_id
     *
     * @return the value of comment.goods_id
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.goods_id
     *
     * @param goodsId the value for comment.goods_id
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comment.time
     *
     * @return the value of comment.time
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comment.time
     *
     * @param time the value for comment.time
     *
     * @mbg.generated Thu May 02 20:20:11 GMT+08:00 2019
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}