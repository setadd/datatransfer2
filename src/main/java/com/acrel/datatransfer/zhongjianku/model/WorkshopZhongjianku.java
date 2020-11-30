package com.acrel.datatransfer.zhongjianku.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ffy
 * @since 2020-11-30
 */
@TableName("t_workshop")
public class WorkshopZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * UUID生成
     */
    @TableId("Id")
    private String id;

    /**
     * 车间名称
     */
    @TableField("ShopName")
    private String shopname;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 企业id 关联t_Enterprise中的Id
     */
    @TableField("EnterpriseId")
    private String enterpriseid;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime createtime;

    /**
     * 删除标志
     */
    @TableField("IsDeleted")
    private Boolean isdeleted;

    /**
     * 数据状态 0未转发 1已转发
     */
    @TableField("DataStatus")
    private Boolean datastatus;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "WorkshopZhongjianku{" +
        "id=" + id +
        ", shopname=" + shopname +
        ", remark=" + remark +
        ", enterpriseid=" + enterpriseid +
        ", createtime=" + createtime +
        ", isdeleted=" + isdeleted +
        ", datastatus=" + datastatus +
        "}";
    }
}
