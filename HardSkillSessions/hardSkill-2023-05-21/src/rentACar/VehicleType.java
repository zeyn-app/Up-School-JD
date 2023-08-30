package rentACar;

import java.util.EnumSet;

public enum VehicleType {
	TRUCK(5, "Bu aracı kullanmak için minimum yaş 25' tir."), 
	VAN(4, "Bu aracı kullanmak için minimum yaş 20' dir."),
	CAR(2, "Bu aracı kullanmak için minimum yaş 18' dir.");

	private final int minLicenceYear;
	private final String errorMessage;

	private VehicleType(int minLicenceYear, String errorMessage) {
		this.minLicenceYear = minLicenceYear;
		this.errorMessage = errorMessage;
	}

	public int getMinLicenceYear() {
		return minLicenceYear;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	// car var mı diye bakmak için metod yazıyoruz.
	// direkt erişebilmek için statik kullandık
	public static VehicleType getVehicleType(String type) {
		var vehicleTypes = EnumSet.allOf(VehicleType.class); // stream api ile tek satırda yapılır.

		for (VehicleType vehicleType : vehicleTypes) {
			if (vehicleType.name().equalsIgnoreCase(type))
				return vehicleType;
		}
		return null;
	}

}
