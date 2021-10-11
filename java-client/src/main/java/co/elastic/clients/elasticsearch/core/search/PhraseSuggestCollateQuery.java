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

package co.elastic.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.PhraseSuggestCollateQuery
@JsonpDeserializable
public final class PhraseSuggestCollateQuery implements JsonpSerializable {
	@Nullable
	private final String id;

	@Nullable
	private final String source;

	// ---------------------------------------------------------------------------------------------

	public PhraseSuggestCollateQuery(Builder builder) {

		this.id = builder.id;
		this.source = builder.source;

	}

	public PhraseSuggestCollateQuery(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code source}
	 */
	@Nullable
	public String source() {
		return this.source;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.source != null) {

			generator.writeKey("source");
			generator.write(this.source);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PhraseSuggestCollateQuery}.
	 */
	public static class Builder implements ObjectBuilder<PhraseSuggestCollateQuery> {
		@Nullable
		private String id;

		@Nullable
		private String source;

		/**
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code source}
		 */
		public Builder source(@Nullable String value) {
			this.source = value;
			return this;
		}

		/**
		 * Builds a {@link PhraseSuggestCollateQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PhraseSuggestCollateQuery build() {

			return new PhraseSuggestCollateQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PhraseSuggestCollateQuery}
	 */
	public static final JsonpDeserializer<PhraseSuggestCollateQuery> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PhraseSuggestCollateQuery::setupPhraseSuggestCollateQueryDeserializer, Builder::build);

	protected static void setupPhraseSuggestCollateQueryDeserializer(
			DelegatingDeserializer<PhraseSuggestCollateQuery.Builder> op) {

		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::source, JsonpDeserializer.stringDeserializer(), "source");

	}

}
