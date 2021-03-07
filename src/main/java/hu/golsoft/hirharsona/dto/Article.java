package hu.golsoft.hirharsona.dto;

public class Article {

    private int id;
    private int authId;
    private String authName;
    private String subj;
    private String descr;
    private String artic;
    private String last;
    private int del;
    private float star;

    public float getStar() {
        return star;
    }

    public void setStar(float star) {
        this.star = star;
    }

    public Article(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAuthId() {
        return authId;
    }

    public void setAuthId(int authId) {
        this.authId = authId;
    }

    public String getSubj() {
        return subj;
    }

    public void setSubj(String subj) {
        this.subj = subj;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getArtic() {
        return artic;
    }

    public void setArtic(String artic) {
        this.artic = artic;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }
}
