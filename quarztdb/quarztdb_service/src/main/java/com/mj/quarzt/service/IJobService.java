package com.mj.quarzt.service;

import java.util.List;

import com.mj.quarzt.model.QRTZJob;

public interface IJobService {

	int insert(QRTZJob record);

    QRTZJob selectByPrimaryKey(Long id);

    int updateByPrimaryKey(QRTZJob record);
    
    List<QRTZJob> selectJobs();
	
}
