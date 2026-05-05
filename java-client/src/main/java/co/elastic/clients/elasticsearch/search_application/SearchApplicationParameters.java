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

package co.elastic.clients.elasticsearch.search_application;

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

// typedef: search_application._types.SearchApplicationParameters

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application._types.SearchApplicationParameters">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchApplicationParameters implements JsonpSerializable {
	private final List<String> indices;

	@Nullable
	private final String analyticsCollectionName;

	@Nullable
	private final SearchApplicationTemplate template;

	// ---------------------------------------------------------------------------------------------

	protected SearchApplicationParameters(AbstractBuilder<?> builder) {

		this.indices = ApiTypeHelper.unmodifiableRequired(builder.indices, this, "indices");
		this.analyticsCollectionName = builder.analyticsCollectionName;
		this.template = builder.template;

	}

	public static SearchApplicationParameters searchApplicationParametersOf(
			Function<Builder, ObjectBuilder<SearchApplicationParameters>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Indices that are part of the Search Application.
	 * <p>
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * Analytics collection associated to the Search Application.
	 * <p>
	 * API name: {@code analytics_collection_name}
	 */
	@Nullable
	public final String analyticsCollectionName() {
		return this.analyticsCollectionName;
	}

	/**
	 * Search template to use on search operations.
	 * <p>
	 * API name: {@code template}
	 */
	@Nullable
	public final SearchApplicationTemplate template() {
		return this.template;
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

		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.analyticsCollectionName != null) {
			generator.writeKey("analytics_collection_name");
			generator.write(this.analyticsCollectionName);

		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchApplicationParameters}.
	 */

	public static class Builder extends SearchApplicationParameters.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SearchApplicationParameters> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchApplicationParameters}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchApplicationParameters build() {
			_checkSingleUse();

			return new SearchApplicationParameters(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private List<String> indices;

		@Nullable
		private String analyticsCollectionName;

		@Nullable
		private SearchApplicationTemplate template;

		/**
		 * Required - Indices that are part of the Search Application.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final BuilderT indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return self();
		}

		/**
		 * Required - Indices that are part of the Search Application.
		 * <p>
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final BuilderT indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return self();
		}

		/**
		 * Analytics collection associated to the Search Application.
		 * <p>
		 * API name: {@code analytics_collection_name}
		 */
		public final BuilderT analyticsCollectionName(@Nullable String value) {
			this.analyticsCollectionName = value;
			return self();
		}

		/**
		 * Search template to use on search operations.
		 * <p>
		 * API name: {@code template}
		 */
		public final BuilderT template(@Nullable SearchApplicationTemplate value) {
			this.template = value;
			return self();
		}

		/**
		 * Search template to use on search operations.
		 * <p>
		 * API name: {@code template}
		 */
		public final BuilderT template(
				Function<SearchApplicationTemplate.Builder, ObjectBuilder<SearchApplicationTemplate>> fn) {
			return this.template(fn.apply(new SearchApplicationTemplate.Builder()).build());
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchApplicationParameters}
	 */
	public static final JsonpDeserializer<SearchApplicationParameters> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchApplicationParameters::setupSearchApplicationParametersDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSearchApplicationParametersDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(AbstractBuilder::analyticsCollectionName, JsonpDeserializer.stringDeserializer(),
				"analytics_collection_name");
		op.add(AbstractBuilder::template, SearchApplicationTemplate._DESERIALIZER, "template");

	}

}
