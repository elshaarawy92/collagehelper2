package com.collagehelper.dataobject;

public class OrderDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.customer_phone
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private String customerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.seller_phone
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private String sellerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.order_id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.time
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private String time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.money
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private String money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.goods_id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_info.goods_count
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    private Integer goodsCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.id
     *
     * @return the value of order_info.id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.id
     *
     * @param id the value for order_info.id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.customer_phone
     *
     * @return the value of order_info.customer_phone
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.customer_phone
     *
     * @param customerPhone the value for order_info.customer_phone
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.seller_phone
     *
     * @return the value of order_info.seller_phone
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public String getSellerPhone() {
        return sellerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.seller_phone
     *
     * @param sellerPhone the value for order_info.seller_phone
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setSellerPhone(String sellerPhone) {
        this.sellerPhone = sellerPhone == null ? null : sellerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.order_id
     *
     * @return the value of order_info.order_id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.order_id
     *
     * @param orderId the value for order_info.order_id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.time
     *
     * @return the value of order_info.time
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public String getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.time
     *
     * @param time the value for order_info.time
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.money
     *
     * @return the value of order_info.money
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public String getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.money
     *
     * @param money the value for order_info.money
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.goods_id
     *
     * @return the value of order_info.goods_id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.goods_id
     *
     * @param goodsId the value for order_info.goods_id
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_info.goods_count
     *
     * @return the value of order_info.goods_count
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public Integer getGoodsCount() {
        return goodsCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_info.goods_count
     *
     * @param goodsCount the value for order_info.goods_count
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }
}