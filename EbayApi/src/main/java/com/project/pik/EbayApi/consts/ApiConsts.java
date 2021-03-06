package com.project.pik.EbayApi.consts;

import com.ebay.soap.eBLBaseComponents.SiteCodeType;

public class ApiConsts {
	private ApiConsts() {
	}
	
	public static final int TIME_INTERVAL_SEC = 30;
	public static final int INITIAL_DELAY_SEC = 5; 
	public static final String PROPERTIES_FILE_NAME = "/ebay.properties";
	public static final String MAIL_PROPERTIES_FILE_NAME = "/email.properties";
	public static final String SEARCHING_CURRENCY = "EUR";
	public static final SiteCodeType SITE_CODING = SiteCodeType.US;
	
	/** Path variables in REST EbayController*/
	public static final String MAX_PRICE_NAME = "maxPrice";
	public static final String MIN_PRICE_NAME = "minPrice";
	public static final String CATEGORY_ID_NAME = "categoryId";
	public static final String KEYWORD_NAME = "keyword";
	public static final String PAGE_NUMBER_NAME = "pageNumber";
}
