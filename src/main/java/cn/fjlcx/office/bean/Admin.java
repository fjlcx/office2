package cn.fjlcx.office.bean;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable{
    private int ad_id;
    private String ad_loginname;
    private String ad_name;
    private int ad_type;
    private int ad_state;
    private Date ad_lastlogindate;
    private String ad_lastloginip;
    private Date ad_adddate;

    public int getAd_id() {
        return ad_id;
    }

    public void setAd_id(int ad_id) {
        this.ad_id = ad_id;
    }

    public String getAd_loginname() {
        return ad_loginname;
    }

    public void setAd_loginname(String ad_loginname) {
        this.ad_loginname = ad_loginname;
    }

    public String getAd_name() {
        return ad_name;
    }

    public void setAd_name(String ad_name) {
        this.ad_name = ad_name;
    }

    public int getAd_type() {
        return ad_type;
    }

    public void setAd_type(int ad_type) {
        this.ad_type = ad_type;
    }

    public int getAd_state() {
        return ad_state;
    }

    public void setAd_state(int ad_state) {
        this.ad_state = ad_state;
    }

    public Date getAd_lastlogindate() {
        return ad_lastlogindate;
    }

    public void setAd_lastlogindate(Date ad_lastlogindate) {
        this.ad_lastlogindate = ad_lastlogindate;
    }

    public String getAd_lastloginip() {
        return ad_lastloginip;
    }

    public void setAd_lastloginip(String ad_lastloginip) {
        this.ad_lastloginip = ad_lastloginip;
    }

    public Date getAd_adddate() {
        return ad_adddate;
    }

    public void setAd_adddate(Date ad_adddate) {
        this.ad_adddate = ad_adddate;
    }

    public Admin() {
    }

    public Admin(String ad_loginname, String ad_name, int ad_type, int ad_state, Date ad_lastlogindate, String ad_lastloginip, Date ad_adddate) {
        this.ad_loginname = ad_loginname;
        this.ad_name = ad_name;
        this.ad_type = ad_type;
        this.ad_state = ad_state;
        this.ad_lastlogindate = ad_lastlogindate;
        this.ad_lastloginip = ad_lastloginip;
        this.ad_adddate = ad_adddate;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "ad_id=" + ad_id +
                ", ad_loginname='" + ad_loginname + '\'' +
                ", ad_name='" + ad_name + '\'' +
                ", ad_type=" + ad_type +
                ", ad_state=" + ad_state +
                ", ad_lastlogindate=" + ad_lastlogindate +
                ", ad_lastloginip='" + ad_lastloginip + '\'' +
                ", ad_adddate=" + ad_adddate +
                '}';
    }
}
