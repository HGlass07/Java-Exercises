import java.util.ArrayList;
import java.util.List;


public class Building {
	
	private String address;
	private int floors;
	private double area; 
	
	
	public Building(String address, int floors, double area) {
		this.address = address;
		this.floors = floors;
		this.area = area;
	}
	
	public String getAddress() {
		return address;
	}
	public int getFloors() {
		return floors;
	}
	public double getArea() {
		return area;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
	public void buildingDetails() {
        System.out.println("Address: " + address);
        System.out.println("Floors: " + floors);
        System.out.println("Area: " + area);
    }
	
	public static class ResidentialBuilding extends Building {
		private int apartments;
		private static List<ResidentialBuilding> residendialBuildings = new ArrayList<>();
		
		public ResidentialBuilding(String address, int floors, double area, int apartments) {
            super(address, floors, area);
            this.apartments = apartments;
            residendialBuildings.add(this);
        }
		
		public double getApartments() {
			return apartments;
		}
		public void setApartments(int apartments) {
			this.apartments = apartments;
		}
		
		public void displayResidentialBuildings() {
            super.buildingDetails();
            System.out.println("Apartments: " + apartments);
        }
		
		public double calculateRent() {
            return getArea() > 3000 ? 4000 : 2500;
        }
        
        public void displayResidentialRent() {
            System.out.println("Rent for Residential Building: $" + calculateRent() + " per month");
        }
		
	}
	
	
	public static class CommercialBuilding extends Building {
		private double officeSpace;
		private static List<CommercialBuilding> commercialBuildings = new ArrayList<>();

		public CommercialBuilding(String address, int floors, double area, double officeSpace) {
            super(address, floors, area);
            this.officeSpace = officeSpace;
            commercialBuildings.add(this);
        }
		
		public double getOfficeSpace() {
			return officeSpace;
		}
		public void setOfficeSpace(double officeSpace) {
			this.officeSpace = officeSpace;
		}
		
		public void displayCommercialBuildings() {
            super.buildingDetails();
            System.out.println("Office space: " + officeSpace);
        }
		
		public double calculateRent() {
            return getArea() > 5000 ? 8000 : 4000;
        }
        
        public void displayCommercialRent() {
            System.out.println("Rent for Commercial Building: $" + calculateRent() + " per month");
        }
		
		
	}
	
	
	public static void main(String[] args) {
		ResidentialBuilding building1 = new ResidentialBuilding("56 Test Street", 3, 2000, 6);
		ResidentialBuilding building2 = new ResidentialBuilding("109 Another Street", 6, 5000, 10);
		building1.displayResidentialBuildings();
		CommercialBuilding building3 = new CommercialBuilding("101 Sample Ave", 6, 4000, 7000);
		building3.displayCommercialBuildings();
		CommercialBuilding building4 = new CommercialBuilding("3 Last Way", 3, 10000, 9000);
		building4.displayCommercialBuildings();
		
		building1.displayResidentialRent();
		building2.displayResidentialRent();
		building3.displayCommercialRent();
		building4.displayCommercialRent();

	}

}
