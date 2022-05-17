package javatraining.immutableexamples;

public final class Immutability {
    private final Integer student_Rollnumber;
    private final String Name;
    private final String mobileNumber;
    private final Float fee;


    public Immutability(Integer student_rollnumber, String name, String mobileNumber, Float fee) {
        student_Rollnumber = student_rollnumber;
        Name = name;
        this.mobileNumber = mobileNumber;
        this.fee = fee;
    }

    public Integer getStudent_Rollnumber() {
        return student_Rollnumber;
    }

    public String getName() {
        return Name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public Float getFee() {
        return fee;
    }
}
