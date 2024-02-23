public class WeatherWebsiteTest {
    @Mock 
    private IStubWeatherForecaster mockForecaster;

    @InjectMocks 
    private WeatherWebsite website;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this); 

        // Define the behavior of the mock
        when(mockForecaster.predictWeather("Hawaii")).thenReturn(30);
        when(mockForecaster.predictWeather("Stockholm")).thenReturn(0);
        when(mockForecaster.predictWeather("Winnipeg")).thenReturn(-20);
    }

    @Test
    public void testDisplayTemperatureForHawaii() {
        // Call the method under test
        String displayedTemperature = website.displayTemperature("Hawaii");

        // Verify the results
        assertEquals("The current temperature in Hawaii is 30 degrees.", displayedTemperature);
    }
}