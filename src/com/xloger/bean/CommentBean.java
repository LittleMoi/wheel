package com.xloger.bean;

import com.xloger.dao.UserDao;
import com.xloger.tool.BrowseTool;
	/**
	 * Agent存入为原生UA信息，暂时有些Bug
	 *
	 */
public class CommentBean {
	private int ID;
	private int post_ID;
	private int author_ID;
	private String content;
	private java.sql.Timestamp date;
	private int status;
	private String ip;
	private String agent;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPost_ID() {
		return post_ID;
	}
	public void setPost_ID(int post_ID) {
		this.post_ID = post_ID;
	}
	public UserBean getAuthor_ID() {
		UserDao udao=new UserDao();
		UserBean us=udao.getUser(author_ID);
		return us;
	}
	public void setAuthor_ID(int author_ID) {
		this.author_ID = author_ID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content =content;
	}
	public java.sql.Timestamp getDate() {
		return date;
	}
	public void setDate(java.sql.Timestamp date) {
		this.date = date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getAgent() {
		return BrowseTool.checkBrowse(agent);
	}
	public String cunAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	
}
