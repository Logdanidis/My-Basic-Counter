package org.primefaces.showcase.view.ajax;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class BasicView implements Serializable{
     
    /**Dokimastiko script gia ekp.
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
        
        saveMessage();
	/** kalei tin saveMessage gia na doulepsei to growl */
    }
    /**
	 * growl msg
	 * 
	 * private String message;
	 * 
	 * public String getMessage() { return message; }
	 */
	public void setMessage(String message) {
		this.text = message;
	}

	public void saveMessage() {
		FacesContext context = FacesContext.getCurrentInstance();

		context.addMessage(null, new FacesMessage("Successful",
				"Your message: " + text));
		context.addMessage(null, new FacesMessage("Second Message",
				"Additional Message Detail"));
	}
}
