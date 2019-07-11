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
	private int creditcardNumber;
	private int cvv;
	/**
	 * 
	 */
	public PaymentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param paymentType
	 * @param creditcardNumber
	 * @param cvv
	 */
	public PaymentInfo(String paymentType, int creditcardNumber, int cvv) {
		super();
		this.paymentType = paymentType;
		this.creditcardNumber = creditcardNumber;
		this.cvv = cvv;
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
	 * @return the creditcardNumber
	 */
	public long getCreditcardNumber() {
		return creditcardNumber;
	}
	/**
	 * @param creditcardNumber the creditcardNumber to set
	 */
	public void setCreditcardNumber(int creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentInfo [paymentType=" + paymentType + ", creditcardNumber=" + creditcardNumber + ", cvv=" + cvv
				+ "]";
	}
	
	

}
