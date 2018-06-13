package basic.common.service;

import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import basic.common.dao.CommonDAO;

@Service("commonService")
public class CommonServiceImp implements CommonService{
	Logger log = LoggerFactory.getLogger(this.getClass());
    @Resource(name="commonDAO")
    private CommonDAO commonDAO;
    
    
	@Override
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception {
		return commonDAO.selectFileInfo(map);
	}


}
