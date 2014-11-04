package org.primefaces.showcase.view.ajax;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BasicView implements Serializable{
     
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String text;
 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    
    private int number;
    
    public int getNumber() {
        return number;
    }
 
    public void increment() {
        number++;
    }
}
