package com.project;

import lombok.NonNull;

/**
 * 案件のDTO
 *
 */

public class Project {
    /* アーティファクトID */
    private String ObjectIdForProject;
    
    /* ユーザID */
    private String userID;
    /* プロジェクト名 */
    private String projectName;
    /* 作業場所 */
    private String projectPlace;
    /* 担当営業 */
    private String salesStaff;
    /* 案件概要 */
    private String projectInfo;
    /* プロジェクト構成 */
    private String projectOrganization;
    /* 環境/スキル */
    private String skills;
    /* 案件動向 */
    private String projectTrend;
    /* 顧客動向 */
    private String customerTrend;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }


    public String getProjectPlace() {
        return projectPlace;
    }


    public void setProjectPlace(String projectPlace) {
        this.projectPlace = projectPlace;
    }


    public String getSalesStaff() {
        return salesStaff;
    }


    public void setSalesStaff(String salesStaff) {
        this.salesStaff = salesStaff;
    }


    public String getProjectInfo() {
        return projectInfo;
    }


    public void setProjectInfo(String projectInfo) {
        this.projectInfo = projectInfo;
    }


    public String getProjectOrganization() {
        return projectOrganization;
    }


    public void setProjectOrganization(String projectOrganization) {
        this.projectOrganization = projectOrganization;
    }


    public String getSkills() {
        return skills;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }


    public String getProjectTrend() {
        return projectTrend;
    }


    public void setProjectTrend(String projectTrend) {
        this.projectTrend = projectTrend;
    }


    public String getCustomerTrend() {
        return customerTrend;
    }


    public void setCustomerTrend(String customerTrend) {
        this.customerTrend = customerTrend;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    

}