package com.sanmianti.output.dao;

import com.sanmianti.output.pojo.Product;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated 2020-07-12 00:13:46
     */
    int deleteByPrimaryKey(String productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated 2020-07-12 00:13:46
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated 2020-07-12 00:13:46
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated 2020-07-12 00:13:46
     */
    Product selectByPrimaryKey(String productId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated 2020-07-12 00:13:46
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product
     *
     * @mbg.generated 2020-07-12 00:13:46
     */
    int updateByPrimaryKey(Product record);
}