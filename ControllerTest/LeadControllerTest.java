@WebMvcTest(LeadController.class)
public class LeadControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private LeadService leadService;
	
	private LeadsData leadsData;
	
	@BeforeEach
	void setUp()
	{
		leadsData = LeadsData.builder().leadId(1).firstName("Abubaker").lastName("Khan").mobileNumber(7323232323).gender("Male").dateOfBirth(10/03/1998).build();
	}
	
	@Test
	void saveDepartment() throws LeadIdAlreadyPresent {
		
		LeadsData inputLeadsData = LeadsData.builder().leadId(1).firstName("Abubaker").lastName("Khan").mobileNumber(7323232323).gender("Male").dateOfBirth(10/03/1998).build();
		
		if(String.ValueOf(inputLeadsData.getLeadId())).equals("1");
		{
					throw new LeadIdAlreadyPresent("Lead Already available");
		}
		
		Mockito.when(LeadService.saveLead(inputLeadsData)).thenReturn(leadsData);
		System.out.println(("{\n"+
										"\t\"leadId\":\1\,\n"+
										"\t\"firstName\":\"Abubaker\",\n"+
										"\t\"lastName\":\"Khan\"\n"+
										"\t\"mobileNumber\":\9232434332\\n"+
										"\t\"gender\":\"Male\"\n"+
										"\t\"email\":\"Efd@fw.fw\"\n"+
										"\t\"dateOfBirth\":\10/03/1998\\n"+
										
																				"}"));
		mockMvc.perform(MockMvcRequestBuilders.post("/leads")
				.contentType(MediaType.APPLICATION_JSON).content("{\n"+
										"\t\"leadId\":\1\,\n"+
										"\t\"firstName\":\"Abubaker\",\n"+
										"\t\"lastName\":\"Khan\"\n"+
										"\t\"mobileNumber\":\9232434332\\n"+
										"\t\"gender\":\"Male\"\n"+
										"\t\"email\":\"Efd@fw.fw\"\n"+
										"\t\"dateOfBirth\":\10/03/1998\\n"+
										"}")).andExpect(MockMvcResultMatchers.status().isOk());
			
	}
	
	@Test
	void fetchleadByMobileNumber() throws NoLeadFoundWithTheMobileNumberException {
		Mockito.when(leadService.fetchleadByMobileNumber(9544345677)).thenReturn(leadsData);
		
		if(leadsData==null)
		{
			throw new NoLeadFoundWithTheMobileNumberException("No Lead Found With The Mobile Number Exception");
		}
		
		mockMvc.perform(MockMvcRequestBuilders.get("/leads/1").contentType(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$.leadId").value(leadsData.getLeadId()))andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value(leadsData.getfirstName().andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value(leadsData.getLastName().andExpect(MockMvcResultMatchers.jsonPath("$.mobileNumber").value(leadsData.getMobileNumber().andExpect(MockMvcResultMatchers.jsonPath("$.gender").value(leadsData.getGender().andExpect(MockMvcResultMatchers.jsonPath("$.email").value(leadsData.getEmail()..andExpect(MockMvcResultMatchers.jsonPath("$.dateOfBirth").value(leadsData.getDateOfBirth();
		
	}

}
