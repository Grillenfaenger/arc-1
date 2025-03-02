package de.spinfo.arc.annotationmodel.annotation.impl;

import de.spinfo.arc.annotationmodel.annotation.Annotation;

import java.io.Serializable;
import java.util.Date;


public class AnnotationImpl implements Annotation, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date date;
	private int score;
	private String userId;
	
	
	/**
	 * empty Constructor for GWT - don't use otherwise!
	 */
	public AnnotationImpl(){};
	
	public AnnotationImpl(Date date, int score, String userId){
		super();
		this.date = date;
		this.score = score;
		this.userId = userId;
//		this.annotationType = annotationType;
	};
	
	
	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public Date getDate() {
		return date;
	}

	@Override
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int getScore() {
		return score;
	}

	@Override
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String getUserId() {
		return userId;
	}

	@Override
	public int hashCode() {
		int result = 17;
//		result = 31 * result + getDate().hashCode();
		result = 31 * result + getUserId().hashCode();
		result = 31 * result + getScore();
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj instanceof Annotation) {
			Annotation other = (Annotation) obj;
//			boolean isDate = getDate().equals(other.getDate());
//			if (!isDate) return false;
			boolean isUser = getUserId().equals(other.getUserId());
			if (!isUser) return false;
			boolean isScore = getScore() == other.getScore();
			if (!isScore) return false;
			
			return true;
		} 
		else 
			return false;

	}

	@Override
	public String toString() {
		return "AnnotationImpl [date=" + date + ", score=" + score
				+ ", userId=" + userId +
//				+ 
				"]";
	}

}
