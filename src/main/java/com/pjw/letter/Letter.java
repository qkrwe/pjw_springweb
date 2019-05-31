package com.pjw.letter;

public class Letter {
	 String Letterid;
	 String title;
	 String content;
	 String senderId;
	 String senderName;
	 String receiverId;
	 String receverName;
	 String cdate;

	@Override
	public String toString() {
		return "Letter [Letterid=" + Letterid + ", title=" + title + ", content=" + content + ", senderId=" + senderId
				+ ", senderName=" + senderName + ", receiverId=" + receiverId + ", receverName=" + receverName
				+ ", cdate=" + cdate + "]";
	}

	public String getLetterid() {
		return Letterid;
	}

	public void setLetterid(String letterid) {
		Letterid = letterid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSenderId() {
		return senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}

	public String getReceverName() {
		return receverName;
	}

	public void setReceverName(String receverName) {
		this.receverName = receverName;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public Letter() {
		// TODO Auto-generated constructor stub
	}

}
