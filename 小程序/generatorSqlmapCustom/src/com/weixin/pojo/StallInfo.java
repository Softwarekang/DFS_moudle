package com.weixin.pojo;

import java.util.Date;

public class StallInfo {
    private Long uid;

    private String longitude;

    private String latitude;

    private String parkTime;

    private Boolean status;

    private String parkTimes;

    private Date created;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getParkTime() {
        return parkTime;
    }

    public void setParkTime(String parkTime) {
        this.parkTime = parkTime == null ? null : parkTime.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getParkTimes() {
        return parkTimes;
    }

    public void setParkTimes(String parkTimes) {
        this.parkTimes = parkTimes == null ? null : parkTimes.trim();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}