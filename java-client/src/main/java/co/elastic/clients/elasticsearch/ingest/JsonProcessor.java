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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.JsonProcessor
@JsonpDeserializable
public class JsonProcessor extends ProcessorBase implements ProcessorVariant {
	private final boolean addToRoot;

	private final String field;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private JsonProcessor(Builder builder) {
		super(builder);

		this.addToRoot = ModelTypeHelper.requireNonNull(builder.addToRoot, this, "addToRoot");
		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.targetField = ModelTypeHelper.requireNonNull(builder.targetField, this, "targetField");

	}

	public static JsonProcessor of(Function<Builder, ObjectBuilder<JsonProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "json";
	}

	/**
	 * Required - API name: {@code add_to_root}
	 */
	public final boolean addToRoot() {
		return this.addToRoot;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code target_field}
	 */
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("add_to_root");
		generator.write(this.addToRoot);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JsonProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<JsonProcessor> {
		private Boolean addToRoot;

		private String field;

		private String targetField;

		/**
		 * Required - API name: {@code add_to_root}
		 */
		public final Builder addToRoot(boolean value) {
			this.addToRoot = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code target_field}
		 */
		public final Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JsonProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JsonProcessor build() {
			_checkSingleUse();

			return new JsonProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JsonProcessor}
	 */
	public static final JsonpDeserializer<JsonProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JsonProcessor::setupJsonProcessorDeserializer, Builder::build);

	protected static void setupJsonProcessorDeserializer(DelegatingDeserializer<JsonProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::addToRoot, JsonpDeserializer.booleanDeserializer(), "add_to_root");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
