package com.collagehelper.dataobject;

public class ChatDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat.id
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat.customer_phone
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    private String customerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat.seller_phone
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    private String sellerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat.message
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat.time
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column chat.start
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    private String start;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat.id
     *
     * @return the value of chat.id
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat.id
     *
     * @param id the value for chat.id
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat.customer_phone
     *
     * @return the value of chat.customer_phone
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat.customer_phone
     *
     * @param customerPhone the value for chat.customer_phone
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat.seller_phone
     *
     * @return the value of chat.seller_phone
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public String getSellerPhone() {
        return sellerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat.seller_phone
     *
     * @param sellerPhone the value for chat.seller_phone
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat.message
     *
     * @return the value of chat.message
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat.message
     *
     * @param message the value for chat.message
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat.time
     *
     * @return the value of chat.time
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat.time
     *
     * @param time the value for chat.time
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column chat.start
     *
     * @return the value of chat.start
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public String getStart() {
        return start;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column chat.start
     *
     * @param start the value for chat.start
     *
     * @mbg.generated Fri May 03 16:56:19 GMT+08:00 2019
     */
    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }
}