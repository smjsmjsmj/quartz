package com.mj.quarzt.dao;

import java.util.List;

import com.mj.quarzt.model.QRTZJob;

public interface QRTZJobMapper {
   
	int insert(QRTZJob record);

    QRTZJob selectByPrimaryKey(Long id);

    int updateByPrimaryKey(QRTZJob record);
    
    List<QRTZJob> selectJobs();
    
}