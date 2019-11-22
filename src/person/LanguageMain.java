package person;

public class LanguageMain {
    public static void main(String[] args) {
        Language polish = new Polish();
        Language germany = new German();
        Language english = new English();
        Language russian = new Russian();

        Person linguist = new Person(polish);
        linguist.learn(germany);
        linguist.learn(english);
        linguist.learn(russian);

        Person littleLinguist = new Person(germany);
        littleLinguist.learn(english);

        Person russianPerson=new Person(russian);

        System.out.println(linguist.sayHello());
        System.out.println(littleLinguist.sayHello());
        System.out.println(russianPerson.sayHello());

    }
}
