package wawo.prototype.moding.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor // 자동으로 모든 먀갸변수를 받는 생성자를 생성
@Getter // Getter 생성
@Setter // Setter 생성
public class MainDTO {
	
	
	public MainDTO(int i, Object object, String country) {
		// TODO Auto-generated constructor stub
	}
	private int seq;
    private String name;
    private String ip;
}
