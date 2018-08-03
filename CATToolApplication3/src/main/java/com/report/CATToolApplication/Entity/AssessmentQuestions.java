package com.report.CATToolApplication.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="assessment_questions")
public class AssessmentQuestions implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int qid;
	String question_type;
	int is_deleted;
	int client_id;
	String translated_question;
	String question;
	int display_order;
	int number_of_options;
	String description;
	String assessment_type;
	int is_active;
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion_type() {
		return question_type;
	}
	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}
	public int getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(int is_deleted) {
		this.is_deleted = is_deleted;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public String getTranslated_question() {
		return translated_question;
	}
	public void setTranslated_question(String translated_question) {
		this.translated_question = translated_question;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getDisplay_order() {
		return display_order;
	}
	public void setDisplay_order(int display_order) {
		this.display_order = display_order;
	}
	public int getNumber_of_options() {
		return number_of_options;
	}
	public void setNumber_of_options(int number_of_options) {
		this.number_of_options = number_of_options;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssessment_type() {
		return assessment_type;
	}
	public void setAssessment_type(String assessment_type) {
		this.assessment_type = assessment_type;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	
	public AssessmentQuestions() {
		super();
	}
	public AssessmentQuestions(int qid, String question_type, int is_deleted, int client_id, String translated_question,
			String question, int display_order, int number_of_options, String description, String assessment_type,
			int is_active) {
		super();
		this.qid = qid;
		this.question_type = question_type;
		this.is_deleted = is_deleted;
		this.client_id = client_id;
		this.translated_question = translated_question;
		this.question = question;
		this.display_order = display_order;
		this.number_of_options = number_of_options;
		this.description = description;
		this.assessment_type = assessment_type;
		this.is_active = is_active;
	}
	@Override
	public String toString() {
		return "AssessmentQuestions [qid=" + qid + ", question_type=" + question_type + ", is_deleted=" + is_deleted
				+ ", client_id=" + client_id + ", translated_question=" + translated_question + ", question=" + question
				+ ", display_order=" + display_order + ", number_of_options=" + number_of_options + ", description="
				+ description + ", assessment_type=" + assessment_type + ", is_active=" + is_active + "]";
	}
	
	
	
}