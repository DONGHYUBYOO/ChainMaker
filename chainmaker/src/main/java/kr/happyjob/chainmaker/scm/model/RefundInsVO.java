package kr.happyjob.chainmaker.scm.model;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RefundInsVO {
	private Date order_date;
	private Date purchase_date;
	private String pro_name;
	private int refund_qty;
	private int pro_price;
	private int refund_confirm_cd;
	private int refund_no;
	private int order_no;
	private int purchase_no;
	private int purchase_cd;
	
	
	
}
