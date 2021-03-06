package com.xloger.bean;

import com.xloger.dao.UserDao;
import com.xloger.tool.MyTool;
	/**
	 * author为作者ID，当通过get方法获取时为UserBean对象
	 * title与content的set方法均经过了MyTool的转义
	 */
public class PostBean {
	private int ID;
	private String author;
	private String title;
	private String content;
	private java.sql.Timestamp date;
	private int status;
	private int comNum;
	private int lookNum;
	private java.sql.Timestamp lastdate;
	private String lastuser;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public UserBean getAuthor() {
		UserDao udao=new UserDao();
		UserBean us=udao.getUser(Integer.parseInt(author));
		return us;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = MyTool.changeHTML(title);
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = MyTool.changeHTML(content);
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
	public int getComNum() {
		return comNum;
	}
	public void setComNum(int comNum) {
		this.comNum = comNum;
	}
	public int getLookNum() {
		return lookNum;
	}
	public void setLookNum(int lookNum) {
		this.lookNum = lookNum;
	}
	public java.sql.Timestamp getLastdate() {
		return lastdate;
	}
	public void setLastdate(java.sql.Timestamp lastdate) {
		this.lastdate = lastdate;
	}
	public String getLastuser() {
		return lastuser;
	}
	public void setLastuser(String lastuser) {
		this.lastuser = lastuser;
	}
	
}
