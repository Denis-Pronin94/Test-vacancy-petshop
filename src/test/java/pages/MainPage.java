package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    // locators
    private SelenideElement

            textHeading = $(".timeline__title"),
            textSearch = $(".page-header__logo"),
            mainProjects = $(".main-nav").$(byText("Проекты")),
            mainContacts = $(".main-nav").$(byText("Контакты")),
            mainVacancy = $(".main-nav").$(byText("Вакансии")),
            mainDecisions = $(".main-nav").$(byText("Решения")),
            offlineClick = $(".projects__tabs-button--offline"),
            address = $(".contacts__address"),
            projectsOfflineName = $(".projects__item--gibdd"),
            resumeRutton = $(".vacancies__search-button"),
            checkText = $(".modal__title");

    // actions
    public void openMainPage() {
        open("https://tprs.ru");
        textSearch.shouldHave(text("Расчетные системы"));
    }

    public void TextHeadings(String text) {
        textHeading.shouldHave(text(text));
    }

    public void MainProjects() {
        mainProjects.click();
    }

    public void MainContacts() {
        mainContacts.click();
    }

    public void MainVacancy() {
        mainVacancy.click();
    }

    public void MainDecisions() {
        mainDecisions.click();
    }

    public void TextSearch(String text) {
        textSearch.shouldHave(text(text));
    }

    public void OfflineClick() {
        offlineClick.click();
    }

    public void ProjectsOfflineName(String text) {
        projectsOfflineName.shouldHave(text(text));
    }

    public void Address(String text) {
        address.shouldHave(text(text));
    }

    public void ResumeRutton() {
        resumeRutton.click();
    }

    public void CheckText(String text) {
        checkText.shouldHave(text(text));
    }
}
