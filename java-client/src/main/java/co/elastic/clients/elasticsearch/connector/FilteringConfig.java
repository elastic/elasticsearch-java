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

// typedef: connector._types.FilteringConfig

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#connector._types.FilteringConfig">API
 *      specification</a>
 */
@JsonpDeserializable
public class FilteringConfig implements JsonpSerializable {
	private final FilteringRules active;

	@Nullable
	private final String domain;

	private final FilteringRules draft;

	// ---------------------------------------------------------------------------------------------

	private FilteringConfig(Builder builder) {

		this.active = ApiTypeHelper.requireNonNull(builder.active, this, "active");
		this.domain = builder.domain;
		this.draft = ApiTypeHelper.requireNonNull(builder.draft, this, "draft");

	}

	public static FilteringConfig of(Function<Builder, ObjectBuilder<FilteringConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code active}
	 */
	public final FilteringRules active() {
		return this.active;
	}

	/**
	 * API name: {@code domain}
	 */
	@Nullable
	public final String domain() {
		return this.domain;
	}

	/**
	 * Required - API name: {@code draft}
	 */
	public final FilteringRules draft() {
		return this.draft;
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

		generator.writeKey("active");
		this.active.serialize(generator, mapper);

		if (this.domain != null) {
			generator.writeKey("domain");
			generator.write(this.domain);

		}
		generator.writeKey("draft");
		this.draft.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FilteringConfig}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FilteringConfig> {
		private FilteringRules active;

		@Nullable
		private String domain;

		private FilteringRules draft;

		/**
		 * Required - API name: {@code active}
		 */
		public final Builder active(FilteringRules value) {
			this.active = value;
			return this;
		}

		/**
		 * Required - API name: {@code active}
		 */
		public final Builder active(Function<FilteringRules.Builder, ObjectBuilder<FilteringRules>> fn) {
			return this.active(fn.apply(new FilteringRules.Builder()).build());
		}

		/**
		 * API name: {@code domain}
		 */
		public final Builder domain(@Nullable String value) {
			this.domain = value;
			return this;
		}

		/**
		 * Required - API name: {@code draft}
		 */
		public final Builder draft(FilteringRules value) {
			this.draft = value;
			return this;
		}

		/**
		 * Required - API name: {@code draft}
		 */
		public final Builder draft(Function<FilteringRules.Builder, ObjectBuilder<FilteringRules>> fn) {
			return this.draft(fn.apply(new FilteringRules.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FilteringConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FilteringConfig build() {
			_checkSingleUse();

			return new FilteringConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FilteringConfig}
	 */
	public static final JsonpDeserializer<FilteringConfig> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FilteringConfig::setupFilteringConfigDeserializer);

	protected static void setupFilteringConfigDeserializer(ObjectDeserializer<FilteringConfig.Builder> op) {

		op.add(Builder::active, FilteringRules._DESERIALIZER, "active");
		op.add(Builder::domain, JsonpDeserializer.stringDeserializer(), "domain");
		op.add(Builder::draft, FilteringRules._DESERIALIZER, "draft");

	}

}
