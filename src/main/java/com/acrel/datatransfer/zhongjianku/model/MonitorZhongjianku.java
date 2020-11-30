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
@TableName("t_monitor")
public class MonitorZhongjianku implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    /**
     * 监测点名称
     */
    @TableField("MonitorName")
    private String monitorname;

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
     * 删除标志0：是；1：否
     */
    @TableField("IsDeleted")
    private Boolean isdeleted;

    /**
     * 功率启停阀值
     */
    @TableField("PowerLimit")
    private Double powerlimit;

    /**
     * 功率阀值门限时间
     */
    @TableField("PowerTime")
    private Integer powertime;

    /**
     * 电量启停阀值
     */
    @TableField("ElectricLimit")
    private Integer electriclimit;

    /**
     * 超过电量阀值持续时间
     */
    @TableField("ElectricTime")
    private Integer electrictime;

    /**
     * 额定功率
     */
    @TableField("RatedPower")
    private Double ratedpower;

    /**
     * 额定电压
     */
    @TableField("RatedU")
    private Integer ratedu;

    /**
     * 设备类型 t：治污，p：生产
     */
    @TableField("CodeType")
    private String codetype;

    /**
     * 设备类型名称 名称统一填写产污监测点或治污监测点
     */
    @TableField("EquipmentName")
    private String equipmentname;

    /**
     * 车间Id 关联t_Workshop的Id
     */
    @TableField("WorkshopId")
    private String workshopid;

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

    public String getMonitorname() {
        return monitorname;
    }

    public void setMonitorname(String monitorname) {
        this.monitorname = monitorname;
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

    public Double getPowerlimit() {
        return powerlimit;
    }

    public void setPowerlimit(Double powerlimit) {
        this.powerlimit = powerlimit;
    }

    public Integer getPowertime() {
        return powertime;
    }

    public void setPowertime(Integer powertime) {
        this.powertime = powertime;
    }

    public Integer getElectriclimit() {
        return electriclimit;
    }

    public void setElectriclimit(Integer electriclimit) {
        this.electriclimit = electriclimit;
    }

    public Integer getElectrictime() {
        return electrictime;
    }

    public void setElectrictime(Integer electrictime) {
        this.electrictime = electrictime;
    }

    public Double getRatedpower() {
        return ratedpower;
    }

    public void setRatedpower(Double ratedpower) {
        this.ratedpower = ratedpower;
    }

    public Integer getRatedu() {
        return ratedu;
    }

    public void setRatedu(Integer ratedu) {
        this.ratedu = ratedu;
    }

    public String getCodetype() {
        return codetype;
    }

    public void setCodetype(String codetype) {
        this.codetype = codetype;
    }

    public String getEquipmentname() {
        return equipmentname;
    }

    public void setEquipmentname(String equipmentname) {
        this.equipmentname = equipmentname;
    }

    public String getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(String workshopid) {
        this.workshopid = workshopid;
    }

    public Boolean getDatastatus() {
        return datastatus;
    }

    public void setDatastatus(Boolean datastatus) {
        this.datastatus = datastatus;
    }

    @Override
    public String toString() {
        return "MonitorZhongjianku{" +
        "id=" + id +
        ", monitorname=" + monitorname +
        ", remark=" + remark +
        ", createtime=" + createtime +
        ", isdeleted=" + isdeleted +
        ", powerlimit=" + powerlimit +
        ", powertime=" + powertime +
        ", electriclimit=" + electriclimit +
        ", electrictime=" + electrictime +
        ", ratedpower=" + ratedpower +
        ", ratedu=" + ratedu +
        ", codetype=" + codetype +
        ", equipmentname=" + equipmentname +
        ", workshopid=" + workshopid +
        ", datastatus=" + datastatus +
        "}";
    }
}
