package fr.touin.thierry.service.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "userxml")
//@XmlRootElement
public class UserBiz {

    private Integer id;

    private String  name;

    public UserBiz() {
    }

//    public UserBiz(String userBiz) {
//       //this = (UserBiz) Jacksson.jsonToObject(userBiz);
//    	System.out.println("userBizEnJSon=" + userBiz);
//    	this.name = userBiz;
//    }    
   
    public UserBiz(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("{id=%s,name=%s}", id, name);
    }

}
