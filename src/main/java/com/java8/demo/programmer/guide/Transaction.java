package com.java8.demo.programmer.guide;

public class Transaction {

	private String traxId;
	private String traxDate;
	private String clientName;
	private String traxType;
	private String traxAmount;


	public Transaction(String traxId, String traxDate, String clientName, String traxType, String traxAmount) {
		super();
		this.traxId = traxId;
		this.traxDate = traxDate;
		this.clientName = clientName;
		this.traxType = traxType;
		this.traxAmount = traxAmount;
	}

	public String getTraxId() {
		return traxId;
	}

	public void setTraxId(String traxId) {
		this.traxId = traxId;
	}

	public String getTraxDate() {
		return traxDate;
	}

	public void setTraxDate(String traxDate) {
		this.traxDate = traxDate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getTraxType() {
		return traxType;
	}

	public void setTraxType(String traxType) {
		this.traxType = traxType;
	}

	public String getTraxAmount() {
		return traxAmount;
	}

	public void setTraxAmount(String traxAmount) {
		this.traxAmount = traxAmount;
	}

	@Override
	public String toString() {
		return "Transaction [traxId=" + traxId + ", traxDate=" + traxDate + ", clientName=" + clientName + ", traxType="
				+ traxType + ", traxAmount=" + traxAmount + "]";
	}

}
