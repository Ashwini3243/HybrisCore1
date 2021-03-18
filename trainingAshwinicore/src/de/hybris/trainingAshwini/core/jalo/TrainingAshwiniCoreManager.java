/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.trainingAshwini.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.trainingAshwini.core.constants.TrainingAshwiniCoreConstants;
import de.hybris.trainingAshwini.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class TrainingAshwiniCoreManager extends GeneratedTrainingAshwiniCoreManager
{
	public static final TrainingAshwiniCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingAshwiniCoreManager) em.getExtension(TrainingAshwiniCoreConstants.EXTENSIONNAME);
	}
}
