package kr.happyjob.chainmaker.epc.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class ProductListModel {
		// 장비번호
		private String pro_num;

		// 장비구분
		private String pro_cod;

		// 모델번호
		private String pro_cod_num;

		// 모델명
		private String pro_cod_nam;

		// 제조사
		private String pro_manu_nm;
		
		// 판매가격
		private int pro_prc;
		
		// 상세설명
		private String pro_det;
		
		// 로그인 id
		private String login_id;
		
		// 납품일자
		private Date startDate;
		
		// 주문수량
		private int od_qty;
		
		// 장바구니 중복체크 
		private int exBasket;
				
		// 은행 어카운트
		private String user_account;
		// 은행 		
		private String name;
		// 은행 이름
		private String bank_name;
		
		private String file_server_path;
}