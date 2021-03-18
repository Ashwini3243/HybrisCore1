/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingAshwini.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingAshwini.fulfilmentprocess.constants.TrainingAshwiniFulfilmentProcessConstants;

public class TrainingAshwiniFulfilmentProcessManager extends GeneratedTrainingAshwiniFulfilmentProcessManager
{
	public static final TrainingAshwiniFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingAshwiniFulfilmentProcessManager) em.getExtension(TrainingAshwiniFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
