package Homework33;

/**
 * Created by user on 15.02.2017.
 */
public class SpecialSudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SpecialSudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialSudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialSudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }
}
