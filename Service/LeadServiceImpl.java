public class LeadServiceImpl implements LeadService{

	@Autowired
	private LeadsRepository leadsRepository;
	
		@Override
	public Leadsdata saveLead(Leadsdata leadsdata) throws LeadIdAlreadyPresent{
		
		Optional<Leadsdata> leadsdata = leadsRepository.findById(leadId);
		
		
		if(leadsdata.isPresent())
		{
			throw new LeadIdAlreadyPresent("Lead Already available");
		}
		
		else
		{
		return leadsRepository.save(Leadsdata);
		}
	}
	
	@Override
	public Leadsdata fetchleadByMobileNumber(Long mobileNumber) throws NoLeadFoundWithTheMobileNumberException {
		
		if(leadsRepository.findByMobileNumber(mobileNumber)==null)
		{
			throw new NoLeadFoundWithTheMobileNumberException("No Lead Found With The Mobile Number Exception")
		}
		
		return leadsRepository.findByMobileNumber(mobileNumber);
		
		
	}
	
	}
	