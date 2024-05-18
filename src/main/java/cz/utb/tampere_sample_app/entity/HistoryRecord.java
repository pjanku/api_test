package cz.utb.tampere_sample_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class HistoryRecord {

    public HistoryRecord(long n1, long n2, String op, long rs){
        number1 = n1;
        number2 = n2;
        operator = op;
        result = rs;
        timestamp = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long number1;
    private long number2;
    private String operator;
    private long result;
    private Date timestamp;

    public HistoryRecord() {
        timestamp = new Date();
    }

    public long getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public long getNumber1() {
        return number1;
    }

    public void setNumber1(long number1) {
        this.number1 = number1;
    }

    public long getNumber2() {
        return number2;
    }

    public void setNumber2(long number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }
}
