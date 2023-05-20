package ma.enset.violationservice.model;


import lombok.Data;

import java.util.Date;

@Data
public class Owner {


    private long id;
    private String name;
    private Date date;
    private String mail;

}
