package com.ohgiraffers.model.dto;

public class DepartmentDTO {
    private String deptId;
    private String deptTitle;
    private String locationId;
    public DepartmentDTO() {
    }


    public DepartmentDTO(String locationId, String deptTitle, String deptId) {
        this.locationId = locationId;
        this.deptTitle = deptTitle;
        this.deptId = deptId;
    }

    public String getDpetId() {
        return deptId;
    }

    public void setDpetId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptTitle() {
        return deptTitle;
    }
    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }
    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "deptId='" + deptId + '\'' +
                ", deptTitle='" + deptTitle + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }


}
