package com.universitaria.cesmag.institucinuniversitariacesmag;

public class Adapter{
    String content;
    String title;
    String url;
    String ID,name,biso,bulid,bulidName;

    Adapter (String url, String title, String content){
        this.content= content;
        this.title=title;
        this.url=url;
    }

    Adapter (String ID, String name, String biso, String bulid, String bulidName){
        this.ID=ID;
        this.name= name;
        this.biso=biso;
        this.bulid=bulid;
        this.bulidName=bulidName;
    }
}
