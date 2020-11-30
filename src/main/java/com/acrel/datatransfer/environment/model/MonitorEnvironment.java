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
@TableName("t_monitor")
public class MonitorEnvironment implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("Id")
    private String id;

    @TableField("CodeId")
    private String codeid;

    @TableField("MonitorCode")
    private String monitorcode;

    @TableField("MonitorName")
    private String monitorname;

    @TableField("Location")
    private String location;

    @TableField("Remark")
    private String remark;

    @TableField("CreateTime")
    private LocalDateTime createtime;

    @TableField("IsDeleted")
    private Boolean isdeleted;

    @TableField("PowerLimit")
    private Double powerlimit;

    @TableField("PowerTime")
    private Integer powertime;

    @TableField("ElectricLimit")
    private Integer electriclimit;

    @TableField("ElectricTime")
    private Integer electrictime;

    @TableField("RatedPower")
    private Double ratedpower;

    @TableField("RatedU")
    private Integer ratedu;

    @TableField("CameraIndexCode")
    private String cameraindexcode;

    @TableField("EquipmentUse")
    private String equipmentuse;

    @TableField("VideoBackrec")
    private String videobackrec;

    @TableField("CodeType")
    private String codetype;

    @TableField("EquipmentName")
    private String equipmentname;

    @TableField("PolluteType")
    private Integer pollutetype;

    @TableField("WorkshopId")
    private String workshopid;

    @TableField("NFCCardId")
    private String nfccardid;

    @TableField("NFCAddress")
    private String nfcaddress;

    @TableField("APPKey")
    private String appkey;

    @TableField("Secret")
    private String secret;

    @TableField("ExpireTime")
    private LocalDateTime expiretime;

    @TableField("VideoToken")
    private String videotoken;

    @TableField("DeviceSerial")
    private String deviceserial;

    @TableField("ChannelNo")
    private Integer channelno;

    @TableField("OutFallId")
    private String outfallid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeid() {
        return codeid;
    }

    public void setCodeid(String codeid) {
        this.codeid = codeid;
    }

    public String getMonitorcode() {
        return monitorcode;
    }

    public void setMonitorcode(String monitorcode) {
        this.monitorcode = monitorcode;
    }

    public String getMonitorname() {
        return monitorname;
    }

    public void setMonitorname(String monitorname) {
        this.monitorname = monitorname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getCameraindexcode() {
        return cameraindexcode;
    }

    public void setCameraindexcode(String cameraindexcode) {
        this.cameraindexcode = cameraindexcode;
    }

    public String getEquipmentuse() {
        return equipmentuse;
    }

    public void setEquipmentuse(String equipmentuse) {
        this.equipmentuse = equipmentuse;
    }

    public String getVideobackrec() {
        return videobackrec;
    }

    public void setVideobackrec(String videobackrec) {
        this.videobackrec = videobackrec;
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

    public Integer getPollutetype() {
        return pollutetype;
    }

    public void setPollutetype(Integer pollutetype) {
        this.pollutetype = pollutetype;
    }

    public String getWorkshopid() {
        return workshopid;
    }

    public void setWorkshopid(String workshopid) {
        this.workshopid = workshopid;
    }

    public String getNfccardid() {
        return nfccardid;
    }

    public void setNfccardid(String nfccardid) {
        this.nfccardid = nfccardid;
    }

    public String getNfcaddress() {
        return nfcaddress;
    }

    public void setNfcaddress(String nfcaddress) {
        this.nfcaddress = nfcaddress;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public LocalDateTime getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(LocalDateTime expiretime) {
        this.expiretime = expiretime;
    }

    public String getVideotoken() {
        return videotoken;
    }

    public void setVideotoken(String videotoken) {
        this.videotoken = videotoken;
    }

    public String getDeviceserial() {
        return deviceserial;
    }

    public void setDeviceserial(String deviceserial) {
        this.deviceserial = deviceserial;
    }

    public Integer getChannelno() {
        return channelno;
    }

    public void setChannelno(Integer channelno) {
        this.channelno = channelno;
    }

    public String getOutfallid() {
        return outfallid;
    }

    public void setOutfallid(String outfallid) {
        this.outfallid = outfallid;
    }

    @Override
    public String toString() {
        return "MonitorEnvironment{" +
        "id=" + id +
        ", codeid=" + codeid +
        ", monitorcode=" + monitorcode +
        ", monitorname=" + monitorname +
        ", location=" + location +
        ", remark=" + remark +
        ", createtime=" + createtime +
        ", isdeleted=" + isdeleted +
        ", powerlimit=" + powerlimit +
        ", powertime=" + powertime +
        ", electriclimit=" + electriclimit +
        ", electrictime=" + electrictime +
        ", ratedpower=" + ratedpower +
        ", ratedu=" + ratedu +
        ", cameraindexcode=" + cameraindexcode +
        ", equipmentuse=" + equipmentuse +
        ", videobackrec=" + videobackrec +
        ", codetype=" + codetype +
        ", equipmentname=" + equipmentname +
        ", pollutetype=" + pollutetype +
        ", workshopid=" + workshopid +
        ", nfccardid=" + nfccardid +
        ", nfcaddress=" + nfcaddress +
        ", appkey=" + appkey +
        ", secret=" + secret +
        ", expiretime=" + expiretime +
        ", videotoken=" + videotoken +
        ", deviceserial=" + deviceserial +
        ", channelno=" + channelno +
        ", outfallid=" + outfallid +
        "}";
    }
}
