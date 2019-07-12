/**
 * @author Prajna Mendon
 *
 *         Modified Date : Jul 11, 2019
 */
public class Address {

	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private int zipcode;

	/**
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param state
	 * @param zipcode
	 */
	public Address(String addressLine1, String addressLine2, String city, String state, int zipcode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	/**
	 * 
	 */
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipcode
	 */
	public Integer getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "\n addressLine1 : " + addressLine1 +  ", addressLine2 : " + addressLine2 + ",\n"
					+"\t\t"+ "city=" + city + ",\n"
					+ "\t\t"+"state=" + state + ",\n"
					+ "\t\t"+"zipcode=" + zipcode;
	}

}
