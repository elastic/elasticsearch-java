package realworld.rest.error;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName("errors")
@JsonTypeInfo(include= As.WRAPPER_OBJECT, use= Id.NAME)
public record RestError (List<String> body){}

