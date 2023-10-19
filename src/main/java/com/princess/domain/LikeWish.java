package com.princess.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.princess.domain.CheckCondition.Type;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "likeId")
@Entity
public class LikeWish {
	
	@Id @GeneratedValue
	private Long likeSeq;
	
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@ManyToOne
	@JoinColumn(name = "MEMBER_ID", nullable = false, updatable = false)
	private Member likeId;
	
	private Date regdate = new Date();
	
	// 연관관계 설정
	
	public void setLikeId(Member id) { // Member
		this.likeId = id;
		likeId.getLikeWishList().add(this);
	}
}
