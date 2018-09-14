package org.gt.projects.api.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProfileResponse {

    /**
     * code : 0
     * message : success
     * data : {"userName":"Jones","lastLoginTime":1533882667,"id":"1"}
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
         * userName : Jones
         * lastLoginTime : 1533882667
         * id : 1
         */

        private String userName;
        private int lastLoginTime;
        private String id;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getLastLoginTime() {
            return lastLoginTime;
        }

        public void setLastLoginTime(int lastLoginTime) {
            this.lastLoginTime = lastLoginTime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
