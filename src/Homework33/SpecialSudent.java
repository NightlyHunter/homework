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

    public SpecialSudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
    }

    public SpecialSudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id, long secretKey) {
        super(lastName, coursesTaken, collegeName, rating, id);
        this.secretKey = secretKey;
    }
}
