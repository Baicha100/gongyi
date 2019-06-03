package com.example.demo.entity;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/*社团表的实例化*/
public class association {
    int associationid;
    String associationname;
    String associationnumber;
    String associationpassword;
    String associationschool;
    String associationintroduce;
    String associationpeople;
    String associationphone;
    public association(int associationid,String associationname,String associationnumber,String associationpassword,
            String associationschool,String associationintroduce,String associationpeople,String associationphone){
        this.associationid=associationid;
        this.associationname=associationname;
        this.associationnumber=associationnumber;
        this.associationpassword=associationpassword;
        this.associationschool=associationschool;
        this.associationintroduce=associationintroduce;
        this.associationpeople=associationpeople;
        this.associationphone=associationphone;
    }
    public association(){
    }
}
