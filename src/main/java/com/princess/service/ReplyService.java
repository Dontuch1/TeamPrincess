package com.princess.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.princess.domain.Board;
import com.princess.domain.Reply;

public interface ReplyService {
	
	Reply saveReply(Reply reply);
	
	 Reply saveReReply(Reply reply);
	
	Page<Reply> getBoard(Board board, Pageable pageable);
	
	void deleteReply(Long id);

	List<Reply> findByBoard(Board board);

}
