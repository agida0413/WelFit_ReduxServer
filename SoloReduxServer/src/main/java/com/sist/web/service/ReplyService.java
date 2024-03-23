package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.query.Param;

import com.sist.web.entity.PjReply;

public interface ReplyService {
	public Map replyNormalList(int pno,int page);
	public String replyInsert(PjReply vo);
	public String replyDelete(int rno);
	public String replyUpdate(PjReply vo);
	
}
