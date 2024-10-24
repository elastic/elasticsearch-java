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

package co.elastic.clients.elasticsearch.connector;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: connector._types.FilteringAdvancedSnippet

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.FilteringAdvancedSnippet">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilteringAdvancedSnippet implements JsonpSerializable {
	@Nullable
	private final DateTime createdAt;

	@Nullable
	private final DateTime updatedAt;

	private final JsonData value;

	// ---------------------------------------------------------------------------------------------

	private FilteringAdvancedSnippet(Builder builder) {

		this.createdAt = builder.createdAt;
		this.updatedAt = builder.updatedAt;
		this.value = ApiTypeHelper.requireNonNull(builder.value, this, "value");

	}

	public static FilteringAdvancedSnippet of(Function<Builder, ObjectBuilder<FilteringAdvancedSnippet>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code created_at}
	 */
	@Nullable
	public final DateTime createdAt() {
		return this.createdAt;
	}

	/**
	 * API name: {@code updated_at}
	 */
	@Nullable
	public final DateTime updatedAt() {
		return this.updatedAt;
	}

	/**
	 * Required - API name: {@code value}
	 */
	public final JsonData value() {
		return this.value;
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

		if (this.createdAt != null) {
			generator.writeKey("created_at");
			this.createdAt.serialize(generator, mapper);
		}
		if (this.updatedAt != null) {
			generator.writeKey("updated_at");
			this.updatedAt.serialize(generator, mapper);
		}
		generator.writeKey("value");
		this.value.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilteringAdvancedSnippet}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<FilteringAdvancedSnippet> {
		@Nullable
		private DateTime createdAt;

		@Nullable
		private DateTime updatedAt;

		private JsonData value;

		/**
		 * API name: {@code created_at}
		 */
		public final Builder createdAt(@Nullable DateTime value) {
			this.createdAt = value;
			return this;
		}

		/**
		 * API name: {@code updated_at}
		 */
		public final Builder updatedAt(@Nullable DateTime value) {
			this.updatedAt = value;
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
		 * Builds a {@link FilteringAdvancedSnippet}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilteringAdvancedSnippet build() {
			_checkSingleUse();

			return new FilteringAdvancedSnippet(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilteringAdvancedSnippet}
	 */
	public static final JsonpDeserializer<FilteringAdvancedSnippet> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FilteringAdvancedSnippet::setupFilteringAdvancedSnippetDeserializer);

	protected static void setupFilteringAdvancedSnippetDeserializer(
			ObjectDeserializer<FilteringAdvancedSnippet.Builder> op) {

		op.add(Builder::createdAt, DateTime._DESERIALIZER, "created_at");
		op.add(Builder::updatedAt, DateTime._DESERIALIZER, "updated_at");
		op.add(Builder::value, JsonData._DESERIALIZER, "value");

	}

}
