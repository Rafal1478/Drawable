package person;


import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Language> language = new ArrayList<>();

    public Person(Language language)
    {
        this.language.add(language);
    }

    public void learn(Language language)
    {
        this.language.add(language);
    }

    public String sayHello()
    {
        String wszyscy[] = new String[language.size()];
        String słowo = "";

        for (int i = 0; i < language.size(); i++)
        {
            wszyscy[i] = language.get(i).hello();
            słowo += wszyscy[i] + " ";
        }
        return słowo;

    }
}