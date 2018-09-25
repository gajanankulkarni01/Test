package com.gaja;

import java.util.ArrayList;
import java.util.List;
import javax.jws.*;
import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(name="ntr")
public class TestMart {

	@WebMethod
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
				
	}

}
