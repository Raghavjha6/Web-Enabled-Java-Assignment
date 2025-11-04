package cardValidator;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;

@ManagedBean(name = "paymentBean")
@RequestScoped
public class PaymentBean implements Serializable {

    private String cardNumber;
    private String expiryMonth;
    private String expiryYear;
    private String amount;

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getExpiryMonth() { return expiryMonth; }
    public void setExpiryMonth(String expiryMonth) { this.expiryMonth = expiryMonth; }

    public String getExpiryYear() { return expiryYear; }
    public void setExpiryYear(String expiryYear) { this.expiryYear = expiryYear; }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }

    public String process() {
        FacesMessage msg = new FacesMessage(
                FacesMessage.SEVERITY_INFO,
                "Payment Successful! Amount Paid: \u20B9" + amount, null);
        FacesContext.getCurrentInstance().addMessage(null, msg);
        return null;
    }
}
