package stateLang;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;

@ManagedBean(name = "stateBean")
@SessionScoped
public class StateBean implements Serializable {

	private String state;
    private String language;

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getLanguage() { return language; }

    public void stateChanged(ValueChangeEvent event) {
        String selected = (String) event.getNewValue();
        switch(selected) {
        	case "Karnataka": language = "Kannada"; break;
            case "Maharashtra": language = "Marathi"; break;
            case "Tamil Nadu": language = "Tamil"; break;
            case "West Bengal": language = "Bengali"; break;
            default: language = "Unknown";
        }
    }
}
