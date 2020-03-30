package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        
        switch (lang) {
            case "EN":
                return new I18nEnglishGreetingService();
        
            case "DE":
                return new I18nGermanGreetingService();
    
            case "ES":
                return new I18NSpanishGreetingService();
        
            default:
                return new I18NSpanishGreetingService();
        }

    }

}