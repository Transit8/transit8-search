package org.brightblock.mam.services.blockstack.models;

import java.util.List;

import org.brightblock.mam.rest.models.IApiModel;


public class ZonefilesModel implements IApiModel {

	private static final long serialVersionUID = -8568898162154521233L;
	private List<String> nameModels;

	public ZonefilesModel() {
		super();
	}

	public List<String> getNameModels() {
		return nameModels;
	}

	public void setNameModels(List<String> nameModels) {
		this.nameModels = nameModels;
	}
}
