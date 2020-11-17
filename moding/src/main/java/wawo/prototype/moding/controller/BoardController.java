package wawo.prototype.moding.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	
	
	@RequestMapping(value="/index")
    public String index() {
        
        return "index";
    }
	
    //welcome page 설정하는 부분	
	@RequestMapping("/")
	public ModelAndView ScheduleManagementRoot(Model model) throws Exception{
	ModelAndView mav = new ModelAndView("redirect:/index");

	return mav;
	}
	
}