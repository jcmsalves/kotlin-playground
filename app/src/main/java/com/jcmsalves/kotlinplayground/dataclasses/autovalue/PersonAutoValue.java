package com.jcmsalves.kotlinplayground.dataclasses.autovalue;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class PersonAutoValue {

    public abstract String getName();

    public abstract int getAge();

    public abstract String getEmail();

    public abstract int getPhone();

    public static Builder builder() {
        return new AutoValue_PersonAutoValue.Builder()
                .setAge(30);
    }

    @AutoValue.Builder
    public abstract static class Builder {

        public abstract Builder setName(String newName);

        public abstract Builder setAge(int newAge);

        public abstract Builder setEmail(String newEmail);

        public abstract Builder setPhone(int newPhone);

        public abstract PersonAutoValue build();
    }
}
