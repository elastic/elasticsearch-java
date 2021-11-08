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
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.AppendProcessor
@JsonpDeserializable
public class AppendProcessor extends ProcessorBase implements ProcessorVariant {
	private final String field;

	private final List<JsonData> value;

	@Nullable
	private final Boolean allowDuplicates;

	// ---------------------------------------------------------------------------------------------

	private AppendProcessor(Builder builder) {
		super(builder);

		this.field = ModelTypeHelper.requireNonNull(builder.field, this, "field");
		this.value = ModelTypeHelper.unmodifiableRequired(builder.value, this, "value");
		this.allowDuplicates = builder.allowDuplicates;

	}

	public static AppendProcessor of(Function<Builder, ObjectBuilder<AppendProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "append";
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final List<JsonData> value() {
		return this.value;
	}

	/**
	 * API name: {@code allow_duplicates}
	 */
	@Nullable
	public final Boolean allowDuplicates() {
		return this.allowDuplicates;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (ModelTypeHelper.isDefined(this.value)) {
			generator.writeKey("value");
			generator.writeStartArray();
			for (JsonData item0 : this.value) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.allowDuplicates != null) {
			generator.writeKey("allow_duplicates");
			generator.write(this.allowDuplicates);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AppendProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AppendProcessor> {
		private String field;

		private List<JsonData> value;

		@Nullable
		private Boolean allowDuplicates;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(List<JsonData> value) {
			this.value = value;
			return this;
		}

		/**
		 * Required - API name: {@code value}
		 */
		public final Builder value(JsonData... value) {
			this.value = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code allow_duplicates}
		 */
		public final Builder allowDuplicates(@Nullable Boolean value) {
			this.allowDuplicates = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AppendProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AppendProcessor build() {
			_checkSingleUse();

			return new AppendProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AppendProcessor}
	 */
	public static final JsonpDeserializer<AppendProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			AppendProcessor::setupAppendProcessorDeserializer, Builder::build);

	protected static void setupAppendProcessorDeserializer(DelegatingDeserializer<AppendProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::value, JsonpDeserializer.arrayDeserializer(JsonData._DESERIALIZER), "value");
		op.add(Builder::allowDuplicates, JsonpDeserializer.booleanDeserializer(), "allow_duplicates");

	}

}
