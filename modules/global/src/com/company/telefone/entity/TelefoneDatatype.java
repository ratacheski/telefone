package com.company.telefone.entity;

import com.google.common.base.Strings;
import com.haulmont.chile.core.annotations.JavaClass;
import com.haulmont.chile.core.datatypes.Datatype;

import javax.annotation.Nullable;
import java.text.ParseException;
import java.util.Locale;

@JavaClass(String.class)
public class TelefoneDatatype implements Datatype<String> {
    @Override
    public String format(@Nullable Object value) {
        if (value == null)
            return "";
        else
            return "(" + value.toString().substring(0, 2) + ")"
                    + value.toString().substring(2, 7) + "-"
                    + value.toString().substring(7);
    }

    @Override
    public String format(@Nullable Object value, Locale locale) {
        return format(value);
    }

    @Nullable
    @Override
    public String parse(@Nullable String value) throws ParseException {
        if (Strings.isNullOrEmpty(value))
            return null;
        return value.replaceAll("[\\D]", "");
    }

    @Nullable
    @Override
    public String parse(@Nullable String value, Locale locale) throws ParseException {
        return parse(value);
    }
}
