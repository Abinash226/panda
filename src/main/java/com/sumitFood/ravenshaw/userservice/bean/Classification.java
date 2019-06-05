package com.sumitFood.ravenshaw.userservice.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Classification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cId;
	private String Acquirer;
	private String BatchID;
	private String CardBrand;
	private String CardType;
	private String FeeCategory;
	private String IppTenor;
	private String Network;
	private String OnUs;
	private String OrigCcy;
	private String Region;
	private String Success;
	private String TermID;
	private String TranCategory;
	private String VolumeCategory;
	
	@Override
	public String toString() {
		return "Classification [Acquirer=" + Acquirer + ", BatchID=" + BatchID + ", CardBrand=" + CardBrand
				+ ", CardType=" + CardType + ", FeeCategory=" + FeeCategory + ", IppTenor=" + IppTenor + ", Network="
				+ Network + ", OnUs=" + OnUs + ", OrigCcy=" + OrigCcy + ", Region=" + Region + ", Success=" + Success
				+ ", TermID=" + TermID + ", TranCategory=" + TranCategory + ", VolumeCategory=" + VolumeCategory + "]";
	}

	public String getAcquirer() {
		return Acquirer;
	}

	public void setAcquirer(String acquirer) {
		Acquirer = acquirer;
	}

	public String getBatchID() {
		return BatchID;
	}

	public void setBatchID(String batchID) {
		BatchID = batchID;
	}

	public String getCardBrand() {
		return CardBrand;
	}

	public void setCardBrand(String cardBrand) {
		CardBrand = cardBrand;
	}

	public String getCardType() {
		return CardType;
	}

	public void setCardType(String cardType) {
		CardType = cardType;
	}

	public String getFeeCategory() {
		return FeeCategory;
	}

	public void setFeeCategory(String feeCategory) {
		FeeCategory = feeCategory;
	}

	public String getIppTenor() {
		return IppTenor;
	}

	public void setIppTenor(String ippTenor) {
		IppTenor = ippTenor;
	}

	public String getNetwork() {
		return Network;
	}

	public void setNetwork(String network) {
		Network = network;
	}

	public String getOnUs() {
		return OnUs;
	}

	public void setOnUs(String onUs) {
		OnUs = onUs;
	}

	public String getOrigCcy() {
		return OrigCcy;
	}

	public void setOrigCcy(String origCcy) {
		OrigCcy = origCcy;
	}

	public String getRegion() {
		return Region;
	}

	public void setRegion(String region) {
		Region = region;
	}

	public String getSuccess() {
		return Success;
	}

	public void setSuccess(String success) {
		Success = success;
	}

	public String getTermID() {
		return TermID;
	}

	public void setTermID(String termID) {
		TermID = termID;
	}

	public String getTranCategory() {
		return TranCategory;
	}

	public void setTranCategory(String tranCategory) {
		TranCategory = tranCategory;
	}

	public String getVolumeCategory() {
		return VolumeCategory;
	}

	public void setVolumeCategory(String volumeCategory) {
		VolumeCategory = volumeCategory;
	}

	public Classification(String acquirer, String batchID, String cardBrand, String cardType, String feeCategory,
			String ippTenor, String network, String onUs, String origCcy, String region, String success, String termID,
			String tranCategory, String volumeCategory) {
		super();
		Acquirer = acquirer;
		BatchID = batchID;
		CardBrand = cardBrand;
		CardType = cardType;
		FeeCategory = feeCategory;
		IppTenor = ippTenor;
		Network = network;
		OnUs = onUs;
		OrigCcy = origCcy;
		Region = region;
		Success = success;
		TermID = termID;
		TranCategory = tranCategory;
		VolumeCategory = volumeCategory;
	}

	public Classification() {
		super();
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}
	
	
}