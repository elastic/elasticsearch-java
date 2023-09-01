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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich._types.Policy

/**
 *
 * @see <a href="../doc-files/api-spec.html#enrich._types.Policy">API
 *      specification</a>
 */
@JsonpDeserializable
public class EnrichPolicy implements JsonpSerializable {
	private final List<String> enrichFields;

	private final List<String> indices;

	private final String matchField;

	@Nullable
	private final String query;

	@Nullable
	private final String name;

	@Nullable
	private final String elasticsearchVersion;

	// ---------------------------------------------------------------------------------------------

	private EnrichPolicy(Builder builder) {

		this.enrichFields = ApiTypeHelper.unmodifiableRequired(builder.enrichFields, this, "enrichFields");
		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.matchField = ApiTypeHelper.requireNonNull(builder.matchField, this, "matchField");
		this.query = builder.query;
		this.name = builder.name;
		this.elasticsearchVersion = builder.elasticsearchVersion;

	}

	public static EnrichPolicy of(Function<Builder, ObjectBuilder<EnrichPolicy>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code enrich_fields}
	 */
	public final List<String> enrichFields() {
		return this.enrichFields;
	}

	/**
	 * Required - API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Required - API name: {@code match_field}
	 */
	public final String matchField() {
		return this.matchField;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public final String query() {
		return this.query;
	}

	/**
	 * API name: {@code name}
	 */
	@Nullable
	public final String name() {
		return this.name;
	}

	/**
	 * API name: {@code elasticsearch_version}
	 */
	@Nullable
	public final String elasticsearchVersion() {
		return this.elasticsearchVersion;
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

		if (ApiTypeHelper.isDefined(this.enrichFields)) {
			generator.writeKey("enrich_fields");
			generator.writeStartArray();
			for (String item0 : this.enrichFields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
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
		if (this.elasticsearchVersion != null) {
			generator.writeKey("elasticsearch_version");
			generator.write(this.elasticsearchVersion);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichPolicy}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EnrichPolicy> {
		private List<String> enrichFields;

		private List<String> indices;

		private String matchField;

		@Nullable
		private String query;

		@Nullable
		private String name;

		@Nullable
		private String elasticsearchVersion;

		/**
		 * Required - API name: {@code enrich_fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>enrichFields</code>.
		 */
		public final Builder enrichFields(List<String> list) {
			this.enrichFields = _listAddAll(this.enrichFields, list);
			return this;
		}

		/**
		 * Required - API name: {@code enrich_fields}
		 * <p>
		 * Adds one or more values to <code>enrichFields</code>.
		 */
		public final Builder enrichFields(String value, String... values) {
			this.enrichFields = _listAdd(this.enrichFields, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * Required - API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code match_field}
		 */
		public final Builder matchField(String value) {
			this.matchField = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public final Builder query(@Nullable String value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code name}
		 */
		public final Builder name(@Nullable String value) {
			this.name = value;
			return this;
		}

		/**
		 * API name: {@code elasticsearch_version}
		 */
		public final Builder elasticsearchVersion(@Nullable String value) {
			this.elasticsearchVersion = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrichPolicy}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrichPolicy build() {
			_checkSingleUse();

			return new EnrichPolicy(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrichPolicy}
	 */
	public static final JsonpDeserializer<EnrichPolicy> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EnrichPolicy::setupEnrichPolicyDeserializer);

	protected static void setupEnrichPolicyDeserializer(ObjectDeserializer<EnrichPolicy.Builder> op) {

		op.add(Builder::enrichFields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"enrich_fields");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::matchField, JsonpDeserializer.stringDeserializer(), "match_field");
		op.add(Builder::query, JsonpDeserializer.stringDeserializer(), "query");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::elasticsearchVersion, JsonpDeserializer.stringDeserializer(), "elasticsearch_version");

	}

}
