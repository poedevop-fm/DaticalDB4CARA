package com.datical.integration.nolio;

import com.nolio.platform.shared.api.ActionDescriptor;
import com.nolio.platform.shared.api.NolioAction;

@ActionDescriptor(
		name = "Datical DB Deploy", 
		description = "This action deploys changes in the ChangeLog file to the Target Database.", 
		category = "Datical.Deploy")

public class DaticalDBDeploy extends DaticalDBActionWithTarget implements NolioAction{

	private static final long serialVersionUID = 1L;

	public DaticalDBDeploy() {
		super();
		setDaticalDBAction("deploy");
	}
}