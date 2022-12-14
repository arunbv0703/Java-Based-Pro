package com.xworkz.crud.runner;

import java.time.LocalDateTime;
import com.xworkz.crud.dto.ArrayisFullcantaddMore;
import com.xworkz.crud.dto.IPL;
import com.xworkz.crud.dto.IPLRepositoryImplements;

public class IPLRunner {

	public static void main(String[] args) throws ArrayisFullcantaddMore {
		IPLRepositoryImplements iplRepositoryImplements = new IPLRepositoryImplements();
		IPL ipl = new IPL();
		ipl.setCaptainName("Kohil");
		ipl.setTeamName("RCB");
		ipl.setCreatedDate(LocalDateTime.of(2022, 05,10, 5, 30));
		ipl.setDefeats(137);
		ipl.setOwneralive(true);
		ipl.setPurse(100);
		ipl.setCreatedBy(null);
		ipl.setWins(110);
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl2 = new IPL();
		ipl2.setCaptainName("DHONI");
		ipl2.setTeamName("CSK");
		ipl2.setCreatedDate(LocalDateTime.now());
		ipl2.setDefeats(112);
		ipl2.setOwneralive(false);
		ipl2.setPurse(91);
		ipl2.setCreatedDate(LocalDateTime.now());
		ipl2.setWins(22);
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl3 = new IPL();
		ipl3.setCaptainName("Rohit");
		ipl3.setTeamName("MI");
		ipl3.setCreatedDate(LocalDateTime.now());
		ipl3.setDefeats(98);
		ipl3.setOwneralive(true);
		ipl3.setPurse(95);
		ipl3.setCreatedDate(LocalDateTime.now());
		ipl3.setWins(85);
		ipl3.setUpdatedBy("Polardo");
		ipl3.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl4 = new IPL();
		ipl4.setCaptainName("Suresh Raina");
		ipl4.setTeamName("GT");
		ipl4.setCreatedDate(LocalDateTime.now());
		ipl4.setDefeats(98);
		ipl4.setOwneralive(true);
		ipl4.setPurse(95);
		ipl4.setCreatedDate(LocalDateTime.now());
		ipl4.setWins(85);
		ipl4.setUpdatedBy("Polardo");
		ipl4.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl5 = new IPL();
		ipl5.setCaptainName("Ganguly");
		ipl5.setTeamName("KKR");
		ipl5.setCreatedDate(LocalDateTime.now());
		ipl5.setDefeats(98);
		ipl5.setOwneralive(true);
		ipl5.setPurse(95);
		ipl5.setCreatedDate(LocalDateTime.now());
		ipl5.setWins(85);
		ipl5.setUpdatedBy("Polardo");
		ipl5.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl6 = new IPL();
		ipl6.setCaptainName("ABD");
		ipl6.setTeamName("RCB");
		ipl6.setCreatedDate(LocalDateTime.now());
		ipl6.setDefeats(98);
		ipl6.setOwneralive(true);
		ipl6.setPurse(95);
		ipl6.setCreatedDate(LocalDateTime.now());
		ipl6.setWins(85);
		ipl6.setUpdatedBy("Polardo");
		ipl6.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl7 = new IPL();
		ipl7.setCaptainName("Kane villiamson");
		ipl7.setTeamName("SRH");
		ipl7.setCreatedDate(LocalDateTime.now());
		ipl7.setDefeats(98);
		ipl7.setOwneralive(true);
		ipl7.setPurse(95);
		ipl7.setCreatedDate(LocalDateTime.now());
		ipl7.setWins(85);
		ipl7.setUpdatedBy("Polardo");
		ipl7.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl8 = new IPL();
		ipl8.setCaptainName("Dawan");
		ipl8.setTeamName("SRH");
		ipl8.setCreatedDate(LocalDateTime.now());
		ipl8.setDefeats(98);
		ipl8.setOwneralive(true);
		ipl8.setPurse(95);
		ipl8.setCreatedDate(LocalDateTime.now());
		ipl8.setWins(85);
		ipl8.setUpdatedBy("Polardo");
		ipl8.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		iplRepositoryImplements.create(ipl);
		IPL ipl9 = new IPL();
		ipl9.setCaptainName("Rohit");
		ipl9.setTeamName("MI");
		ipl9.setCreatedDate(LocalDateTime.now());
		ipl9.setDefeats(98);
		ipl9.setOwneralive(true);
		ipl9.setPurse(95);
		ipl9.setCreatedDate(LocalDateTime.now());
		ipl9.setWins(85);
		ipl9.setUpdatedBy("Polardo");
		ipl9.setUpdatedDate(LocalDateTime.now());
		System.out.println("____________________________________________");
		
		IPL ipl10 = new IPL();
		ipl10.setCaptainName("Rohit");
		ipl10.setTeamName("MI");
		ipl10.setCreatedDate(LocalDateTime.now());
		ipl10.setDefeats(98);
		ipl10.setOwneralive(true);
		ipl10.setPurse(95);
		ipl10.setCreatedDate(LocalDateTime.now());
		ipl10.setWins(85);
		ipl10.setUpdatedBy("Polardo");
		ipl10.setUpdatedDate(LocalDateTime.now());
	}

}
