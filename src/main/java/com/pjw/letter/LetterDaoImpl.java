package com.pjw.letter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LetterDaoImpl implements LetterDao {

	static final String INSERT_LETTER = "insert title,content,senderId,senderName,receiverId,receiverName";
	static final String SEND_LETTER = "select title,content,receiverId,receiverName, cdate where senderId=(????)";
	static final String RECIEVE_LETTER = "select title,content,senderId,senderName,cdate where receiveId=(????)";
	static final String LIST_LETTER = "select letterId,title,senderId,senderName,receiverId,receiverName,cdate from letter where letterId=(?)  and senerId=(????) or receiverId=(????)";
	static final String DELETE_LETTER = "delete from letter where letterId=? and senderId=???? or receiverId=????";

	@Autowired
	JdbcTemplate jdbcTemplate;

}
