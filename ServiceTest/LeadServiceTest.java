@SpringBootTest
public class LeadServiceTest {

	@MockBean
	private LeadsRepository leadsRepository; 
	@Autowired
	private LeadService leadService;
	
	@BeforeEach
	void setup()
	{
		LeadsData leadsData = LeadsData.builder().leadId(1).firstName("Abubaker").lastName("Khan").mobileNumber(7323232323).gender("Male").dateOfBirth(10/03/1998).build();
		
		Mockito.when(leadsRepository.findByMobileNumber(6432345432)).thenReturn(leadsData);
	}
	
	@Test
	@DisplayName("Get Data based on valid Mobile number")
	public void whenValidMobileNumber_thenLeadShouldFound()  throws NoLeadFoundWithTheMobileNumberException
	{
		String mobileNumber = 7543334561;
		LeadsData found = leadService.findByMobileNumber(mobileNumber);

if(found==null)

{
throw new NoLeadFoundWithTheMobileNumberException("No Lead Found With The Mobile Number Exception");
}
else
{
		
		assertEquals(mobileNumber, found.getMobileNumber());
}		
	}
	
	

}
