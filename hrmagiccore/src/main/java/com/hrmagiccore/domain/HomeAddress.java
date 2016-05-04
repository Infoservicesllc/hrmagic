package com.hrmagiccore.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity  
@DiscriminatorValue("homeAddress")
public class HomeAddress extends Address {

}
