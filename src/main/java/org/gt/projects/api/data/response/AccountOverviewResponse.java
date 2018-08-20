package org.gt.projects.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountOverviewResponse {

    /**
     * code : 0
     * message : success
     * data : {"accounts":[{"id":"1","name":"Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww","amount":6000000.12,"externalId":"000000001","currency":"USD","baseCurrency":"USD","ytd":{"amount":-2000000.12,"currency":"GBP","weight":-999.99},"updateDate":"24 May 2018"},{"id":"2","name":"Ben","externalId":"000000002","amount":5000000.87,"currency":"USD","baseCurrency":"USD","ytd":{"amount":9000000.12,"currency":"GBP","weight":999.99},"updateDate":"24 May 2018"},{"id":"3","name":"Clara","externalId":"000000003","amount":3000000.01,"currency":"USD","baseCurrency":"USD","ytd":{"amount":8234000.12,"currency":"GBP","weight":60.8},"updateDate":"24 May 2018"},{"id":"4","name":"Don","externalId":"000000004","amount":2000000.01,"currency":"USD","baseCurrency":"USD","ytd":{"amount":7234000.12,"currency":"GBP","weight":120.77},"updateDate":"24 May 2018"},{"id":"5","name":"Esther","externalId":"000000005","amount":900000,"currency":"USD","baseCurrency":"USD","ytd":{"amount":6834000.12,"currency":"GBP","weight":55.74},"updateDate":"24 May 2018"},{"id":"6","name":"Fabien","amount":800000,"externalId":"000000006","currency":"USD","baseCurrency":"USD","ytd":{"amount":6334000.12,"currency":"GBP","weight":94.69},"updateDate":"24 May 2018"},{"id":"7","name":"Gillian","amount":700000,"externalId":"000000007","currency":"USD","baseCurrency":"USD","ytd":{"amount":5934000.12,"currency":"GBP","weight":382.63},"updateDate":"24 May 2018"},{"id":"8","name":"Holland","amount":600000,"externalId":"000000008","currency":"USD","baseCurrency":"USD","ytd":{"amount":5534000.12,"currency":"GBP","weight":34.89},"updateDate":"24 May 2018"},{"id":"9","name":"Issac","amount":500000,"externalId":"000000009","currency":"USD","baseCurrency":"USD","ytd":{"amount":5134000.12,"currency":"GBP","weight":67.14},"updateDate":"24 May 2018"},{"id":"10","name":"John","amount":400000,"externalId":"000000010","currency":"USD","baseCurrency":"USD","ytd":{"amount":-1234000.12,"currency":"GBP","weight":-9.5},"updateDate":"24 May 2018"},{"id":"11","name":"Keith","amount":300000,"externalId":"000000011","currency":"USD","baseCurrency":"USD","ytd":{"amount":3234000.12,"currency":"GBP","weight":553.8},"updateDate":"24 May 2018"},{"id":"12","name":"Lam","amount":200000,"externalId":"000000012","currency":"USD","baseCurrency":"USD","ytd":{"amount":2234000.12,"currency":"GBP","weight":126.37},"updateDate":"24 May 2018"},{"id":"13","name":"Moses","amount":100000,"externalId":"000000013","currency":"USD","baseCurrency":"USD","ytd":{"amount":934000.12,"currency":"GBP","weight":46.1},"updateDate":"24 May 2018"},{"id":"14","name":"Neil","amount":40000,"externalId":"000000014","currency":"USD","baseCurrency":"USD","ytd":{"amount":244000.12,"currency":"GBP","weight":8.09},"updateDate":"24 May 2018"},{"id":"15","name":"Oscar","amount":3000,"externalId":"000000015","currency":"USD","baseCurrency":"USD","ytd":{"amount":9734000.12,"currency":"GBP","weight":447.52},"updateDate":"24 May 2018"},{"id":"0","name":"Pauline","externalId":"000000016","amount":0,"currency":"USD","baseCurrency":"USD","ytd":{"amount":0,"currency":"GBP","weight":0},"updateDate":"24 May 2018"}]}
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
        private List<AccountsBean> accounts;

        public List<AccountsBean> getAccounts() {
            return accounts;
        }

        public void setAccounts(List<AccountsBean> accounts) {
            this.accounts = accounts;
        }

        public static class AccountsBean {
            /**
             * id : 1
             * name : Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
             * amount : 6000000.12
             * externalId : 000000001
             * currency : USD
             * baseCurrency : USD
             * ytd : {"amount":-2000000.12,"currency":"GBP","weight":-999.99}
             * updateDate : 24 May 2018
             */

            private String id;
            private String name;
            private double amount;
            private String externalId;
            private String currency;
            private String baseCurrency;
            private YtdBean ytd;
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

            public String getExternalId() {
                return externalId;
            }

            public void setExternalId(String externalId) {
                this.externalId = externalId;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getBaseCurrency() {
                return baseCurrency;
            }

            public void setBaseCurrency(String baseCurrency) {
                this.baseCurrency = baseCurrency;
            }

            public YtdBean getYtd() {
                return ytd;
            }

            public void setYtd(YtdBean ytd) {
                this.ytd = ytd;
            }

            public String getUpdateDate() {
                return updateDate;
            }

            public void setUpdateDate(String updateDate) {
                this.updateDate = updateDate;
            }

            public static class YtdBean {
                /**
                 * amount : -2000000.12
                 * currency : GBP
                 * weight : -999.99
                 */

                private double amount;
                private String currency;
                private double weight;

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

                public double getWeight() {
                    return weight;
                }

                public void setWeight(double weight) {
                    this.weight = weight;
                }
            }
        }
    }
}
