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
@TableName("t_meter")
public class MeterZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    /**
     * 网关识别号   (24位MN码的后14位)
     */
    @TableField("SwicthId")
    private String swicthid;

    /**
     * 仪表地址 (若无仪表地址，则默认为1)
     */
    @TableField("MeterId")
    private String meterid;

    /**
     * 监测数据类型   0：用电，1：扬尘，2：VOC
     */
    @TableField("CollectType")
    private Integer collecttype;

    /**
     * 监测点位类型 1企业总表； 4产治污监测点
     */
    @TableField("Type")
    private Integer type;

    /**
     * 创建时间 (数据首次上传时间)
     */
    @TableField("CreateTime")
    private LocalDateTime createtime;

    /**
     * 更新时间(数据更新时间)
     */
    @TableField("UpdateTime")
    private LocalDateTime updatetime;

    /**
     * 电压变比
     */
    @TableField("PT")
    private Double pt;

    /**
     * 电流变比
     */
    @TableField("CT")
    private Double ct;

    /**
     * 删除标志 0：是；1：否
     */
    @TableField("IsDeleted")
    private Boolean isdeleted;

    /**
     * 总表名称
     */
    @TableField("Remark")
    private String remark;

    /**
     * 企业id 关联t_Enterprise中的Id
     */
    @TableField("EnterpriseId")
    private String enterpriseid;

    /**
     * 监测点id 关联t_Monitor中的Id若为企业总表（Type=1）则监测点Id不需填写
     */
    @TableField("MonitorId")
    private String monitorid;

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

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "MeterZhongjianku{" +
        "id=" + id +
        ", swicthid=" + swicthid +
        ", meterid=" + meterid +
        ", collecttype=" + collecttype +
        ", type=" + type +
        ", createtime=" + createtime +
        ", updatetime=" + updatetime +
        ", pt=" + pt +
        ", ct=" + ct +
        ", isdeleted=" + isdeleted +
        ", remark=" + remark +
        ", enterpriseid=" + enterpriseid +
        ", monitorid=" + monitorid +
        ", datastatus=" + datastatus +
        "}";
    }
}
