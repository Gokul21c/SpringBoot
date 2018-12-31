package com.nareshit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.bean.DoctorBean;
import com.nareshit.service.DoctorService;

@RestController
//@Controller
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
		@PostMapping(value="/addDoctor")
	public DoctorBean addHospotal(@RequestBody DoctorBean doctBean) {
		System.out.println("add hospital ");
		System.out.println("hospal data is:\t"+doctBean.getStatus());
		//Doctor doct = DoctorMapper.mapBeanToDomain(doctBean);
		//hosp = hospRepo.save(hosp);
		
		
		
		doctBean =  doctorService.saveDoctor(doctBean);
		return doctBean;
		
	}
	
	
	
	
}
