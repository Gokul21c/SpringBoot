package com.nareshit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.bean.HospitalBean;
import com.nareshit.dao.HospitalDao;
import com.nareshit.domain.Hospital;
import com.nareshit.utility.HospitalMapper;

@Service
public class HospitalServiceImpl implements HospitalService {

	@Autowired
	private HospitalDao hospDao;
	
	@Override
	public HospitalBean saveHospital(HospitalBean hosp) {
		Hospital hospDomain = HospitalMapper.mapBeanToDomain(hosp);
		Hospital hospDoamin = hospDao.addHospital(hospDomain);
		return HospitalMapper.mapDomainToBean(hospDoamin);
	}

}
