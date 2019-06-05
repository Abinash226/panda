package com.sumitFood.ravenshaw.userservice.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Posting

{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long pId;
	
	private String PrimaryEntryPartSeq;

	private String RegRole;

	private String ClassificationForGl;

	private String PrimaryEntrySeq;

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	private String FinOperKind;
	@OneToOne(cascade = CascadeType.ALL)
	private Classification Classification;

	private String GlCode;

	private String Amt;

	private String Sign;

	private String Id;

	private String AccountId;

	private String AccountNumber;

	private String AccountExtNumber;

	private String AccountCcy;

	private String AccountContractId;

	private String AccountContractRid;

	private String AccountClientId;

	private String AccountClientRid;

	private String AccountTerminalId;

	private String AccountTerminalRid;

	private String AccountPlanSyntheticAcctNumber;

	private String AccountBranchCode;

	private String AccountPlanGuid;

	private String AccountPlanCode;

	private String AccountPlanSubCode;

	private String AccountBranchId;

	private String AccountBranchName;



	public String getAccountId() {
		return AccountId;
	}

	public void setAccountId(String accountId) {
		AccountId = accountId;
	}

	public String getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}

	public String getAccountExtNumber() {
		return AccountExtNumber;
	}

	public void setAccountExtNumber(String accountExtNumber) {
		AccountExtNumber = accountExtNumber;
	}

	public String getAccountCcy() {
		return AccountCcy;
	}

	public void setAccountCcy(String accountCcy) {
		AccountCcy = accountCcy;
	}

	public String getAccountContractId() {
		return AccountContractId;
	}

	public void setAccountContractId(String accountContractId) {
		AccountContractId = accountContractId;
	}

	public String getAccountContractRid() {
		return AccountContractRid;
	}

	public void setAccountContractRid(String accountContractRid) {
		AccountContractRid = accountContractRid;
	}

	public String getAccountClientId() {
		return AccountClientId;
	}

	public void setAccountClientId(String accountClientId) {
		AccountClientId = accountClientId;
	}

	public String getAccountClientRid() {
		return AccountClientRid;
	}

	public void setAccountClientRid(String accountClientRid) {
		AccountClientRid = accountClientRid;
	}

	public String getAccountTerminalId() {
		return AccountTerminalId;
	}

	public void setAccountTerminalId(String accountTerminalId) {
		AccountTerminalId = accountTerminalId;
	}

	public String getAccountTerminalRid() {
		return AccountTerminalRid;
	}

	public void setAccountTerminalRid(String accountTerminalRid) {
		AccountTerminalRid = accountTerminalRid;
	}

	public String getAccountPlanSyntheticAcctNumber() {
		return AccountPlanSyntheticAcctNumber;
	}

	public void setAccountPlanSyntheticAcctNumber(String accountPlanSyntheticAcctNumber) {
		AccountPlanSyntheticAcctNumber = accountPlanSyntheticAcctNumber;
	}

	public String getAccountBranchCode() {
		return AccountBranchCode;
	}

	public void setAccountBranchCode(String accountBranchCode) {
		AccountBranchCode = accountBranchCode;
	}

	public String getAccountPlanGuid() {
		return AccountPlanGuid;
	}

	public void setAccountPlanGuid(String accountPlanGuid) {
		AccountPlanGuid = accountPlanGuid;
	}

	public String getAccountPlanCode() {
		return AccountPlanCode;
	}

	public void setAccountPlanCode(String accountPlanCode) {
		AccountPlanCode = accountPlanCode;
	}

	public String getAccountPlanSubCode() {
		return AccountPlanSubCode;
	}

	public void setAccountPlanSubCode(String accountPlanSubCode) {
		AccountPlanSubCode = accountPlanSubCode;
	}

	public String getAccountBranchId() {
		return AccountBranchId;
	}

	public void setAccountBranchId(String accountBranchId) {
		AccountBranchId = accountBranchId;
	}

	public String getAccountBranchName() {
		return AccountBranchName;
	}

	public void setAccountBranchName(String accountBranchName) {
		AccountBranchName = accountBranchName;
	}

	public Classification getClassification() {
		return Classification;
	}

	public void setClassification(Classification classification) {
		Classification = classification;
	}

	public String getPrimaryEntryPartSeq ()
	{
		return PrimaryEntryPartSeq;
	}

	public void setPrimaryEntryPartSeq (String PrimaryEntryPartSeq)
	{
		this.PrimaryEntryPartSeq = PrimaryEntryPartSeq;
	}

	public String getRegRole ()
	{
		return RegRole;
	}

	public void setRegRole (String RegRole)
	{
		this.RegRole = RegRole;
	}

	public String getClassificationForGl ()
	{
		return ClassificationForGl;
	}

	public void setClassificationForGl (String ClassificationForGl)
	{
		this.ClassificationForGl = ClassificationForGl;
	}

	public String getPrimaryEntrySeq ()
	{
		return PrimaryEntrySeq;
	}

	public void setPrimaryEntrySeq (String PrimaryEntrySeq)
	{
		this.PrimaryEntrySeq = PrimaryEntrySeq;
	}

	public String getFinOperKind ()
	{
		return FinOperKind;
	}

	public void setFinOperKind (String FinOperKind)
	{
		this.FinOperKind = FinOperKind;
	}



	public String getGlCode ()
	{
		return GlCode;
	}

	public void setGlCode (String GlCode)
	{
		this.GlCode = GlCode;
	}

	public String getAmt ()
	{
		return Amt;
	}

	public void setAmt (String Amt)
	{
		this.Amt = Amt;
	}

	public String getSign ()
	{
		return Sign;
	}

	public void setSign (String Sign)
	{
		this.Sign = Sign;
	}

	public String getId ()
	{
		return Id;
	}

	public void setId (String Id)
	{
		this.Id = Id;
	}

	@Override
	public String toString() {
		return "Posting [PrimaryEntryPartSeq=" + PrimaryEntryPartSeq + ", RegRole=" + RegRole + ", ClassificationForGl="
				+ ClassificationForGl + ", PrimaryEntrySeq=" + PrimaryEntrySeq + ", FinOperKind=" + FinOperKind
				+ ", Classification=" + Classification + ", GlCode=" + GlCode + ", Amt=" + Amt + ", Sign=" + Sign
				+ ", Id=" + Id + ", AccountId=" + AccountId + ", AccountNumber=" + AccountNumber + ", AccountExtNumber="
				+ AccountExtNumber + ", AccountCcy=" + AccountCcy + ", AccountContractId=" + AccountContractId
				+ ", AccountContractRid=" + AccountContractRid + ", AccountClientId=" + AccountClientId
				+ ", AccountClientRid=" + AccountClientRid + ", AccountTerminalId=" + AccountTerminalId
				+ ", AccountTerminalRid=" + AccountTerminalRid + ", AccountPlanSyntheticAcctNumber="
				+ AccountPlanSyntheticAcctNumber + ", AccountBranchCode=" + AccountBranchCode + ", AccountPlanGuid="
				+ AccountPlanGuid + ", AccountPlanCode=" + AccountPlanCode + ", AccountPlanSubCode="
				+ AccountPlanSubCode + ", AccountBranchId=" + AccountBranchId + ", AccountBranchName="
				+ AccountBranchName + "]";
	}

	@ManyToOne(cascade = CascadeType.ALL)
	private InterchangeFee interchangeFee;

	public InterchangeFee getInterchangeFee() {
		return interchangeFee;
	}

	public void setInterchangeFee(InterchangeFee interchangeFee) {
		this.interchangeFee = interchangeFee;
	}
	
	
	
}