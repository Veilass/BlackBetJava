package Generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar sch1 = new Schoolar("Ivan",12);
        Schoolar sch2 = new Schoolar("Petr",14);

        Student st1 = new Student("Vasily",17);
        Student st2 = new Student("Kolya",19);

        Employee emp1 = new Employee("Oleg",24);
        Employee emp2 = new Employee("Dmitry",29);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(sch1);
        schoolarTeam.addNewParticipant(sch2);

        Team<Student> studentTeam = new Team<>("IT giants");
        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        Team<Employee> employeeTeam = new Team<>("Workers");
        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Sages");
        Schoolar sch3 = new Schoolar("Leonid",15);
        Schoolar sch4 = new Schoolar("Robert",16);

        schoolarTeam2.addNewParticipant(sch3);
        schoolarTeam2.addNewParticipant(sch4);
        schoolarTeam.playWith(schoolarTeam2);

    }
}
