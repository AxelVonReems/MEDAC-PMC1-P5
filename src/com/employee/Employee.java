import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate birthday;
    private String originCountry;
    
    public Employee(String name, LocalDate birthday, String originCountry) {
        this.name = name;
        this.birthday = birthday;
        this.originCountry = originCountry;
        if (name.equals("") || name == null) {
            System.out.println("Employee name is required");
        }
        if (birthday == null) {
            System.out.println("Birthday is required");
        }
        if (originCountry.equals("")) {
            System.out.println("Country of origin is required");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void sameCountry(Employee e) {
        if (this.getOriginCountry().equals(originCountry)) {
            System.out.println(
                this.getName() + " and " + name + " are from the same country: " + this.getOriginCountry()
            );
        } else {
            System.out.println(
                this.getName() + " is from " + this.getOriginCountry() + " and " + name + "is from " + originCountry
            );
        }
    }

    public abstract void showInfo();




}
