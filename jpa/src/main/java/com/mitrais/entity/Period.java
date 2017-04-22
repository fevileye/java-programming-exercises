package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

// TODO please add annotation for entity class
@Entity
@Table(name = "t_period")
public class Period implements Serializable {
    // TODO implement this entity class
    private Date startDate;

	@Id
    private Date endDate;

    

	public Period() {
    
    }

    public void setStartDate(Date startDate) {
    	this.startDate=startDate;
    }
    
    public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
    
    public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}
}
