package com.lfw.babyshop.entity;

public class Comment {
	private int commentId; //评论ID
	private int commentGoodsId; //评论商品ID
	private int commentUserId; //评论用户ID
	private int comments; //评论内容
	private int commentTime; //评论时间
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getCommentGoodsId() {
		return commentGoodsId;
	}
	public void setCommentGoodsId(int commentGoodsId) {
		this.commentGoodsId = commentGoodsId;
	}
	public int getCommentUserId() {
		return commentUserId;
	}
	public void setCommentUserId(int commentUserId) {
		this.commentUserId = commentUserId;
	}
	public int getComments() {
		return comments;
	}
	public void setComments(int comments) {
		this.comments = comments;
	}
	public int getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(int commentTime) {
		this.commentTime = commentTime;
	}
}
