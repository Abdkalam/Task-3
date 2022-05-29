package org.sam;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.tes.BaseClass;
import org.tes.HotelPojo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HotelApp extends BaseClass {

	@Test(dataProvider = "data")
	private void login(String usname, String uspass, String loc, String hot, String type, String no, String aNo,
			String cNo, String fir, String sec, String add, String crd, String typ, String mon, String yr, String cvv) {

		launch();
		link("http://www.adactin.com/HotelApp/");
		maxWindow();
		HotelPojo li = new HotelPojo();
		fill(li.getUser(), usname);
		fill(li.getPass(), uspass);
		clk(li.getLog());
		select(li.getLoc(), loc);
		select(li.getHot(), hot);
		select(li.getRotype(), type);
		select(li.getRonos(),no);
		select(li.getAdrom(), aNo);
		select(li.getChroom(), cNo);
		clk(li.getSub());
		clk(li.getRadioclk());
		clk(li.getSearchhotel());
		fill(li.getFirstname(), fir);
		fill(li.getLastname(), sec);
		fill(li.getAddress(), add);
		fill(li.getCardno(), crd);
		select(li.getCardtype(),typ);
		select(li.getCardmonth(), mon);
		select(li.getCardyrs(), yr);
		fill(li.getCvv(), cvv);
		clk(li.getBook());
	}

	@DataProvider(name = "data")
	private Object[][] details() {
		return new Object[][] { { "Richardg123", "Geetha!789", "Sydney", "Hotel Creek", "Standard", "1", "2", "3",
				"abdul", "kalam", "chennai", "1234123412341234", "MAST", "1", "2019", "1234" }

		};
	}

}
