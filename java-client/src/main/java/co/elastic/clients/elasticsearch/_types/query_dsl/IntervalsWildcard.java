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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsWildcard
@JsonpDeserializable
public final class IntervalsWildcard implements IntervalsQueryVariant, IntervalsVariant, JsonpSerializable {
	@Nullable
	private final String analyzer;

	private final String pattern;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	public IntervalsWildcard(Builder builder) {

		this.analyzer = builder.analyzer;
		this.pattern = Objects.requireNonNull(builder.pattern, "pattern");
		this.useField = builder.useField;

	}

	public IntervalsWildcard(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link IntervalsQuery}, {@link Intervals} variant type
	 */
	@Override
	public String _variantType() {
		return "wildcard";
	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * Required - API name: {@code pattern}
	 */
	public String pattern() {
		return this.pattern;
	}

	/**
	 * API name: {@code use_field}
	 */
	@Nullable
	public String useField() {
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

		generator.writeKey("pattern");
		generator.write(this.pattern);

		if (this.useField != null) {

			generator.writeKey("use_field");
			generator.write(this.useField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IntervalsWildcard}.
	 */
	public static class Builder implements ObjectBuilder<IntervalsWildcard> {
		@Nullable
		private String analyzer;

		private String pattern;

		@Nullable
		private String useField;

		/**
		 * API name: {@code analyzer}
		 */
		public Builder analyzer(@Nullable String value) {
			this.analyzer = value;
			return this;
		}

		/**
		 * Required - API name: {@code pattern}
		 */
		public Builder pattern(String value) {
			this.pattern = value;
			return this;
		}

		/**
		 * API name: {@code use_field}
		 */
		public Builder useField(@Nullable String value) {
			this.useField = value;
			return this;
		}

		/**
		 * Builds a {@link IntervalsWildcard}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsWildcard build() {

			return new IntervalsWildcard(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IntervalsWildcard}
	 */
	public static final JsonpDeserializer<IntervalsWildcard> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IntervalsWildcard::setupIntervalsWildcardDeserializer, Builder::build);

	protected static void setupIntervalsWildcardDeserializer(DelegatingDeserializer<IntervalsWildcard.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::pattern, JsonpDeserializer.stringDeserializer(), "pattern");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
