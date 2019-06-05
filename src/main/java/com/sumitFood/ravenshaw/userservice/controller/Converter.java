package com.sumitFood.ravenshaw.userservice.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sumitFood.ravenshaw.userservice.bean.Classification;
import com.sumitFood.ravenshaw.userservice.bean.InterchangeFee;
import com.sumitFood.ravenshaw.userservice.bean.Posting;
import com.sumitFood.ravenshaw.userservice.repo.PostingRepository;

@RestController
@RequestMapping("/conv")
public class Converter {

	@Autowired
	private PostingRepository postingRepo;

	@PostMapping("/done")
	public String convert(@RequestParam("file") MultipartFile file) {
		String result = "UPDATED";
		//String home = System.getProperty("user.home");
		//File input = new File(home + File.separator + "Desktop"+ File.separator + "OAS_SG_20190130.xml");
		//File input = new File(file);
		try {
			Document doc = Jsoup.parse(convertTo(file), "UTF-8");
			List<Posting> postings = new ArrayList<>();

			for(Element f: doc.getElementsByTag("Tran")) {
				if(!(f.children().attr("Kind").equals("BalanceContract") ||
						f.children().attr("Kind").equals("Payment"))) {



					for(Element e : f.getElementsByTag("Posting")) {
						InterchangeFee interchangeFee = new InterchangeFee();

						interchangeFee.setCcy(f.getElementsByTag("InterchangeFee").attr("Ccy"));
						interchangeFee.setAmt(f.getElementsByTag("InterchangeFee").attr("Amt"));
						Posting posting = new Posting(); 
						posting.setInterchangeFee(interchangeFee);
						posting.setId(e.attr("Id"));
						posting.setFinOperKind(e.attr("FinOperKind")); 
						posting.setAmt(e.attr("Amt"));
						posting.setClassificationForGl(e.attr("ClassificationForGl"));
						posting.setGlCode(e.attr("GlCode"));
						posting.setPrimaryEntryPartSeq(e.attr("PrimaryEntryPartSeq"));
						posting.setRegRole(e.attr("RegRole"));
						posting.setPrimaryEntrySeq(e.attr("PrimaryEntrySeq"));
						posting.setSign(e.attr("Sign"));
						posting.setAccountId(e.attr("AccountId"));
						posting.setAccountNumber(e.attr("AccountNumber"));
						posting.setAccountExtNumber(e.attr("AccountExtNumber"));
						posting.setAccountCcy(e.attr("AccountCcy"));
						posting.setAccountContractId(e.attr("AccountContractId"));
						posting.setAccountContractRid(e.attr("AccountContractRid"));
						posting.setAccountClientId(e.attr("AccountClientId"));
						posting.setAccountClientRid(e.attr("AccountClientRid"));
						posting.setAccountTerminalId(e.attr("AccountTerminalId"));
						posting.setAccountTerminalRid(e.attr("AccountTerminalRid"));
						posting.setAccountPlanGuid(e.attr("AccountPlanGuid"));
						posting.setAccountPlanCode(e.attr("AccountPlanCode"));
						posting.setAccountPlanSubCode(e.attr("AccountPlanSubCode"));
						posting.setAccountPlanSyntheticAcctNumber(e.attr("AccountPlanSyntheticAcctNumber"));
						posting.setAccountBranchId(e.attr("AccountBranchId"));
						posting.setAccountBranchName(e.attr("AccountBranchName"));
						posting.setAccountBranchCode(e.attr("AccountBranchCode"));


						Classification classsi = new Classification();
						String[] classifica = e.attr("Classification").split(";");
						for(int i=0;i<classifica.length;i++) {

							String[] obj = classifica[i].split("=");
							if(obj[0].toString().equals("Acquirer")) {
								classsi.setAcquirer(obj[1].toString());
							}
							if(obj[0].toString().equals("BatchID")) {
								classsi.setBatchID(obj[1].toString());
							}
							if(obj[0].toString().equals("CardBrand")) {
								classsi.setCardBrand(obj[1].toString());
							}
							if(obj[0].toString().equals("CardType")) {
								classsi.setCardType(obj[1].toString());
							}
							if(obj[0].toString().equals("FeeCategory")) {
								classsi.setFeeCategory(obj[1].toString());
							}
							if(obj[0].toString().equals("IppTenor")) {
								classsi.setIppTenor(obj[1].toString());
							}
							if(obj[0].toString().equals("Network")) {
								classsi.setNetwork(obj[1].toString());
							}
							if(obj[0].toString().equals("OnUs")) {
								classsi.setOnUs(obj[1].toString());
							}
							if(obj[0].toString().equals("OrigCcy")) {
								classsi.setOrigCcy(obj[1].toString());
							}
							if(obj[0].toString().equals("Region")) {
								classsi.setRegion(obj[1].toString());
							}
							if(obj[0].toString().equals("Success")) {
								classsi.setSuccess(obj[1].toString());
							}
							if(obj[0].toString().equals("TermID")) {
								classsi.setTermID(obj[1].toString());
							}
							if(obj[0].toString().equals("TranCategory")) {
								classsi.setTranCategory(obj[1].toString());
							}

							if(obj[0].toString().equals("VolumeCategory")) {
								classsi.setVolumeCategory(obj[1].toString());
							}

						}
						posting.setClassification(classsi);
						postings.add(posting);
						

					}


				}
			}
			postingRepo.saveAll(postings);
		}

		catch (IOException e) {

			e.printStackTrace();
		}
		return result;
	}
	
	@GetMapping("/test")
	public String test() {
		return "I AM POSSIBLE";
	}
	
	public static File convertTo(MultipartFile file) throws IOException {
	    File convFile = new File(file.getOriginalFilename());
	    convFile.createNewFile();
	    FileOutputStream fos = new FileOutputStream(convFile);
	    fos.write(file.getBytes());
	    fos.close();
	    return convFile;
	}


}

