package lk.icoder.action;

import lk.icoder.service.TutorialFinderService;

public class TutorialAction {

    private String theBestTutorialWebSite;
    private String language;

    public String getTutorial() {
//        TutorialFinderService tutorialFinderService = new TutorialFinderService();
//        setTheBestTutorialWebSite(tutorialFinderService.getTheBestTutorialWebSite(language));
//        setTheBestTutorialWebSite(getLanguage());
//        System.out.printf(getLanguage());
        System.out.println("getTutorial method called");
        setTheBestTutorialWebSite("getTutorial method called");
        return "success";
    }

    public String addTutorial() {
        System.out.println("addTutorial method called");
        setTheBestTutorialWebSite("addTutorial method called");
        return "success";
    }

    public String updateTutorial() {
        System.out.println("updateTutorial method called");
        setTheBestTutorialWebSite("updateTutorial method called");
        return "success";
    }

    public String someOtherMethod() {
        System.out.println("Some other method executed");
        return "success";
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTheBestTutorialWebSite() {
        return theBestTutorialWebSite;
    }

    public void setTheBestTutorialWebSite(String theBestTutorialWebSite) {
        this.theBestTutorialWebSite = theBestTutorialWebSite;
    }


}
