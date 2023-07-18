package ru.smal.gof_patterns.behavioral.observer.impl_two;

public class SearchSite {

    public static void main(String[] args) {
        VacancyObserved observed = new VacancyObserved();

        observed.addVacancy("One position Java developer");
        observed.addVacancy("Two position Java developer");

        Observer oneDeveloper = new JavaDeveloperObserver("Sergey Malyshev");
        Observer twoDeveloper = new JavaDeveloperObserver("James Gosling");

        observed.registerObserver(oneDeveloper);
        observed.registerObserver(twoDeveloper);

        observed.addVacancy("Three position Java developer");

        observed.removeVacancy("One position Java developer");
        observed.removeVacancy("Two position Java developer");
    }
}
