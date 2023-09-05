package gr.personal.bankapp.validator;

import gr.personal.bankapp.dto.CustomerInsertDTO;
import gr.personal.bankapp.dto.CustomerUpdateDTO;

import java.util.HashMap;
import java.util.Map;

public class CustomerValidator {

    private CustomerValidator() {}

    public static Map<String, String> validate(CustomerInsertDTO dto) {
        Map<String, String> errors = new HashMap<>();
        if (dto.getFirstname().length() < 3 || dto.getFirstname().length() > 32) {
            errors.put("firstname", "size");
        }

        if (dto.getFirstname().matches("^.*\\s+.*$")) {
            errors.put("firstname", "whitespaces");
        }

        if (dto.getLastname().length() < 3 || dto.getLastname().length() > 32) {
            errors.put("lastname", "size");
        }

        if (dto.getLastname().matches("^.*\\s+.*$")) {
            errors.put("lastname", "whitespaces");
        }

        // if (userService.isUsernameTaken(dto.getUsername()) {
        // }

        return errors;
    }

    public static Map<String, String> validate(CustomerUpdateDTO dto) {
        Map<String, String> errors = new HashMap<>();
        if (dto.getFirstname().length() < 3 || dto.getFirstname().length() > 32) {
            errors.put("firstname", "size");
        }

        if (dto.getFirstname().matches("^.*\\s+.*$")) {
            errors.put("firstname", "whitespaces");
        }

        if (dto.getLastname().length() < 3 || dto.getLastname().length() > 32) {
            errors.put("lastname", "size");
        }

        if (dto.getLastname().matches("^.*\\s+.*$")) {
            errors.put("lastname", "whitespaces");
        }

        // if (userService.isUsernameTaken(dto.getUsername()) {
        // }

        return errors;
    }
}
