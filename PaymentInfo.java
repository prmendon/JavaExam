/**
 * 
 */

/**
 * @author Prajna Mendon
 *
 * Modified Date : Jul 11, 2019
 */
public class PaymentInfo {
	
	private String paymentType;
	private int creditCardNumber;
	private int cvv;
	private String cardholderFirstName;
	private String cardholderLastName;
	/**
	 * 
	 */
	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param paymentType
	 * @param creditCardNumber
	 * @param cvv
	 * @param cardholderFirstName
	 * @param cardholderLastName
	 */
	public PaymentInfo(String paymentType, int creditCardNumber, int cvv, String cardholderFirstName,
			String cardholderLastName) {
		super();
		this.paymentType = paymentType;
		this.creditCardNumber = creditCardNumber;
		this.cvv = cvv;
		this.cardholderFirstName = cardholderFirstName;
		this.cardholderLastName = cardholderLastName;
	}
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the creditCardNumber
	 */
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	/**
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the cardholderFirstName
	 */
	public String getCardholderFirstName() {
		return cardholderFirstName;
	}
	/**
	 * @param cardholderFirstName the cardholderFirstName to set
	 */
	public void setCardholderFirstName(String cardholderFirstName) {
		this.cardholderFirstName = cardholderFirstName;
	}
	/**
	 * @return the cardholderLastName
	 */
	public String getCardholderLastName() {
		return cardholderLastName;
	}
	/**
	 * @param cardholderLastName the cardholderLastName to set
	 */
	public void setCardholderLastName(String cardholderLastName) {
		this.cardholderLastName = cardholderLastName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return  "\n\t paymentType=" + paymentType + ",\n"
				+"\t" +" creditCardNumber=" + creditCardNumber + ",\n"
				+"\t"+ " cvv=" + cvv+ ",\n"
				+"\t"+ " cardholderFirstName=" + cardholderFirstName + ",\n"
				+"\t"+ " cardholderLastName=" + cardholderLastName;
	}
	
	

}
