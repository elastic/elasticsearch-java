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

package co.elastic.clients.elasticsearch.experiments.inheritance.child;

import co.elastic.clients.elasticsearch.experiments.inheritance.base.BaseClass;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;

import java.util.Objects;

/**
 * A concrete class that both inherits a parent class and has child classes
 */
public class ChildClass extends BaseClass implements JsonpSerializable {

    private final String childField;

    public ChildClass(AbstractBuilder<?> builder) {
        super(builder);
        this.childField = Objects.requireNonNull(builder.childField, "childField");
    }

    public String childField() {
        return this.childField;
    }

    @Override
    protected void toJsonpInternal(JsonGenerator generator, JsonpMapper params) {
        super.toJsonpInternal(generator, params);
        generator.write("childField", this.childField);
    }

    //---------------------------------------------------------------------------------------------

    protected abstract static class AbstractBuilder<T extends AbstractBuilder<T>> extends BaseClass.AbstractBuilder<T> {

        private String childField;

        public T childField(String value) {
            this.childField = value;
            return self();
        }
    }

    // We cannot use AbstractBuilder directly, as it would cause a signature clash with subclasses on build().
    // And even without it, the generic parameter on AbstractBuilder is an implementation detail of builder
    // inheritance that isn't needed nor nice in user applications.
    public static class Builder extends AbstractBuilder<Builder> implements ObjectBuilder<ChildClass> {
        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ChildClass build() {
            return new ChildClass(this);
        }
    }

    //---------------------------------------------------------------------------------------------

    protected static <T extends AbstractBuilder<T>> void setupChildClassParser(DelegatingDeserializer<T> op) {
        BaseClass.setupBaseClassParser(op);
        op.add(AbstractBuilder::childField, JsonpDeserializer.stringDeserializer(), "childField");
    }

    public static final JsonpDeserializer<ChildClass> JSONP_PARSER = ObjectBuilderDeserializer.createForObject(
        Builder::new, ChildClass::setupChildClassParser
    );

}
