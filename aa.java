public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        if (this.salary<=0){
        }else {
           return this.salary*0.03;
        }
        return 0;
    }
    int bonus(){
        if (this.workHours>40){
            return (this.workHours-40)*30;
        }

        return 0;
    }
    double raiseSalary(){
        if (2021-this.hireYear<10){
            return this.salary*1.05;
        }else if (2021-this.hireYear>9 && 2021-this.hireYear<20 ){
            return this.salary*1.1;
        }else if (2021-this.hireYear>19){
            return this.salary*1.15;
        }
        return 0;
    }
    public void toStrings(){
        System.out.println("Ad�: " + this.name);
        System.out.println("Maa��: " + this.salary);
        System.out.println("�al��ma saati: " + this.workHours);
        System.out.println("Ba�lang�� y�l�: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maa� Art���: " + (this.raiseSalary()-this.salary));
        System.out.println("Vergi ve Bonuslar ile birlikte maa�: " + (this.salary-this.tax()+this.bonus()));
        System.out.println("Toplam maa�: " + this.raiseSalary());

    }

}