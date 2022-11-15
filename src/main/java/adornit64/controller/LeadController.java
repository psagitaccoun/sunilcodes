package adornit64.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import adornit64.entities.Lead;
import adornit64.service.LeadService;



@Controller
public class LeadController {
	
	@Autowired
	private LeadService ls;
	
  @RequestMapping("/")
  public String viewOneLead() {
	return "view_lead_page";
	  }
  
  @RequestMapping("/saveOneLead")
  public String saveOneLead(@ModelAttribute Lead lead,ModelMap model ) {
	  ls.saveOneLead(lead);
	  model.addAttribute("lead",lead);
	return "lead_info";
  }
  
  @RequestMapping("/list")
  public String listLead(ModelMap model) {
	  List<Lead> list = ls.listAll();
	  model.addAttribute("list", list);
	return "search_lead_result";
	  }
  
  @RequestMapping("/leadInfo")
  public String singleLeadInfo(@RequestParam("id") Long id,ModelMap model) {
	  Lead leadInfo = ls.leadInfo(id);
	  model.addAttribute("lead", leadInfo);
	return "lead_info";
	  
  }
  
}
