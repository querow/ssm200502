package com.fs.model;

import java.io.Serializable;

public class Permissions implements Serializable {
    @Override
    public String toString() {
        return "Permissions{" +
                "permissionsId=" + permissionsId +
                ", permissionsName='" + permissionsName + '\'' +
                ", permissionsDesc='" + permissionsDesc + '\'' +
                '}';
    }

    public Permissions() {
    }

    public Permissions(Integer permissionsId, String permissionsName, String permissionsDesc) {
        this.permissionsId = permissionsId;
        this.permissionsName = permissionsName;
        this.permissionsDesc = permissionsDesc;
    }

    private Integer permissionsId;

    private String permissionsName;

    private String permissionsDesc;

    public Integer getPermissionsId() {
        return permissionsId;
    }

    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    public String getPermissionsName() {
        return permissionsName;
    }

    public void setPermissionsName(String permissionsName) {
        this.permissionsName = permissionsName;
    }

    public String getPermissionsDesc() {
        return permissionsDesc;
    }

    public void setPermissionsDesc(String permissionsDesc) {
        this.permissionsDesc = permissionsDesc;
    }
}