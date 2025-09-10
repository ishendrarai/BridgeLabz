class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() { return name; }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.getName());
    }
}

class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }
}

public class HospitalDoctorsPatients {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Ravi");
        Doctor d2 = new Doctor("Meena");
        Patient p1 = new Patient("Sita");
        Patient p2 = new Patient("Rahul");
        d1.consult(p1);
        d2.consult(p2);
    }
}
