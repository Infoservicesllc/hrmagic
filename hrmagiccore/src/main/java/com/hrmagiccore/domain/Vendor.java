package com.hrmagiccore.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("vendor")
public class Vendor extends Company {

}
