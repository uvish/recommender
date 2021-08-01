package com.uvish.recommender.dto;

public class Customer {
    String customer_name;

    public Customer(String customer_name) {
        this.customer_name = customer_name;
    }

    public Customer() {
    }

    public String getCustomer_name() {
        return this.customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Customer)) return false;
        final Customer other = (Customer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$customer_name = this.getCustomer_name();
        final Object other$customer_name = other.getCustomer_name();
        if (this$customer_name == null ? other$customer_name != null : !this$customer_name.equals(other$customer_name))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Customer;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $customer_name = this.getCustomer_name();
        result = result * PRIME + ($customer_name == null ? 43 : $customer_name.hashCode());
        return result;
    }

    public String toString() {
        return "Customer(customer_name=" + this.getCustomer_name() + ")";
    }
}
