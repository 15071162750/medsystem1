package com.wan.pojo;

public class TbMedicine {
    private Integer id;

    private String medno;

    private String name;

    private String factoryadd;

    private Double price;

    private Integer medcount;

    private String photopath;

    private Integer categoryid;

    private String description;

    public TbMedicine(Integer id, String medno, String name, String factoryadd, Double price, Integer medcount, String photopath, Integer categoryid, String description) {
        this.id = id;
        this.medno = medno;
        this.name = name;
        this.factoryadd = factoryadd;
        this.price = price;
        this.medcount = medcount;
        this.photopath = photopath;
        this.categoryid = categoryid;
        this.description = description;
    }

    public TbMedicine() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedno() {
        return medno;
    }

    public void setMedno(String medno) {
        this.medno = medno == null ? null : medno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFactoryadd() {
        return factoryadd;
    }

    public void setFactoryadd(String factoryadd) {
        this.factoryadd = factoryadd == null ? null : factoryadd.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getMedcount() {
        return medcount;
    }

    public void setMedcount(Integer medcount) {
        this.medcount = medcount;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}