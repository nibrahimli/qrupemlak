package com.qrupemlak.backoffice.data;

import java.util.List;

import com.nibrahimli.database.qrupEmlak.entity.Announcement.Currency;
import com.nibrahimli.database.qrupEmlak.entity.Announcement.HomeType;

public class SearchInfo {
	
	private List<Long> cities ;
	private List<HomeType> homeTypes;
	private Currency currency;
	private Integer maxPrice ;
	private Integer minPrice ;
	
	public List<Long> getCities() {
		return cities;
	}
	public void setCities(List<Long> cities) {
		this.cities = cities;
	}	
	public List<HomeType> getHomeTypes() {
		return homeTypes;
	}
	public void setHomeTypes(List<HomeType> homeTypes) {
		this.homeTypes = homeTypes;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Integer getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Integer minPrice) {
		this.minPrice = minPrice;
	}
	public Integer getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Integer maxPrice) {
		this.maxPrice = maxPrice;
	}
}
