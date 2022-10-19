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

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.SetProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.SetProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class SetProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final String copyFrom;

	private final String field;

	@Nullable
	private final Boolean ignoreEmptyValue;

	@Nullable
	private final String mediaType;

	@Nullable
	private final Boolean override;

	@Nullable
	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private SetProcessor(Builder builder) {
		super(builder);

		this.copyFrom = builder.copyFrom;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.ignoreEmptyValue = builder.ignoreEmptyValue;
		this.mediaType = builder.mediaType;
		this.override = builder.override;
		this.value = builder.value;

	}

	public static SetProcessor of(Function<Builder, ObjectBuilder<SetProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Set;
	}

	/**
	 * API name: {@code copy_from}
	 */
	@Nullable
	public final String copyFrom() {
		return this.copyFrom;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code ignore_empty_value}
	 */
	@Nullable
	public final Boolean ignoreEmptyValue() {
		return this.ignoreEmptyValue;
	}

	/**
	 * API name: {@code media_type}
	 */
	@Nullable
	public final String mediaType() {
		return this.mediaType;
	}

	/**
	 * API name: {@code override}
	 */
	@Nullable
	public final Boolean override() {
		return this.override;
	}

	/**
	 * API name: {@code value}
	 */
	@Nullable
	public final JsonData value() {
		return this.value;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.copyFrom != null) {
			generator.writeKey("copy_from");
			generator.write(this.copyFrom);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.ignoreEmptyValue != null) {
			generator.writeKey("ignore_empty_value");
			generator.write(this.ignoreEmptyValue);

		}
		if (this.mediaType != null) {
			generator.writeKey("media_type");
			generator.write(this.mediaType);

		}
		if (this.override != null) {
			generator.writeKey("override");
			generator.write(this.override);

		}
		if (this.value != null) {
			generator.writeKey("value");
			this.value.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SetProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder> implements ObjectBuilder<SetProcessor> {
		@Nullable
		private String copyFrom;

		private String field;

		@Nullable
		private Boolean ignoreEmptyValue;

		@Nullable
		private String mediaType;

		@Nullable
		private Boolean override;

		@Nullable
		private JsonData value;

		/**
		 * API name: {@code copy_from}
		 */
		public final Builder copyFrom(@Nullable String value) {
			this.copyFrom = value;
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
		 * API name: {@code ignore_empty_value}
		 */
		public final Builder ignoreEmptyValue(@Nullable Boolean value) {
			this.ignoreEmptyValue = value;
			return this;
		}

		/**
		 * API name: {@code media_type}
		 */
		public final Builder mediaType(@Nullable String value) {
			this.mediaType = value;
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
		 * API name: {@code value}
		 */
		public final Builder value(@Nullable JsonData value) {
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
			SetProcessor::setupSetProcessorDeserializer);

	protected static void setupSetProcessorDeserializer(ObjectDeserializer<SetProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::copyFrom, JsonpDeserializer.stringDeserializer(), "copy_from");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::ignoreEmptyValue, JsonpDeserializer.booleanDeserializer(), "ignore_empty_value");
		op.add(Builder::mediaType, JsonpDeserializer.stringDeserializer(), "media_type");
		op.add(Builder::override, JsonpDeserializer.booleanDeserializer(), "override");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
