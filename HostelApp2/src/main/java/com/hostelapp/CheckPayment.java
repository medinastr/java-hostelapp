package com.hostelapp;

public class CheckPayment extends PaymentType {
    private String bankId;
    private int branchId;
    private String bankName;

    public CheckPayment(String bankId, int branchId, String bankName) {
        super("Check payment");
        this.bankId = bankId;
        this.bankName = bankName;
        this.branchId = branchId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getDetails() {
        String temp = "Bank name: " + this.bankName +
                "\nBranch ID: " + this.branchId +
                "\nBank ID: " + this.bankId + "\n" +
                super.getDetails();
        return temp;
    }
}
