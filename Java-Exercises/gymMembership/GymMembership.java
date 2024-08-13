package gymMembership;

public class GymMembership {
	private String memberName;
	private String membershipType;
	private int duration;
	
	public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public int getDuration() {
        return duration;
    }
    
    
    public boolean checkOffers() {
    	if (membershipType.equalsIgnoreCase("Basic") && duration >= 6) {
            System.out.println("Special Offer: 5% discount");
            return true;
        }
        return false;
    }
    
    public double calcFees() {
    	double monthlyRate = 25.0;
    	return monthlyRate * duration;
    }
    
    public void displayMembershipDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fee: $" + calcFees());
        checkOffers();
    }
	

	public static void main(String[] args) {
        GymMembership basicMember1 = new GymMembership("Pete Sim", "Basic", 5);
        basicMember1.displayMembershipDetails();
        System.out.println();
        
        GymMembership basicMember2 = new GymMembership("Simon Grey", "Basic", 9);
        basicMember2.displayMembershipDetails();
        System.out.println();

        PremiumMembership premiumMember1 = new PremiumMembership("Mary Fields", 8, true, true);
        premiumMember1.displayMembershipDetails();
    }

}

