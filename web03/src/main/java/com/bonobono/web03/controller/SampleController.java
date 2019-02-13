package com.bonobono.web03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bonobono.web03.service.SampleService;
import com.bonobono.web03.vo.Sample;

@Controller
public class SampleController {
	@Autowired  
	private SampleService sampleService;
	// 1.  입력폼
	@GetMapping("/addSample")  //get방식으로 화면을 보여줄때 @GetMapping 사용 
	public String addSample() {		
		
		return "addSample";  // forword방식으로 화면을 보여준다. view의 이름은 templeate폴더에 addSample.html	
	}
	
	// 2.  입력 액션
	//Post 방식으로 받는다.
	@PostMapping("/addSampleAction") 
	public String addSample(
			//String sampleName = request.get.Parameter(); 
			@RequestParam(value="sampleName")String sampleName) {
				//sampleService에 가서 addSample메서드 실행시 sampleName값을 가지고 호출
				sampleService.addSample(sampleName); 
		return "redirect:/sampleList";  //sampleList로 redirect해서 화면 보여준다.
	}
		
	// 3. 목록
	//Get방식으로 sampleList화면을 보여준다.
	@GetMapping("/sampleList")  
	public String sampleList(Model model) {  
		List<Sample> list = sampleService.getSampleList();
		model.addAttribute("list", list);  //request.setAttribute 
		return "sampleList";  //getSampleList메서드의 리턴값을 forword 한다 
	}
	
	// 4. 삭제 액션
	@GetMapping("/removeSample")
	public String removeSample(
			//삭제할 parameter값을 매개변수로 받아서 확인한다.
			@RequestParam(value="")int sampleId) {
				sampleService.removeSample(sampleId);
		return "redirect:/sampleList";  //삭제 후 redirect해서 sampleList 화면을 보여준다.
	}
	
	// 5. 수정 폼

	// 6. 수정 액셕
	
}
