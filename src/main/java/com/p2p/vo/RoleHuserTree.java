package com.p2p.vo;

import java.util.List;

/**
 * Created by qingfeng on 2018/1/15.
 */
public class RoleHuserTree {

    private String title;
    private String value;
    private boolean checked;
    private boolean disabled;
    private List<RoleHuserTree> data;

    public RoleHuserTree(){
    }

    public RoleHuserTree(String title, String value, boolean checked, List<RoleHuserTree> data){
        this.title = title;
        this.value = value;
        this.checked = checked;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public List<RoleHuserTree> getData() {
        return data;
    }

    public void setData(List<RoleHuserTree> data) {
        this.data = data;
    }
}
