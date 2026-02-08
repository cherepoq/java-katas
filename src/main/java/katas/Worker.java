package katas;

public class Worker {
    String name = "";
    String Job = "";
    int Zp;

    Worker(String name, String Job, int Zp) {
        this.name = name;
        this.Job = Job;
        this.Zp = Zp;

    }

    public String getInfo(int mounths) {
       int total = Zp * mounths;

        return "Имя: " + name + ", должность: " + Job + ", зарплата/мес: " + Zp + ", всего получил: " + total;
    }

}
