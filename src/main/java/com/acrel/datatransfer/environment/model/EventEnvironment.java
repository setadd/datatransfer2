package com.acrel.datatransfer.environment.model;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
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
@TableName("t_event")
public class EventEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Id")
    private String id;

    @TableId("CreateTime")
    private LocalDateTime createtime;

    @TableField("SwicthId")
    private String swicthid;

    @TableField("MeterId")
    private String meterid;

    @TableField("EventType")
    private Long eventtype;

    @TableField("EventTypeName")
    private String eventtypename;

    @TableField("EventLevel")
    private Integer eventlevel;

    @TableField("UnusualType")
    private Integer unusualtype;

    @TableField("IsSubmit")
    private Integer issubmit;

    @TableField("Remark")
    private String remark;

    @TableField("Description")
    private String description;

    @TableField("EnterpriseId")
    private String enterpriseid;

    @TableField("EnterpriseName")
    private String enterprisename;

    @TableField("TradeId")
    private String tradeid;

    @TableField("TradeName")
    private String tradename;

    @TableField("OrganizeId")
    private String organizeid;

    @TableField("OrganizeName")
    private String organizename;

    @TableField("WorkshopId")
    private String workshopid;

    @TableField("WorkshopName")
    private String workshopname;

    @TableField("MonitorId")
    private String monitorid;

    @TableField("MonitorName")
    private String monitorname;

    @TableField("CodeType")
    private String codetype;

    @TableField("EquipmentName")
    private String equipmentname;

    /**
     * 摄像头
     */
    @TableField("CameraIndexCode")
    private String cameraindexcode;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
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

    public Long getEventtype() {
        return eventtype;
    }

    public void setEventtype(Long eventtype) {
        this.eventtype = eventtype;
    }

    public String getEventtypename() {
        return eventtypename;
    }

    public void setEventtypename(String eventtypename) {
        this.eventtypename = eventtypename;
    }

    public Integer getEventlevel() {
        return eventlevel;
    }

    public void setEventlevel(Integer eventlevel) {
        this.eventlevel = eventlevel;
    }

    public Integer getUnusualtype() {
        return unusualtype;
    }

    public void setUnusualtype(Integer unusualtype) {
        this.unusualtype = unusualtype;
    }

    public Integer getIssubmit() {
        return issubmit;
    }

    public void setIssubmit(Integer issubmit) {
        this.issubmit = issubmit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(String enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getTradeid() {
        return tradeid;
    }

    public void setTradeid(String tradeid) {
        this.tradeid = tradeid;
    }

    public String getTradename() {
        return tradename;
    }

    public void setTradename(String tradename) {
        this.tradename = tradename;
    }

    public String getOrganizeid() {
        return organizeid;
    }

    public void setOrganizeid(String organizeid) {
        this.organizeid = organizeid;
    }

    public String getOrganizename() {
        return organizename;
    }

    public void setOrganizename(String organizename) {
        this.organizename = organizename;
    }

    public String getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(String workshopid) {
        this.workshopid = workshopid;
    }

    public String getWorkshopname() {
        return workshopname;
    }

    public void setWorkshopname(String workshopname) {
        this.workshopname = workshopname;
    }

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid;
    }

    public String getMonitorname() {
        return monitorname;
    }

    public void setMonitorname(String monitorname) {
        this.monitorname = monitorname;
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

    public String getCameraindexcode() {
        return cameraindexcode;
    }

    public void setCameraindexcode(String cameraindexcode) {
        this.cameraindexcode = cameraindexcode;
    }

    @Override
    public String toString() {
        return "EventEnvironment{" +
        "id=" + id +
        ", createtime=" + createtime +
        ", swicthid=" + swicthid +
        ", meterid=" + meterid +
        ", eventtype=" + eventtype +
        ", eventtypename=" + eventtypename +
        ", eventlevel=" + eventlevel +
        ", unusualtype=" + unusualtype +
        ", issubmit=" + issubmit +
        ", remark=" + remark +
        ", description=" + description +
        ", enterpriseid=" + enterpriseid +
        ", enterprisename=" + enterprisename +
        ", tradeid=" + tradeid +
        ", tradename=" + tradename +
        ", organizeid=" + organizeid +
        ", organizename=" + organizename +
        ", workshopid=" + workshopid +
        ", workshopname=" + workshopname +
        ", monitorid=" + monitorid +
        ", monitorname=" + monitorname +
        ", codetype=" + codetype +
        ", equipmentname=" + equipmentname +
        ", cameraindexcode=" + cameraindexcode +
        "}";
    }
}
