package com.menethil.tinymall.db.dao;

import com.menethil.tinymall.db.domain.TinymallProduct;
import com.menethil.tinymall.db.domain.TinymallProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TinymallProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    long countByExample(TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int deleteByExample(TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int insert(TinymallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int insertSelective(TinymallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallProduct selectOneByExample(TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallProduct selectOneByExampleSelective(@Param("example") TinymallProductExample example, @Param("selective") TinymallProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<TinymallProduct> selectByExampleSelective(@Param("example") TinymallProductExample example, @Param("selective") TinymallProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    List<TinymallProduct> selectByExample(TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallProduct selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") TinymallProduct.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    TinymallProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    TinymallProduct selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TinymallProduct record, @Param("example") TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TinymallProduct record, @Param("example") TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TinymallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TinymallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") TinymallProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tinymall_product
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}