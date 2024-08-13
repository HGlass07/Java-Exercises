package gymMembership;

public class PremiumMembership extends GymMembership{
	private boolean personalTrainer;
    private boolean spaAccess;

    public PremiumMembership(String memberName, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    public boolean hasPersonalTrainer() {
        return personalTrainer;
    }

    public boolean hasSpaAccess() {
        return spaAccess;
    }

    @Override
    public double calcFees() {
        double baseFee = super.calcFees();
        double premiumRate = 50.0; 
        return baseFee + (premiumRate * getDuration());
    }

    @Override
    public boolean checkOffers() {
        if (getDuration() >= 6) {
            System.out.println("Special Offer: 10% off");
            return true;
        }
        return false;
    }

    @Override
    public void displayMembershipDetails() {
        super.displayMembershipDetails();
        System.out.println("Personal Trainer: " + (personalTrainer ? "Included" : "Not Included"));
        System.out.println("Spa Access: " + (spaAccess ? "Included" : "Not Included"));
    }

}
