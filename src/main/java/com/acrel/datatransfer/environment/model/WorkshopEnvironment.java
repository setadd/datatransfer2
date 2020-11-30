package com.acrel.datatransfer.environment.model;

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
public class WorkshopEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("ShopName")
    private String shopname;

    @TableField("Remark")
    private String remark;

    @TableField("EnterpriseId")
    private String enterpriseid;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("IsDeleted")
    private Boolean isdeleted;


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

    @Override
    public String toString() {
        return "WorkshopEnvironment{" +
        "id=" + id +
        ", shopname=" + shopname +
        ", remark=" + remark +
        ", enterpriseid=" + enterpriseid +
        ", createtime=" + createtime +
        ", isdeleted=" + isdeleted +
        "}";
    }
}
