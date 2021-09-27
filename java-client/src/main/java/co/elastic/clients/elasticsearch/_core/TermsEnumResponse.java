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

package co.elastic.clients.elasticsearch._core;

import co.elastic.clients.elasticsearch._types.ShardStatistics;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.terms_enum.Response
@JsonpDeserializable
public final class TermsEnumResponse implements JsonpSerializable {
	private final ShardStatistics shards;

	private final List<String> terms;

	private final Boolean complete;

	// ---------------------------------------------------------------------------------------------

	public TermsEnumResponse(Builder builder) {

		this.shards = Objects.requireNonNull(builder.shards, "_shards");
		this.terms = Objects.requireNonNull(builder.terms, "terms");
		this.complete = Objects.requireNonNull(builder.complete, "complete");

	}

	/**
	 * API name: {@code _shards}
	 */
	public ShardStatistics shards() {
		return this.shards;
	}

	/**
	 * API name: {@code terms}
	 */
	public List<String> terms() {
		return this.terms;
	}

	/**
	 * API name: {@code complete}
	 */
	public Boolean complete() {
		return this.complete;
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

		generator.writeKey("_shards");
		this.shards.serialize(generator, mapper);

		generator.writeKey("terms");
		generator.writeStartArray();
		for (String item0 : this.terms) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("complete");
		generator.write(this.complete);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TermsEnumResponse}.
	 */
	public static class Builder implements ObjectBuilder<TermsEnumResponse> {
		private ShardStatistics shards;

		private List<String> terms;

		private Boolean complete;

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(ShardStatistics value) {
			this.shards = value;
			return this;
		}

		/**
		 * API name: {@code _shards}
		 */
		public Builder shards(Function<ShardStatistics.Builder, ObjectBuilder<ShardStatistics>> fn) {
			return this.shards(fn.apply(new ShardStatistics.Builder()).build());
		}

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(List<String> value) {
			this.terms = value;
			return this;
		}

		/**
		 * API name: {@code terms}
		 */
		public Builder terms(String... value) {
			this.terms = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #terms(List)}, creating the list if needed.
		 */
		public Builder addTerms(String value) {
			if (this.terms == null) {
				this.terms = new ArrayList<>();
			}
			this.terms.add(value);
			return this;
		}

		/**
		 * API name: {@code complete}
		 */
		public Builder complete(Boolean value) {
			this.complete = value;
			return this;
		}

		/**
		 * Builds a {@link TermsEnumResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TermsEnumResponse build() {

			return new TermsEnumResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TermsEnumResponse}
	 */
	public static final JsonpDeserializer<TermsEnumResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TermsEnumResponse::setupTermsEnumResponseDeserializer, Builder::build);

	protected static void setupTermsEnumResponseDeserializer(DelegatingDeserializer<TermsEnumResponse.Builder> op) {

		op.add(Builder::shards, ShardStatistics._DESERIALIZER, "_shards");
		op.add(Builder::terms, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "terms");
		op.add(Builder::complete, JsonpDeserializer.booleanDeserializer(), "complete");

	}

}
