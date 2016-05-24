package com.iconsultus.proj.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;


/**
 *
 * @author mansigarg
 */
@Entity
@Table(name="user_flight")
public class user_flight implements Serializable {
    @Id
    @Column(name="id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="userName")
    @Size(min=3, max=50)
    private String name;

    @Column(name="user_flightno")
    private String user_flightno;

    @Column(name="user_flightName")
    private String user_flightName;

    @Column(name="user_flightDay")
   // @NotNull
    @DateTimeFormat(pattern="dd/MM/yyyy") 
   // @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private String flightDate;

    @Column(name="totalSeats")
    private String totalSeats;

    @Column(name="src")
    //@NotEmpty
    private String source;

    @Column(name="dest")
    //@NotEmpty
    private String destination;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String userName) {
        this.name = userName;
    }

    public void setUser_flightno(String user_flightno) {
        this.user_flightno = user_flightno;
    }

    public void setUser_flightName(String user_flightName) {
        this.user_flightName = user_flightName;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public void setTotalSeats(String totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setSource(String src) {
        this.source = src;
    }

    public void setDestination(String dest) {
        this.destination = dest;
    }

    public String getName() {
        return name;
    }

    public String getUser_flightno() {
        return user_flightno;
    }

    public String getUser_flightName() {
        return user_flightName;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public String getTotalSeats() {
        return totalSeats;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
   
    
    
}
