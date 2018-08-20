package org.gt.projects.api.data.request;

public class AccountOverviewRequestBody {

    private String[] ids;

    private String currency;

    public String[] getIds() {
        return ids;
    }

    public void setIds(String[] ids) {
        this.ids = ids;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
