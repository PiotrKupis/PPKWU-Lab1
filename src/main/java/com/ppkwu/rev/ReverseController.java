package com.ppkwu.rev;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller responsible for reversing strings.
 */
@RestController
public class ReverseController {

    /**
     * Method responsible for reversing string.
     *
     * @param value string to be reversed
     * @return object of type {@link ResponseEntity} with reversed string
     */
    @GetMapping("reverse/{value}")
    public ResponseEntity<String> reverseString(@PathVariable("value") String value) {
        StringBuilder stringBuilder = new StringBuilder(value);
        stringBuilder.reverse();
        return ResponseEntity.ok(stringBuilder.toString());
    }
}
