package com.wan.pojo;

import java.util.Date;

public class TbSelldetail {
    private Integer id;

    private String sellname;

    private Double sellprice;

    private Integer sellcount;

    private Date selltime;

    private Integer medid;

    private Integer userid;

    public TbSelldetail(Integer id, String sellname, Double sellprice, Integer sellcount, Date selltime, Integer medid, Integer userid) {
        this.id = id;
        this.sellname = sellname;
        this.sellprice = sellprice;
        this.sellcount = sellcount;
        this.selltime = selltime;
        this.medid = medid;
        this.userid = userid;
    }

    public TbSelldetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSellname() {
        return sellname;
    }

    public void setSellname(String sellname) {
        this.sellname = sellname == null ? null : sellname.trim();
    }

    public Double getSellprice() {
        return sellprice;
    }

    public void setSellprice(Double sellprice) {
        this.sellprice = sellprice;
    }

    public Integer getSellcount() {
        return sellcount;
    }

    public void setSellcount(Integer sellcount) {
        this.sellcount = sellcount;
    }

    public Date getSelltime() {
        return selltime;
    }

    public void setSelltime(Date selltime) {
        this.selltime = selltime;
    }

    public Integer getMedid() {
        return medid;
    }

    public void setMedid(Integer medid) {
        this.medid = medid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}