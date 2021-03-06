package com.iu.mk.cart;

import java.util.List;

import com.iu.mk.pay.PayInfoVO;
import com.iu.mk.pay.PayVO;
import com.iu.mk.product.ProductVO;
import com.iu.mk.product.productfile.ProductFileVO;

public class CartVO {
	private long cq_num;
	private long p_num;
	private long count;
	private long cart_num;
	private int payCheck;
	
	


	private List<ProductFileVO> productFileVOs;
	
	private List<ProductVO> productVOs;

	private List<PayVO> payVOs;
	
	



	public List<ProductFileVO> getProductFileVOs() {
		return productFileVOs;
	}



	public void setProductFileVOs(List<ProductFileVO> productFileVOs) {
		this.productFileVOs = productFileVOs;
	}



	public List<ProductVO> getProductVOs() {
		return productVOs;
	}



	public void setProductVOs(List<ProductVO> productVOs) {
		this.productVOs = productVOs;
	}



	public List<PayVO> getPayVOs() {
		return payVOs;
	}



	public void setPayVOs(List<PayVO> payVOs) {
		this.payVOs = payVOs;
	}



	public long getCq_num() {
		return cq_num;
	}



	public void setCq_num(long cq_num) {
		this.cq_num = cq_num;
	}



	public long getP_num() {
		return p_num;
	}



	public void setP_num(long p_num) {
		this.p_num = p_num;
	}



	public long getCount() {
		return count;
	}



	public void setCount(long count) {
		this.count = count;
	}



	public long getCart_num() {
		return cart_num;
	}



	public void setCart_num(long cart_num) {
		this.cart_num = cart_num;
	}



	public int getPayCheck() {
		return payCheck;
	}



	public void setPayCheck(int payCheck) {
		this.payCheck = payCheck;
	}




	
	
	
	
	
	
	
}
