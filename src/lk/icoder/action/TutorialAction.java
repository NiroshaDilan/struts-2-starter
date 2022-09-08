package lk.icoder.action;

import lk.icoder.service.TutorialFinderService;

public class TutorialAction {

    private String theBestTutorialWebSite;
    private String language;

    public String execute() {
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setTheBestTutorialWebSite(tutorialFinderService.getTheBestTutorialWebSite(language));
//        setTheBestTutorialWebSite(getLanguage());
//        System.out.printf(getLanguage());
//        System.out.println(getLanguage());
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
