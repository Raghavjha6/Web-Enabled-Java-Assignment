package cardValidator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.time.YearMonth;

@FacesValidator("expiryValidator")
public class ExpiryValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value)
            throws ValidatorException {

        String input = value.toString();

        if (input.length() == 2) { // month
            int month = Integer.parseInt(input);
            if (month < 1 || month > 12) {
                throw new ValidatorException(new FacesMessage(
                        FacesMessage.SEVERITY_ERROR,
                        "Invalid Month (01-12)", null));
            }
        }

        if (input.length() == 4) { // year
            int year = Integer.parseInt(input);
            int currentYear = YearMonth.now().getYear();
            if (year < currentYear) {
                throw new ValidatorException(new FacesMessage(
                        FacesMessage.SEVERITY_ERROR,
                        "Card Expired", null));
            }
        }
    }
}
