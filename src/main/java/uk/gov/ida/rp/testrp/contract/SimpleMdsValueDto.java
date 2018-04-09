package uk.gov.ida.rp.testrp.contract;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.joda.time.DateTime;

@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
public class SimpleMdsValueDto<T> {

    private T value;
    private DateTime from;
    private DateTime to;
    private boolean verified;

    @SuppressWarnings("unused")
    public SimpleMdsValueDto() {
        // needed for JAXB
    }

    public SimpleMdsValueDto(T value, DateTime from, DateTime to, boolean verified) {
        this.value = value;
        this.from = from;
        this.to = to;
        this.verified = verified;
    }

    public T getValue() {
        return value;
    }

    public DateTime getFrom() {
        return from;
    }

    public DateTime getTo() {
        return to;
    }

    public boolean isVerified() {
        return verified;
    }

    @Override
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public String toString() {
        return "SimpleMdsValueDto{" +
                "\nvalue=" + value +
                ",\n from=" + from +
                ",\n to=" + to +
                ",\n verified=" + verified +
                '}';
    }
}
