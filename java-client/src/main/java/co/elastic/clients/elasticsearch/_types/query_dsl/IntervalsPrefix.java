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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsPrefix
@JsonpDeserializable
public class IntervalsPrefix implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	private final String prefix;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	private IntervalsPrefix(Builder builder) {

		this.analyzer = builder.analyzer;
		this.prefix = ModelTypeHelper.requireNonNull(builder.prefix, this, "prefix");
		this.useField = builder.useField;

	}

	public static IntervalsPrefix of(Function<Builder, ObjectBuilder<IntervalsPrefix>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link IntervalsQuery}, {@link Intervals} variant type
	 */
	@Override
	public String _variantType() {
		return "prefix";
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public final String analyzer() {
		return this.analyzer;
	}

	/**
	 * Required - API name: {@code prefix}
	 */
	public final String prefix() {
		return this.prefix;
	}

	/**
	 * API name: {@code use_field}
	 */
	@Nullable
	public final String useField() {
		return this.useField;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.analyzer != null) {
			generator.writeKey("analyzer");
			generator.write(this.analyzer);

		}
		generator.writeKey("prefix");
		generator.write(this.prefix);

		if (this.useField != null) {
			generator.writeKey("use_field");
			generator.write(this.useField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsPrefix}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<IntervalsPrefix> {
		@Nullable
		private String analyzer;

		private String prefix;

		@Nullable
		private String useField;

		/**
		 * API name: {@code analyzer}
		 */
		public final Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Required - API name: {@code prefix}
		 */
		public final Builder prefix(String value) {
			this.prefix = value;
			return this;
		}

		/**
		 * API name: {@code use_field}
		 */
		public final Builder useField(@Nullable String value) {
			this.useField = value;
			return this;
		}

		/**
		 * Builds a {@link IntervalsPrefix}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsPrefix build() {
			_checkSingleUse();

			return new IntervalsPrefix(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsPrefix}
	 */
	public static final JsonpDeserializer<IntervalsPrefix> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IntervalsPrefix::setupIntervalsPrefixDeserializer, Builder::build);

	protected static void setupIntervalsPrefixDeserializer(DelegatingDeserializer<IntervalsPrefix.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
