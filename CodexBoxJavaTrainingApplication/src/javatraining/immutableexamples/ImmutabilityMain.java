package javatraining.immutableexamples;

public class ImmutabilityMain {
    public static void main(String[] args) {
        Immutability imu = new Immutability(20221,"Abhilash","8096796765",55000.00f);
        System.out.println(imu.getStudent_Rollnumber());
        System.out.println(imu.getName());
       Long value = Long.parseLong(imu.getMobileNumber());
        System.out.println(value);
        System.out.println(imu.getFee());

    }
}
