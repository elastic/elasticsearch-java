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

package co.elastic.clients.elasticsearch.enrich;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: enrich._types.Policy
@JsonpDeserializable
public final class Policy implements JsonpSerializable {
	private final List<String> enrichFields;

	private final List<String> indices;

	private final String matchField;

	@Nullable
	private final String query;

	@Nullable
	private final String name;

	// ---------------------------------------------------------------------------------------------

	public Policy(Builder builder) {

		this.enrichFields = Objects.requireNonNull(builder.enrichFields, "enrich_fields");
		this.indices = Objects.requireNonNull(builder.indices, "indices");
		this.matchField = Objects.requireNonNull(builder.matchField, "match_field");
		this.query = builder.query;
		this.name = builder.name;

	}

	/**
	 * API name: {@code enrich_fields}
	 */
	public List<String> enrichFields() {
		return this.enrichFields;
	}

	/**
	 * API name: {@code indices}
	 */
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code match_field}
	 */
	public String matchField() {
		return this.matchField;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public String query() {
		return this.query;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public String name() {
		return this.name;
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

		generator.writeKey("enrich_fields");
		generator.writeStartArray();
		for (String item0 : this.enrichFields) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("indices");
		generator.writeStartArray();
		for (String item0 : this.indices) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("match_field");
		generator.write(this.matchField);

		if (this.query != null) {

			generator.writeKey("query");
			generator.write(this.query);

		}
		if (this.name != null) {

			generator.writeKey("name");
			generator.write(this.name);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Policy}.
	 */
	public static class Builder implements ObjectBuilder<Policy> {
		private List<String> enrichFields;

		private List<String> indices;

		private String matchField;

		@Nullable
		private String query;

		@Nullable
		private String name;

		/**
		 * API name: {@code enrich_fields}
		 */
		public Builder enrichFields(List<String> value) {
			this.enrichFields = value;
			return this;
		}

		/**
		 * API name: {@code enrich_fields}
		 */
		public Builder enrichFields(String... value) {
			this.enrichFields = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #enrichFields(List)}, creating the list if needed.
		 */
		public Builder addEnrichFields(String value) {
			if (this.enrichFields == null) {
				this.enrichFields = new ArrayList<>();
			}
			this.enrichFields.add(value);
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(List<String> value) {
			this.indices = value;
			return this;
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(String... value) {
			this.indices = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #indices(List)}, creating the list if needed.
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code match_field}
		 */
		public Builder matchField(String value) {
			this.matchField = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * Builds a {@link Policy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Policy build() {

			return new Policy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Policy}
	 */
	public static final JsonpDeserializer<Policy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Policy::setupPolicyDeserializer, Builder::build);

	protected static void setupPolicyDeserializer(DelegatingDeserializer<Policy.Builder> op) {

		op.add(Builder::enrichFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"enrich_fields");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::matchField, JsonpDeserializer.stringDeserializer(), "match_field");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
