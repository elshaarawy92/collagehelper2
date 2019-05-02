package com.collagehelper.dao;

import com.collagehelper.dataobject.OrderDO;

import java.util.List;

public interface OrderDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    int insert(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    int insertSelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    OrderDO selectByPrimaryKey(Integer id);

    List<OrderDO> selectByCustomerPhone(String customerPhone);

    List<OrderDO> selectBySellerPhone(String sellerPhone);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(OrderDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_info
     *
     * @mbg.generated Thu Apr 25 10:29:11 GMT+08:00 2019
     */
    int updateByPrimaryKey(OrderDO record);
}