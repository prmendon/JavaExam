import java.time.LocalDate;

/**
 * @author Prajna Mendon
 *
 *         Modified Date : Jul 10, 2019
 */
public class Orders {

	private int orderId;
	private Customer customer;
	private int itemsOrdered;
	private int unitPrice;
	private LocalDate orderedDate;
	private Address billingAddress;
	private Address shippingAddress;
	private PaymentInfo paymentinfo;

	/**
	 * 
	 */
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param orderId
	 * @param customer
	 * @param itemsOrdered
	 * @param orderedDate
	 * @param totalPrice
	 * @param billingAddress
	 * @param shippingAddress
	 * @param paymentinfo
	 */
	public Orders(int orderId, Customer customer, int itemsOrdered,int unitPrice, LocalDate orderedDate, 
			Address billingAddress, Address shippingAddress, PaymentInfo paymentinfo) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.itemsOrdered = itemsOrdered;
		this.unitPrice = unitPrice;
		this.orderedDate = orderedDate;
		this.billingAddress = billingAddress;
		this.shippingAddress = shippingAddress;
		this.paymentinfo = paymentinfo;
	}

	
	/**
	 * @return the unitPrice
	 */
	public int getUnitPrice() {
		return unitPrice;
	}

	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	/**
	 * @return the orderId
	 */
	public Integer getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the itemsOrdered
	 */
	public int getItemsOrdered() {
		return itemsOrdered;
	}

	/**
	 * @param itemsOrdered the itemsOrdered to set
	 */
	public void setItemsOrdered(int itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}

	/**
	 * @return the orderedDate
	 */
	public LocalDate getOrderedDate() {
		return orderedDate;
	}

	/**
	 * @param orderedDate the orderedDate to set
	 */
	public void setOrderedDate(LocalDate orderedDate) {
		this.orderedDate = orderedDate;
	}

	/**
	 * @return the totalPrice
	 */
/*public double getTotalPrice() {
		return itemsOrdered*unitPrice;
	}

	*//**
	 * @param totalPrice the totalPrice to set
	 *//*
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = itemsOrdered*unitPrice;
	}*/

	/**
	 * @return the billingAddress
	 */
	public Address getBillingAddress() {
		return billingAddress;
	}

	/**
	 * @param billingAddress the billingAddress to set
	 */
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	/**
	 * @return the shippingAddress
	 */
	public Address getShippingAddress() {
		return shippingAddress;
	}

	/**
	 * @param shippingAddress the shippingAddress to set
	 */
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	/**
	 * @return the paymentinfo
	 */
	public PaymentInfo getPaymentinfo() {
		return paymentinfo;
	}
	
	public double totalPrice()
	{
		double totalPrice = itemsOrdered*unitPrice;
		return totalPrice;
	}

	/**
	 * @param paymentinfo the paymentinfo to set
	 */
	public void setPaymentinfo(PaymentInfo paymentinfo) {
		this.paymentinfo = paymentinfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Orders :----- \n"
				+ "OrderId=" + orderId + ",\n"
			   + " Customer:-" + customer + ",\n"
			   + " ItemsOrdered=" + itemsOrdered + ",\n"
			   + " Unit Price=" + unitPrice + ",\n"
			   + " OrderedDate=" + orderedDate + ",\n"
			   + " TotalPrice=" + this.totalPrice() + ",\n"
			   + " BillingAddress:-" + billingAddress + ",\n"
			   + " ShippingAddress:-" + shippingAddress + ",\n"
			   + " Paymentinfo:-" + paymentinfo +"\n\n";
	}

}