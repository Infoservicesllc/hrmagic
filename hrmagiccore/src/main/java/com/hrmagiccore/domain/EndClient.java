package com.hrmagiccore.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity  
@DiscriminatorValue("endClient")
public class EndClient extends Company {

}
