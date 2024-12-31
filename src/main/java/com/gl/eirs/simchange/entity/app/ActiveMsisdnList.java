package com.gl.eirs.simchange.entity.app;


import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;


@Data
@Entity
@Table(name = "active_msisdn_list")
public class ActiveMsisdnList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "imsi")
     String imsi;

    @Column(name = "msisdn")
     String msisdn;

    @Column(name = "remark")
     String remarks;


    @Column(name = "operator")
     String operator;


    @Column(name = "activation_date")
     String activationDate;

}
