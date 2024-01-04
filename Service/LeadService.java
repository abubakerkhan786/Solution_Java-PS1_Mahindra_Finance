

import java.util.List;

import com.dailycodebuffer.springboottutorial.entity.LeadsData;
import com.dailycodebuffer.springboottutorial.error.LeadIdAlreadyPresent;

public interface LeadService {

	public LeadsData saveLead(LeadsData leadsData)throws LeadIdAlreadyPresent;
	
	public LeadsData fetchleadByMobileNumber(Long mobileNumber) throws NoLeadFoundWithTheMobileNumberException 

}
