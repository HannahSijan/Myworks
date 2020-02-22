package com.merin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@Autowired
	CustomerRepo repo;
	
	@RequestMapping("/")
	public String view()
	{
		return "view";
		
	}
	
	@RequestMapping("/details")
	public String details(Customers customers)
	{
		repo.save(customers);
		return "view";
	}
	
	
	
	@RequestMapping("/find")
	public String find(Customers customers)
	{
		
		return "find";
	}

	
	@PostMapping("/finddetails")
	public ModelAndView getdetails(@RequestParam("cid")int cid)
	{
		ModelAndView mv =new ModelAndView("retrieve");
		Customers customers=repo.findById(cid).orElse(null);
		mv.addObject(customers);
		return mv;
	}
	
	@RequestMapping("/viewdetails/2")
	@ResponseBody
	public String viewdetails2()
	{
		
		return repo.findById(2).toString();
	}
	
	@RequestMapping("/viewdetails")
	@ResponseBody
	public Iterable<Customers> viewdetails()
	{
		
		return repo.findAll();
	}
	
	@RequestMapping("/viewdetails/{cid}")
	@ResponseBody
	public Optional<Customers> viewdetailsinpar(@PathVariable("cid")int cid)
	{
		
		return repo.findById(cid);
	}
	  
	/*
	 * @RequestMapping("/viewdetails") public String
	 * viewdetails(@RequestParam("cid") int cid,@RequestParam("cname") String
	 * cname,@RequestParam("cemail") String cemail,ModelMap modelMap) {
	 * modelMap.put("cid",cid); modelMap.put("cname",cname);
	 * modelMap.put("cemail",cemail);
	 * 
	 * 
	 * return "display"; }
	 */
}
