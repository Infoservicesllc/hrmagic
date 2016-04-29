package com.hrmagiccore.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("workAddress")
public class WorkAddress extends Address{

}
