package ru.ifmo.backend.authentication.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
public class BindingChecker {
  public void throwIfBindResultHasErrors(BindingResult bindingResult) throws ValidException {
    if (bindingResult.hasErrors()) {
      throw new ValidException(bindingResult);
    }
  }
}