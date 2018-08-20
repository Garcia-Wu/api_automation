package org.gt.projects.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerOverviewResponse {

    /**
     * code : 0
     * message : success
     * data : {"customer":{"id":"6","name":"WwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwWwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww","amount":1.356000101E7,"currency":"USD","bookingCenter":"UK accounts","updateDate":"24 May 2018"},"ytd":{"amount":389503920120,"currency":"GBP"}}
     */

    private String code;
    private String message;
    private DataBean data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * customer : {"id":"6","name":"WwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwWwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww","amount":1.356000101E7,"currency":"USD","bookingCenter":"UK accounts","updateDate":"24 May 2018"}
         * ytd : {"amount":389503920120,"currency":"GBP"}
         */

        private CustomerBean customer;
        private YtdBean ytd;

        public CustomerBean getCustomer() {
            return customer;
        }

        public void setCustomer(CustomerBean customer) {
            this.customer = customer;
        }

        public YtdBean getYtd() {
            return ytd;
        }

        public void setYtd(YtdBean ytd) {
            this.ytd = ytd;
        }

        public static class CustomerBean {
            /**
             * id : 6
             * name : WwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwWwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
             * amount : 1.356000101E7
             * currency : USD
             * bookingCenter : UK accounts
             * updateDate : 24 May 2018
             */

            private String id;
            private String name;
            private double amount;
            private String currency;
            private String bookingCenter;
            private String updateDate;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public double getAmount() {
                return amount;
            }

            public void setAmount(double amount) {
                this.amount = amount;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getBookingCenter() {
                return bookingCenter;
            }

            public void setBookingCenter(String bookingCenter) {
                this.bookingCenter = bookingCenter;
            }

            public String getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(String updateDate) {
                this.updateDate = updateDate;
            }
        }

        public static class YtdBean {
            /**
             * amount : 389503920120
             * currency : GBP
             */

            private long amount;
            private String currency;

            public long getAmount() {
                return amount;
            }

            public void setAmount(long amount) {
                this.amount = amount;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }
        }
    }
}
