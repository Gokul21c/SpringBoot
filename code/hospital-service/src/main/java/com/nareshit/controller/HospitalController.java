package com.nareshit.controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.bean.HospitalBean;
import com.nareshit.domain.Hospital;
import com.nareshit.repository.IHospitalRepository;
import com.nareshit.service.HospitalService;
import com.nareshit.utility.HospitalMapper;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	private IHospitalRepository hospRepo;
	
	@Autowired
	private HospitalService hospService;
	
	@GetMapping(value="/searchAllHosp")
	public List<HospitalBean> searchAllHosp(HttpServletRequest req,Model model) {
		System.out.println("am in search all hsopiatls");
		
		
		String searchVal = req.getParameter("searchValue");
		String searchOption = req.getParameter("searchOption");
		System.out.println("search val is:\t"+searchVal);
		System.out.println("search option is:\t"+searchOption);
		
		if(searchOption != null && !searchOption.isEmpty()) {
			if(searchOption.equals("Name")) {
				List<Hospital> hospDomainList = hospRepo.findHospitalByName(searchVal.toLowerCase());
				List<HospitalBean> hospBeanList = HospitalMapper.mapDomainListToBean(hospDomainList.iterator());
				//model.addAttribute("hospList", hospBeanList);
				return hospBeanList;
			}
		}else {
			//model.addAttribute("errorMessage", "Search is not supplied.");
		}
		
		return null;
				
		
	}
	
	/*@PostMapping(value="/addHospital")
	public String addHospotal(@ModelAttribute("hospBean") HospitalBean hospBean) {
		System.out.println("add hospital ");
		System.out.println("hospal data is:\t"+hospBean.getStatus());
		Hospital hosp = HospitalMapper.mapBeanToDomain(hospBean);
		hosp = hospRepo.save(hosp);
		hospBean = HospitalMapper.mapDomainToBean(hosp);
		//return "addHospital";
		return "redirect:./getAllHospitals";
		
	}*/
	
	@PostMapping(value="/addHospital")
	public HospitalBean addHospotal(@RequestBody HospitalBean hospBean) {
		System.out.println("add hospital ");
		System.out.println("hospal data is:\t"+hospBean.getStatus());
		hospBean =  hospService.saveHospital(hospBean);
		return hospBean;
		
	}
	
	@GetMapping(value="/getAllHospitals")
	public List<HospitalBean>  findHospotal(Model  model) {
		Iterator<Hospital> hospDomainsList = hospRepo.findAll().iterator();
		List<HospitalBean> hospBeanList = HospitalMapper.mapDomainListToBean(hospDomainsList);
		//model.addAttribute("hospList", hospBeanList);
		
		return hospBeanList;
	}
	
	@GetMapping(value="/getHosp/{id}")
	public HospitalBean  getHospotalById(@PathVariable("id") int id) {
		//hospRepo.delete(id);
		Hospital hospDomain = hospRepo.findOne(id);
		HospitalBean hospBeanList = HospitalMapper.mapDomainToBean(hospDomain);
		return hospBeanList;
	}
	
	@GetMapping(value="/deleteHosp/{id}")
	public String  delteHospotal(Model  model,@PathVariable("id") int id) {
		hospRepo.delete(id);
		Iterator<Hospital> hospDomainsList = hospRepo.findAll().iterator();
		List<HospitalBean> hospBeanList = HospitalMapper.mapDomainListToBean(hospDomainsList);
		model.addAttribute("hospList", hospBeanList);
		return "hospList";
	}
	
	@GetMapping(value="/editHosp/{id}")
	public String  editHospotal(Model  model,@PathVariable("id") int id) {
		Hospital hosp = hospRepo.findOne(id);
		HospitalBean hospBean = HospitalMapper.mapDomainToBean(hosp);
		model.addAttribute("hospBean", hospBean);
		return "editHospital";
	}
	
	@PostMapping(value="/updateHospital")
	public String updateHospotal(@ModelAttribute("hospBean") HospitalBean hospBean) {
		System.out.println("add hospital ");
		System.out.println(hospBean.getHospId());
		System.out.println(hospBean.getEmail());
		Hospital hosp = HospitalMapper.mapBeanToDomain(hospBean);
		hosp = hospRepo.save(hosp);
		hospBean = HospitalMapper.mapDomainToBean(hosp);
		//return "addHospital";
		return "redirect:./getAllHospitals";
		
	}
}
