package com.example.BibliotecaApi.util;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.time.Year;

public class YearAdapter implements JsonSerializer<Year>, JsonDeserializer<Year> {

    @Override
    public JsonElement serialize(Year year, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(year.toString());
    }

    @Override
    public Year deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
        return Year.parse(json.getAsString());
    }
}