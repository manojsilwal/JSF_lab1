package domain;
import java.io.Serializable;
import java.util.Locale;

import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
@Named("user")
@SessionScoped
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String locale;
	
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
		System.out.println(locale);
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		viewRoot.setLocale(new Locale(locale));
	}
	
	public boolean isNepali(){
		if("np".equals(locale))
			return true;
		else return false;
	}
	
	public boolean isEnglish(){
		if("np".equals(locale))
			return true;
		else return false;
	}
	public void changeLocale(ValueChangeEvent e){
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		viewRoot.setLocale(new Locale(e.getNewValue().toString()));
	}
}
