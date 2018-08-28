package com.pugb.pugb.controllers.request;

import java.util.ArrayList;
import java.util.List;


public class SeasonRequest {
	// private String links meta;
	private InfoSeasonRequest[] data;

	public InfoSeasonRequest[] getData() {
		return data;
	}

	public void setData(InfoSeasonRequest[] data) {
		this.data = data;
	}

	public List<InfoSeasonRequest> getListData() {
		List<InfoSeasonRequest> InfoSeasonRequests = new ArrayList<>();
		for (int i = 0; i < data.length; i++) {
			InfoSeasonRequest infoSeasonRequest = new InfoSeasonRequest();
			infoSeasonRequest.setId(data[i].getId());
			infoSeasonRequest.setType(data[i].getType());
			InfoSeasonRequest.InfoAttributesSeason attributes = infoSeasonRequest.new InfoAttributesSeason();
			attributes.setIsCurrentSeason(data[i].getIsCurrentSeason());
			attributes.setIsOffseason(data[i].getIsOffseason());
			infoSeasonRequest.setAttributes(attributes);
			InfoSeasonRequests.add(infoSeasonRequest);
		}
		return InfoSeasonRequests;
	}

	public int getLengthData() {
		return data.length;
	}

}	

