import java.time.LocalDate;

public class Donation {
    private String donorName;
    private String bloodType;
    private int Amount;
    private LocalDate donoDate;

public Donation(String donorName, String bloodType, int Amount, LocalDate donoDate) {
    this.donorName = donorName;
    this.bloodType = bloodType;
    this.Amount = Amount;
    this.donoDate = donoDate;
    }

    public String getDonorName() {
        return donorName;
    }

    public String getBloodType() {
        return bloodType;
    }

    public int getAmount() {
        return Amount;
    }

    public LocalDate getDonoDate() {
        return donoDate;
    }

    public String allInfo() {
        return "Blood Donated{" +
                "DonorName: " + getDonorName() + '\'' +
                ", bloodType: " + getBloodType() + '\'' +
                ", Amount: " + getAmount() + '\'' +
                ", DonationDate: " + getDonoDate() +
                '}';
    }
}
