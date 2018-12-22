package com.mj.quarzt.service;

import com.mj.quarzt.model.QRTZJob;

public interface IQuartzService {
	void addJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName, Class cls,
			String cron, QRTZJob scheduleJob);

	boolean modifyJob(String oldjobName, String oldjobGroup, String oldtriggerName, String oldtriggerGroup,
			String jobName, String jobGroup, String triggerName, String triggerGroup, String cron,QRTZJob scheduleJob);

	boolean modifyJobCron(String triggerName, String triggerGroupName, String cronExpression) throws Exception;

	void removeJob(String jobName, String jobGroupName, String triggerName, String triggerGroupName);

	void startSchedule();

	void shutdownSchedule();

	void pauseJob(String jobName, String jobGroupName);

	void resumeJob(String jobName, String jobGroupName);
}
