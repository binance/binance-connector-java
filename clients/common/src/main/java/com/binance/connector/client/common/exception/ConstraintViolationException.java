/*
 * Jakarta Bean Validation API
 *
 * License: Apache License, Version 2.0
 * See the license.txt file in the root directory or <http://www.apache.org/licenses/LICENSE-2.0>.
 */
package com.binance.connector.client.common.exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ValidationException;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Reports the result of constraint violations.
 *
 * @author Emmanuel Bernard
 * @author Gunnar Morling
 * @author Guillaume Smet
 */
public class ConstraintViolationException extends ValidationException {

    private final Set<ConstraintViolation<?>> constraintViolations;

    /**
     * Creates a constraint violation report.
     *
     * @param message error message
     * @param constraintViolations a {@code Set} of {@link ConstraintViolation}s or null
     */
    public ConstraintViolationException(
            String message, Set<? extends ConstraintViolation<?>> constraintViolations) {
        super(message);

        if (constraintViolations == null) {
            this.constraintViolations = null;
        } else {
            this.constraintViolations = new HashSet<>(constraintViolations);
        }
    }

    /**
     * Creates a constraint violation report.
     *
     * @param constraintViolations a {@code Set} of {@link ConstraintViolation}s or null
     */
    public ConstraintViolationException(
            Set<? extends ConstraintViolation<?>> constraintViolations) {
        this(
                constraintViolations != null ? toString(constraintViolations) : null,
                constraintViolations);
    }

    /**
     * Returns the set of constraint violations reported during a validation.
     *
     * @return the {@code Set} of {@link ConstraintViolation}s or null
     */
    public Set<ConstraintViolation<?>> getConstraintViolations() {
        return constraintViolations;
    }

    private static String toString(Set<? extends ConstraintViolation<?>> constraintViolations) {
        return constraintViolations.stream()
                .map(cv -> cv == null ? "null" : cv.getPropertyPath() + ": " + cv.getMessage())
                .collect(Collectors.joining(", "));
    }
}
