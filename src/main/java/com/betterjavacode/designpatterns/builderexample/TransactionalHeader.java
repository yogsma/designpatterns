package com.betterjavacode.designpatterns.builderexample;

import java.io.Serializable;

public class TransactionalHeader implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private static final String FIELD_SPLITTER = "*";

    private String st;
    private String transactioncode;
    private String transactioncontrolnumber;
    private String implementationreference;

    public static class Builder {
        private String st;
        private String transactioncode;
        private String transactioncontrolnumber;
        private String implementationreference;

        public Builder st(String st) {
            this.st = st;
            return this;
        }

        public Builder transactioncode(String transactioncode) {
            this.transactioncode = transactioncode;
            return this;
        }

        public Builder transactioncontrolnumber(String transactioncontrolnumber) {
            this.transactioncontrolnumber = transactioncontrolnumber;
            return this;
        }

        public Builder implementationreference(String implementationreference) {
            this.implementationreference = implementationreference;
            return this;
        }

        public TransactionalHeader build() {
            return new TransactionalHeader(this);
        }
    }

    private TransactionalHeader(Builder builder) {
        this.st = builder.st;
        this.transactioncode = builder.transactioncode;
        this.transactioncontrolnumber = builder.transactioncontrolnumber;
        this.implementationreference = builder.implementationreference;
    }

    public String toString() {
        String result = "";
        StringBuffer sb = new StringBuffer();
        sb.append(st);
        sb.append(FIELD_SPLITTER);
        sb.append(transactioncode);
        sb.append(FIELD_SPLITTER);
        sb.append(transactioncontrolnumber); // This should be unique and match in SE02 field too.
        sb.append(FIELD_SPLITTER);
        sb.append(implementationreference);
        sb.append("~");

        result = sb.toString();
        return result;
    }
}
