/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.json;

import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * A JSON generator that delegates to another generator.
 * <p>
 * All convenience methods that accept a property name and an event (value, start object, start array) call separately
 * {@link #writeKey(String)} and the same method without the key name. This is meant to facilitate overloading
 * of methods.
 */
public class DelegatingJsonGenerator implements JsonGenerator {
    protected final JsonGenerator generator;

    public DelegatingJsonGenerator(JsonGenerator generator) {
        this.generator = generator;
    }

    public JsonGenerator unwrap() {
        return generator;
    };

    @Override
    public JsonGenerator writeStartObject() {
        generator.writeStartObject();
        return this;
    }

    @Override
    public JsonGenerator writeKey(String s) {
        generator.writeKey(s);
        return this;
    }

    @Override
    public JsonGenerator writeStartArray() {
        generator.writeStartArray();
        return this;
    }

    @Override
    public JsonGenerator writeEnd() {
        generator.writeEnd();
        return this;
    }

    @Override
    public JsonGenerator write(JsonValue jsonValue) {
        generator.write(jsonValue);
        return this;
    }

    @Override
    public JsonGenerator write(String s) {
        generator.write(s);
        return this;
    }

    @Override
    public JsonGenerator write(BigDecimal bigDecimal) {
        generator.write(bigDecimal);
        return this;
    }

    @Override
    public JsonGenerator write(BigInteger bigInteger) {
        generator.write(bigInteger);
        return this;
    }

    @Override
    public JsonGenerator write(int i) {
        generator.write(i);
        return this;
    }

    @Override
    public JsonGenerator write(long l) {
        generator.write(l);
        return this;
    }

    @Override
    public JsonGenerator write(double v) {
        generator.write(v);
        return this;
    }

    @Override
    public JsonGenerator write(boolean b) {
        generator.write(b);
        return this;
    }

    @Override
    public JsonGenerator writeNull() {
        generator.writeNull();
        return this;
    }

    @Override
    public void close() {
        generator.close();
    }

    @Override
    public void flush() {
        generator.flush();
    }

    //----- Convenience key+value methods

    @Override
    public final JsonGenerator writeStartObject(String s) {
        this.writeKey(s);
        return this.writeStartObject();
    }

    @Override
    public final JsonGenerator writeStartArray(String s) {
        this.writeKey(s);
        return this.writeStartArray();
    }

    @Override
    public final JsonGenerator write(String s, JsonValue jsonValue) {
        this.writeKey(s);
        return this.write(jsonValue);
    }

    @Override
    public final JsonGenerator write(String s, String s1) {
        this.writeKey(s);
        return this.write(s1);
    }

    @Override
    public final JsonGenerator write(String s, BigInteger bigInteger) {
        this.writeKey(s);
        return this.write(bigInteger);
    }

    @Override
    public final JsonGenerator write(String s, BigDecimal bigDecimal) {
        this.writeKey(s);
        return this.write(bigDecimal);
    }

    @Override
    public final JsonGenerator write(String s, int i) {
        this.writeKey(s);
        return this.write(i);
    }

    @Override
    public final JsonGenerator write(String s, long l) {
        this.writeKey(s);
        return this.write(l);
    }

    @Override
    public final JsonGenerator write(String s, double v) {
        this.writeKey(s);
        return this.write(v);
    }

    @Override
    public final JsonGenerator write(String s, boolean b) {
        this.writeKey(s);
        return this.write(b);
    }

    @Override
    public final JsonGenerator writeNull(String s) {
        this.writeKey(s);
        return this.writeNull();
    }
}
