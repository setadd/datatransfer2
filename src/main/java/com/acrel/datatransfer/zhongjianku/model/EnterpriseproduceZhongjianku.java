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
@TableName("t_enterpriseproduce")
public class EnterpriseproduceZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id主键(UUID生成)
     */
    @TableId("Id")
    private String id;

    /**
     * 企业id(关联t_Enterprise中的Id)
     */
    @TableField("EnterpriseId")
    private String enterpriseid;

    /**
     * 车间id(关联t_WorkShop中的Id)
     */
    @TableField("WorkShopId")
    private String workshopid;

    /**
     * 监测点id(关联t_MonitorId中的Id)
     */
    @TableField("MonitorId")
    private String monitorid;

    /**
     * 限/停产计划id(关联t_ProduceSet中的Id)
     */
    @TableField("ProduceSetId")
    private String producesetid;

    /**
     * 备注
     */
    @TableField("Remark")
    private String remark;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private LocalDateTime createtime;

    /**
     * 删除标志(0：否；1：是)
     */
    @TableField("IsDeleted")
    private Boolean isdeleted;

    /**
     * 备用关系(0：用，1：备)
     */
    @TableField("BackUp")
    private Integer backup;

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

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "EnterpriseproduceZhongjianku{" +
        "id=" + id +
        ", enterpriseid=" + enterpriseid +
        ", workshopid=" + workshopid +
        ", monitorid=" + monitorid +
        ", producesetid=" + producesetid +
        ", remark=" + remark +
        ", createtime=" + createtime +
        ", isdeleted=" + isdeleted +
        ", backup=" + backup +
        ", datastatus=" + datastatus +
        "}";
    }
}
