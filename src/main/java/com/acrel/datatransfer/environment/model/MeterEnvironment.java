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
@TableName("t_meter")
public class MeterEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("SwicthId")
    private String swicthid;

    @TableField("MeterId")
    private String meterid;

    @TableField("CollectType")
    private Integer collecttype;

    @TableField("Model")
    private String model;

    @TableField("Type")
    private Integer type;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("UpdateTime")
    private LocalDateTime updatetime;

    @TableField("PT")
    private Double pt;

    @TableField("CT")
    private Double ct;

    @TableField("IsShow")
    private Boolean isshow;

    @TableField("IsDeleted")
    private Boolean isdeleted;

    /**
     * 总表名称
     */
    @TableField("Remark")
    private String remark;

    @TableField("MeterSN")
    private String metersn;

    @TableField("EnterpriseId")
    private String enterpriseid;

    @TableField("MonitorId")
    private String monitorid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSwicthid() {
        return swicthid;
    }

    public void setSwicthid(String swicthid) {
        this.swicthid = swicthid;
    }

    public String getMeterid() {
        return meterid;
    }

    public void setMeterid(String meterid) {
        this.meterid = meterid;
    }

    public Integer getCollecttype() {
        return collecttype;
    }

    public void setCollecttype(Integer collecttype) {
        this.collecttype = collecttype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public Double getPt() {
        return pt;
    }

    public void setPt(Double pt) {
        this.pt = pt;
    }

    public Double getCt() {
        return ct;
    }

    public void setCt(Double ct) {
        this.ct = ct;
    }

    public Boolean getIsshow() {
        return isshow;
    }

    public void setIsshow(Boolean isshow) {
        this.isshow = isshow;
    }

    public Boolean getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMetersn() {
        return metersn;
    }

    public void setMetersn(String metersn) {
        this.metersn = metersn;
    }

    public String getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid;
    }

    @Override
    public String toString() {
        return "MeterEnvironment{" +
        "id=" + id +
        ", swicthid=" + swicthid +
        ", meterid=" + meterid +
        ", collecttype=" + collecttype +
        ", model=" + model +
        ", type=" + type +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", pt=" + pt +
        ", ct=" + ct +
        ", isshow=" + isshow +
        ", isdeleted=" + isdeleted +
        ", remark=" + remark +
        ", metersn=" + metersn +
        ", enterpriseid=" + enterpriseid +
        ", monitorid=" + monitorid +
        "}";
    }
}
