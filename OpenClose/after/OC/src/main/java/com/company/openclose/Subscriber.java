package com.company.openclose;

public abstract class Subscriber {

    // This should be the base class for PhoneSubscriber and ISPSubscriber
    // class Subscriber is closed for modification
    protected Long subscriberId;

    protected String address;

    protected Long phoneNumber;

    protected int baseRate;

    /**
     * @return the subscriberId
     */
    public Long getSubscriberId() {
        return subscriberId;
    }

    /**
     * @param subscriberId the subscriberId to set
     */
    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    /**
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return the phoneNumber
     */
    public Long getPhoneNumber(Long phoneNumber) {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

    // -------------------- open for extension --------------------
    // CREATE AN ABSTRACT FUNCTION FOR CHILD CLASS TO USE TO HAVE MANY PURPOSED IMPLEMENTATION
    public abstract double calculateBill();
}