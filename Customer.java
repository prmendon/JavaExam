/**
 * @author Prajna Mendon
 *
 *         Modified Date : Jul 10, 2019
 */
public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 */
	public Customer(int customerId, String firstName, String lastName) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "\n customerId=" + customerId +",\n"
				 + "firstName=" + firstName + ",\n"
			     + "lastName=" + lastName;
	}

}