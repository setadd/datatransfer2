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
@TableName("t_enterpriseproduce")
public class EnterpriseproduceEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("EnterpriseId")
    private String enterpriseid;

    @TableField("WorkShopId")
    private String workshopid;

    @TableField("MonitorId")
    private String monitorid;

    @TableField("ProduceSetId")
    private String producesetid;

    @TableField("Remark")
    private String remark;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("IsDeleted")
    private Boolean isdeleted;

    @TableField("BackUp")
    private Integer backup;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(String workshopid) {
        this.workshopid = workshopid;
    }

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid;
    }

    public String getProducesetid() {
        return producesetid;
    }

    public void setProducesetid(String producesetid) {
        this.producesetid = producesetid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getBackup() {
        return backup;
    }

    public void setBackup(Integer backup) {
        this.backup = backup;
    }

    @Override
    public String toString() {
        return "EnterpriseproduceEnvironment{" +
        "id=" + id +
        ", enterpriseid=" + enterpriseid +
        ", workshopid=" + workshopid +
        ", monitorid=" + monitorid +
        ", producesetid=" + producesetid +
        ", remark=" + remark +
        ", createtime=" + createtime +
        ", isdeleted=" + isdeleted +
        ", backup=" + backup +
        "}";
    }
}
