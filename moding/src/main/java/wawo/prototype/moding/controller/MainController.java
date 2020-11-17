package wawo.prototype.moding.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import wawo.prototype.moding.dao.MainDAO;
import wawo.prototype.moding.dto.MainDTO;

@RestController
@MapperScan(basePackages="wawo.prototype.moding.dao")//탐색할 패키시 설정
public class MainController {
	@Autowired
	private MainDAO mainDAO;//MainDAO bean을 자동으로 주입
	
    // 메인페이지 출력
	@RequestMapping("/main")
	public List<MainDTO> main(@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String으로 county를 받도록 설정
		final MainDTO param = new MainDTO(0, null, country);//전달 받은 country를 받은 MainDTO 객체 생성 이 객체는 MyBatis에 파라미터로 전달
		final List<MainDTO> userList = mainDAO.selectUsers(param);// 22번 째 줄에서 생성한 객체를 파라미터로 전달하여 DB로부터 사용자 목록을 불러온다.
		return userList;
	}
	
	
//	@RequestMapping(value="/index")
//    public String index() {
//        
//        return "index";
//    }
//	
//	
//    //welcome page 설정하는 부분	
//	@RequestMapping("/")
//	public ModelAndView ScheduleManagementRoot(Model model) throws Exception{
//	ModelAndView mav = new ModelAndView("redirect:/index");
//
//	return mav;
//	}
	
}