package com.iconsultus.proj.model;

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


@Entity
@Table(name="flight")
public class flight implements java.io.Serializable{
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
     
     
    @Size(min=3, max=50)
    @Column(name="flightNum")
    private String flightNum;
     
     
    @Column(name="flightName")
    private String flightName;
      
      
    @Column(name="daytime_dep")
    @NotNull
 //   @DateTimeFormat(pattern="dd/MM/yyyy") 
   // @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private String DayTimeDep;
    
    @Column(name="daytime_arrive")
    @NotNull
   // @DateTimeFormat(pattern="dd/MM/yyyy") 
   // @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private String DayTimeArr;
        
    @Column(name="Occupied")
    private int Occupied;
 
    @Column(name="totalseats")
    private int totalSeats;

    @Column(name="Avail")
    private int Avail;
         
         
    @Column(name="src")
    private String src;
         
         
    @Column(name="dest")
    private String dest;
    

    public int getId() {
        return id;
    }

    public int getAvail() {
        return Avail;
    }
         
         
   
    public void setId(int id) {
        this.id = id;
    }

    public void setAvail(int Avail) {
        this.Avail = Avail;
    }
        
         
    
 
    public String getFlightNum() {
        return flightNum;
    }
    

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setDayTimeDep(String DayTimeDep) {
        this.DayTimeDep = DayTimeDep;
    }

    public void setDayTimeArr(String DayTimeArr) {
        this.DayTimeArr = DayTimeArr;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public void setOccupied(int Occupied) {
        this.Occupied = Occupied;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getDayTimeDep() {
        return DayTimeDep;
    }

    public String getDayTimeArr() {
        return DayTimeArr;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getOccupied() {
        return Occupied;
    }

    public String getSrc() {
        return src;
    }

    public String getDest() {
        return dest;
    }
       
}
