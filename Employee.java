
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if(this.salary<1000){
            return 0;
        }
        return (this.salary*0.03);


    }
    double bonus(){
        if(this.workHours>40){
            double bonusCalculate = (this.workHours - 40)*30;
            return bonusCalculate;
        }
        return 0;
    }
    int raiseSalary(){
        int year = 2021;
        if(year - hireYear<10){
            return (int) (this.salary*5)/100;
        }
        if(year - hireYear>9 && year-hireYear < 20){
            return (int) (this.salary*10)/100;
        }
        if(year - hireYear>19){
            return (int) (this.salary*15)/100;
        }
        return 0;
    }

    void printInfo(){
        System.out.println("***************************************");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Bonus: " + bonus());
        double newSalary =  (this.salary - tax() + bonus());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş: " + newSalary);
        double totalSalary = newSalary + raiseSalary();
        System.out.println("Toplam Maaş: " + totalSalary);
        System.out.println("***************************************");
    }
}
