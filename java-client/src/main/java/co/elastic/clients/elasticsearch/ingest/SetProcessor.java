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
import co.elastic.clients.json.JsonData;
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

// typedef: ingest._types.SetProcessor
@JsonpDeserializable
public class SetProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	@Nullable
	private final Boolean override;

	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private SetProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.override = builder.override;
		this.value = ModelTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static SetProcessor of(Function<Builder, ObjectBuilder<SetProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "set";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code override}
	 */
	@Nullable
	public final Boolean override() {
		return this.override;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final JsonData value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.override != null) {
			generator.writeKey("override");
			generator.write(this.override);

		}
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SetProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<SetProcessor> {
		private String field;

		@Nullable
		private Boolean override;

		private JsonData value;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code override}
		 */
		public final Builder override(@Nullable Boolean value) {
			this.override = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(JsonData value) {
			this.value = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SetProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SetProcessor build() {
			_checkSingleUse();

			return new SetProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SetProcessor}
	 */
	public static final JsonpDeserializer<SetProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SetProcessor::setupSetProcessorDeserializer, Builder::build);

	protected static void setupSetProcessorDeserializer(DelegatingDeserializer<SetProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::override, JsonpDeserializer.booleanDeserializer(), "override");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
