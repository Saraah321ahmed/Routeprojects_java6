package SchoolManagmentSystem;

public class person {


    String firstname;
    String lastname;
    String job;
    String id;
    char gender;
    String phone_number;
    String email;


    public person(String firstname, String lastname, String job, String id, char gender,
                  String phone_number, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.job = job;
        this.id = id;
        this.gender = gender;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJob() {
        return job;
    }

    public String getId() {
        return id;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }


}
