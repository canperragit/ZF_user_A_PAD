package com.example.zf_pad.trade.entity;

import com.google.gson.annotations.SerializedName;


public class AfterSaleDetailLease extends AfterSaleDetail {

	@SerializedName("lease_price")
	private int leasePrice;

	@SerializedName("lease_deposit")
	private int leaseDeposit;

	@SerializedName("lease_length")
	private int leaseLength;

	@SerializedName("lease_max_time")
	private int leaseMaxTime;

	@SerializedName("lease_min_time")
	private int leaseMinTime;

	@SerializedName("receiver_name")
	private String receiverName;

	@SerializedName("receiver_phone")
	private String receiverPhone;

	public int getLeasePrice() {
		return leasePrice;
	}

	public void setLeasePrice(int leasePrice) {
		this.leasePrice = leasePrice;
	}

	public int getLeaseDeposit() {
		return leaseDeposit;
	}

	public void setLeaseDeposit(int leaseDeposit) {
		this.leaseDeposit = leaseDeposit;
	}

	public int getLeaseLength() {
		return leaseLength;
	}

	public void setLeaseLength(int leaseLength) {
		this.leaseLength = leaseLength;
	}

	public int getLeaseMaxTime() {
		return leaseMaxTime;
	}

	public void setLeaseMaxTime(int leaseMaxTime) {
		this.leaseMaxTime = leaseMaxTime;
	}

	public int getLeaseMinTime() {
		return leaseMinTime;
	}

	public void setLeaseMinTime(int leaseMinTime) {
		this.leaseMinTime = leaseMinTime;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return receiverPhone;
	}

	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
}
