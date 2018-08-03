package com.report.CATToolApplication.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applications")
public class Application implements Serializable{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	int aid;
	String application_name;
	String app_type;
	String app_id;
	int unique_id;
	String priority;
	String department;
	int app_count;
	String apps;
	String app_migration;
	int is_assessment;
	int is_finalise;
	String app_cloud_provider;
	int is_active;
	String application_description;
	int is_deleted;
	int is_recommended;
	String rec_cloudable;
	String rec_migration;
	String rec_provider;
	int iteration_number;
	int created_by;
	double ICTCounter;
	String Team;
	String SummaryRptDataProcessing;
	
	
	
	public Application() {
		super();
	}
	
	
	public Application(int aid, String application_name, String app_type, String app_id, int unique_id, String priority,
			String department, int app_count, String apps, String app_migration, int is_assessment, int is_finalise,
			String app_cloud_provider, int is_active, String application_description, int is_deleted,
			int is_recommended, String rec_cloudable, String rec_migration, String rec_provider, int iteration_number,
			int created_by, double iCTCounter, String team, String summaryRptDataProcessing) {
		super();
		this.aid = aid;
		this.application_name = application_name;
		this.app_type = app_type;
		this.app_id = app_id;
		this.unique_id = unique_id;
		this.priority = priority;
		this.department = department;
		this.app_count = app_count;
		this.apps = apps;
		this.app_migration = app_migration;
		this.is_assessment = is_assessment;
		this.is_finalise = is_finalise;
		this.app_cloud_provider = app_cloud_provider;
		this.is_active = is_active;
		this.application_description = application_description;
		this.is_deleted = is_deleted;
		this.is_recommended = is_recommended;
		this.rec_cloudable = rec_cloudable;
		this.rec_migration = rec_migration;
		this.rec_provider = rec_provider;
		this.iteration_number = iteration_number;
		this.created_by = created_by;
		ICTCounter = iCTCounter;
		Team = team;
		SummaryRptDataProcessing = summaryRptDataProcessing;
	}


	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getApplication_name() {
		return application_name;
	}
	public void setApplication_name(String application_name) {
		this.application_name = application_name;
	}
	public String getApp_type() {
		return app_type;
	}
	public void setApp_type(String app_type) {
		this.app_type = app_type;
	}
	public String getApp_id() {
		return app_id;
	}
	public void setApp_id(String app_id) {
		this.app_id = app_id;
	}
	public int getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(int unique_id) {
		this.unique_id = unique_id;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getApp_count() {
		return app_count;
	}
	public void setApp_count(int app_count) {
		this.app_count = app_count;
	}
	public String getApps() {
		return apps;
	}
	public void setApps(String apps) {
		this.apps = apps;
	}
	public String getApp_migration() {
		return app_migration;
	}
	public void setApp_migration(String app_migration) {
		this.app_migration = app_migration;
	}
	public int getIs_assessment() {
		return is_assessment;
	}
	public void setIs_assessment(int is_assessment) {
		this.is_assessment = is_assessment;
	}
	public int getIs_finalise() {
		return is_finalise;
	}
	public void setIs_finalise(int is_finalise) {
		this.is_finalise = is_finalise;
	}
	public String getApp_cloud_provider() {
		return app_cloud_provider;
	}
	public void setApp_cloud_provider(String app_cloud_provider) {
		this.app_cloud_provider = app_cloud_provider;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public String getApplication_description() {
		return application_description;
	}
	public void setApplication_description(String application_description) {
		this.application_description = application_description;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public int getIs_recommended() {
		return is_recommended;
	}
	public void setIs_recommended(int is_recommended) {
		this.is_recommended = is_recommended;
	}
	public String getRec_cloudable() {
		return rec_cloudable;
	}
	public void setRec_cloudable(String rec_cloudable) {
		this.rec_cloudable = rec_cloudable;
	}
	public String getRec_migration() {
		return rec_migration;
	}
	public void setRec_migration(String rec_migration) {
		this.rec_migration = rec_migration;
	}
	public String getRec_provider() {
		return rec_provider;
	}
	public void setRec_provider(String rec_provider) {
		this.rec_provider = rec_provider;
	}
	public int getIteration_number() {
		return iteration_number;
	}
	public void setIteration_number(int iteration_number) {
		this.iteration_number = iteration_number;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public double getICTCounter() {
		return ICTCounter;
	}
	public void setICTCounter(double iCTCounter) {
		ICTCounter = iCTCounter;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	public String getSummaryRptDataProcessing() {
		return SummaryRptDataProcessing;
	}
	public void setSummaryRptDataProcessing(String summaryRptDataProcessing) {
		SummaryRptDataProcessing = summaryRptDataProcessing;
	}
	@Override
	public String toString() {
		return "Application [aid=" + aid + ", application_name=" + application_name + ", app_type=" + app_type
				+ ", app_id=" + app_id + ", unique_id=" + unique_id + ", priority=" + priority + ", department="
				+ department + ", app_count=" + app_count + ", apps=" + apps + ", app_migration=" + app_migration
				+ ", is_assessment=" + is_assessment + ", is_finalise=" + is_finalise + ", app_cloud_provider="
				+ app_cloud_provider + ", is_active=" + is_active + ", application_description="
				+ application_description + ", is_deleted=" + is_deleted + ", is_recommended=" + is_recommended
				+ ", rec_cloudable=" + rec_cloudable + ", rec_migration=" + rec_migration + ", rec_provider="
				+ rec_provider + ", iteration_number=" + iteration_number + ", created_by=" + created_by
				+ ", ICTCounter=" + ICTCounter + ", Team=" + Team + ", SummaryRptDataProcessing="
				+ SummaryRptDataProcessing + "]";
	}
	 
}
