package com.princess.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.princess.domain.Board;
import com.princess.domain.Member;
import com.princess.domain.Product;
import com.princess.domain.Review;

public interface MypageService {

	// 회원정보 가져오기
	Member getMember(Member member);

	// 회원정보 수정
	void updateMember(Member member);

	// 내 게시글 리스트
	Page<Board> getBoardList(Pageable pageable, Member member);

	// 내 등록 상품 리스트
	List<Product> getProductList(Member member);

	// 내가 받은 후기
	Page<Review> getReviewList(Pageable pageable, Member member);

	// 찜 목록
	List<Product> getLikeWishList(Member member);

	// 예치금 넣기
	void updateDeposit(Member member);

	// 구매 목록
	Map<Product, String[]> getBuyList(Member member);

	// 리뷰 등록
	void insertReview(Review review, Product product);

	// 배터리 변경
	void updateBattery(Member member);

	// 보낸 리뷰
	Page<Review> getSentReviewList(Pageable pageable, String sender);

	// 썬더맨 아이디
	String thunderId(Product product);
	
	// 구매자 아이디
	String buyerId(Product product);
	
	// 후기 작성 여부
	boolean isReviewed(Product product, String sender, String receiver);
	
	// 캐삭
	void disalbeMember(Member member);
}