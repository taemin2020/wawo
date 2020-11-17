package wawo.prototype.moding.dao;

import wawo.prototype.moding.dto.MainDTO;

import java.util.List;

public interface MainDAO {
	List<MainDTO> selectUsers(MainDTO param) throws Exception;
}
