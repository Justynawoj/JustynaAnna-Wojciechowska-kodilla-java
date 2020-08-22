package com.kodilla.good.patterns.challenges.food2door;

public class DeliveryProvider {

    private String companyName;
    private long vatNumber;
    private long phoneNumber;
    private String emailAddress;
    private Product product;



    public DeliveryProvider(String companyName, long vatNumber, long phoneNumber, String emailAddress) {
        this.companyName = companyName;
        this.vatNumber = vatNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public long getVatNumber() {
        return vatNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public Product getProduct() {
        return product;
    }
}
