package de.hybris.trainingAshwini.core.cutsomJobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import de.hybris.trainingAshwini.core.customServices.customServiceImpl.DefaultManufacturerDetailsService;
import de.hybris.trainingAshwini.core.model.ManufacturerCronJobModel;
import org.apache.log4j.Logger;

public class MsgCronJob extends AbstractJobPerformable<ManufacturerCronJobModel> {
    private static final Logger log=Logger.getLogger(MsgCronJob.class);
    @Override
    public PerformResult perform(ManufacturerCronJobModel manufacturerCronJobModel) {

        log.info("**********************************");
        log.info("Greeting from MyJobPerformable!!!");
        log.info("**********************************");

        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}

