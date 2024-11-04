//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Саша",17,11);
        Teacher teacher = new Teacher("Максим Кириллович", 23,"Обществознания");
        Principal principal = new Principal("Игорь Владимирович", 55,30);

        Person[] people = {student,teacher,principal};

        for(Person person : people){
            School.callPersonToDuty(person);

            if (person instanceof Student){
                ((Student) person).study();
            }else if (person instanceof Teacher){
                ((Teacher)person).teach();
            }else if (person instanceof Principal){
                ((Principal)person).manager();
            }
            System.out.println();
        }

    }
}