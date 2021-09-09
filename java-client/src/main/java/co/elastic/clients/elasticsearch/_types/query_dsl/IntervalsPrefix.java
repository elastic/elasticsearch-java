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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.IntervalsPrefix
public final class IntervalsPrefix implements ToJsonp {
	@Nullable
	private final String analyzer;

	private final String prefix;

	@Nullable
	private final String useField;

	// ---------------------------------------------------------------------------------------------

	protected IntervalsPrefix(Builder builder) {

		this.analyzer = builder.analyzer;
		this.prefix = Objects.requireNonNull(builder.prefix, "prefix");
		this.useField = builder.useField;

	}

	/**
	 * API name: {@code analyzer}
	 */
	@Nullable
	public String analyzer() {
		return this.analyzer;
	}

	/**
	 * API name: {@code prefix}
	 */
	public String prefix() {
		return this.prefix;
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
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

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
	public static class Builder implements ObjectBuilder<IntervalsPrefix> {
		@Nullable
		private String analyzer;

		private String prefix;

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
		 * API name: {@code prefix}
		 */
		public Builder prefix(String value) {
			this.prefix = value;
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
		 * Builds a {@link IntervalsPrefix}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IntervalsPrefix build() {

			return new IntervalsPrefix(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IntervalsPrefix
	 */
	public static final JsonpDeserializer<IntervalsPrefix> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IntervalsPrefix::setupIntervalsPrefixDeserializer);

	protected static void setupIntervalsPrefixDeserializer(DelegatingDeserializer<IntervalsPrefix.Builder> op) {

		op.add(Builder::analyzer, JsonpDeserializer.stringDeserializer(), "analyzer");
		op.add(Builder::prefix, JsonpDeserializer.stringDeserializer(), "prefix");
		op.add(Builder::useField, JsonpDeserializer.stringDeserializer(), "use_field");

	}

}
