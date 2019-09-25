package org.motometer.telegram.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(builder = ImmutableUser.Builder.class)
public interface User {

}
