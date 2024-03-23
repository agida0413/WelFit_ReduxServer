package com.sist.web.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.data.annotation.Persistent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
 * rno int AI PK 
content text 
rtype int 
root int 
depth int 
pno int 
userid varchar(51) 
username varchar(51) 
regdate datetime
 * 
 */
@Entity
@Data
@NoArgsConstructor
@Table(name = "pjreply")
public class PjReply {
	
	

	@Id
	private int rno;
	@Column(insertable = true,updatable = true)
	private String content;
	@Column(insertable = true,updatable = false)
	private String userid,username;
	@Column(insertable = true,updatable = false)
	private int rtype,root,pno;
	@Column(insertable = true,updatable = true)
	private int depth;
	@Column(insertable = true,updatable = false)
	 private String regdate;
	
	
	 @PrePersist
	    public void regdate() {
	    	this.regdate=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
	    }
}
