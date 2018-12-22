package com.mj.quarzt.controller;

import org.apache.xmlbeans.impl.xb.xsdschema.impl.PublicImpl;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mj.quarzt.model.QRTZJob;
import com.mj.quarzt.service.IJobService;

@Controller
@RequestMapping("/")
public class HomeController {

	   @Autowired
	    @SuppressWarnings("all")
	    private Scheduler quartzScheduler;
	
	@Autowired
	private IJobService jobService;
	

	@RequestMapping("")
	@Transactional
	public String index() throws SchedulerException {
//		List<JobExecutionContext> c=quartzScheduler.getCurrentlyExecutingJobs();
//		boolean flag=quartzScheduler.checkExists(JobKey.jobKey("mj_job_4","mj"));
		quartzScheduler.resumeJob(JobKey.jobKey("mj_job_3", "mj"));
//		QRTZJob scheduleJob = new QRTZJob();
//		scheduleJob.setClassPath("com.mj.quarzt.common.JobDemo_mj");
//		scheduleJob.setMethodName("runJob");
//		scheduleJob.setJobName("mj_job_simple");
//		scheduleJob.setJobGroup("mj");
//		scheduleJob.setCronExpression("0/5 * * * * ?");
//		scheduleJob.setJobStatus(1);
//		// 获取调度器
//		Scheduler sched = quartzScheduler;
//		// 创建一项作业
//		JobDetail job = JobBuilder.newJob(QuartzJobFactory.class)
//				.withIdentity(scheduleJob.getJobName(), scheduleJob.getJobGroup()).build();
//		job.getJobDataMap().put("scheduleJob", scheduleJob);
//		// 创建一个触发器
////		CronTrigger trigger = TriggerBuilder.newTrigger()
////				.withIdentity(scheduleJob.getJobName(), scheduleJob.getJobGroup())
////				.withSchedule(CronScheduleBuilder.cronSchedule(scheduleJob.getCronExpression()))
////				.build();
//		
//		SimpleTrigger trigger =(SimpleTrigger) TriggerBuilder.newTrigger().withIdentity("simpletri","mj")
//				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(10).withRepeatCount(10))
//				.build();
//		// 告诉调度器使用该触发器来安排作业
//		sched.scheduleJob(job, trigger);
//		// 启动
//		if (!sched.isShutdown()) {
//			sched.start();
//		}

		return "home/index";
	}

	@RequestMapping("/add")
	public String add(){
		return "home/add";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public String save(QRTZJob job){
		int res=jobService.insert(job);
		
		return "success";
	}
	
	
	
	
	
}
