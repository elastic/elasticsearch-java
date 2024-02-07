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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._types.IndicesOptions;
import co.elastic.clients.elasticsearch._types.SearchType;
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
import java.lang.Boolean;
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

// typedef: watcher._types.SearchInputRequestDefinition

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#watcher._types.SearchInputRequestDefinition">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchInputRequestDefinition implements JsonpSerializable {
	@Nullable
	private final SearchInputRequestBody body;

	private final List<String> indices;

	@Nullable
	private final IndicesOptions indicesOptions;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final SearchTemplateRequestBody template;

	@Nullable
	private final Boolean restTotalHitsAsInt;

	// ---------------------------------------------------------------------------------------------

	private SearchInputRequestDefinition(Builder builder) {

		this.body = builder.body;
		this.indices = ApiTypeHelper.unmodifiable(builder.indices);
		this.indicesOptions = builder.indicesOptions;
		this.searchType = builder.searchType;
		this.template = builder.template;
		this.restTotalHitsAsInt = builder.restTotalHitsAsInt;

	}

	public static SearchInputRequestDefinition of(Function<Builder, ObjectBuilder<SearchInputRequestDefinition>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code body}
	 */
	@Nullable
	public final SearchInputRequestBody body() {
		return this.body;
	}

	/**
	 * API name: {@code indices}
	 */
	public final List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code indices_options}
	 */
	@Nullable
	public final IndicesOptions indicesOptions() {
		return this.indicesOptions;
	}

	/**
	 * API name: {@code search_type}
	 */
	@Nullable
	public final SearchType searchType() {
		return this.searchType;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public final SearchTemplateRequestBody template() {
		return this.template;
	}

	/**
	 * API name: {@code rest_total_hits_as_int}
	 */
	@Nullable
	public final Boolean restTotalHitsAsInt() {
		return this.restTotalHitsAsInt;
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

		if (this.body != null) {
			generator.writeKey("body");
			this.body.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.indices)) {
			generator.writeKey("indices");
			generator.writeStartArray();
			for (String item0 : this.indices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.indicesOptions != null) {
			generator.writeKey("indices_options");
			this.indicesOptions.serialize(generator, mapper);

		}
		if (this.searchType != null) {
			generator.writeKey("search_type");
			this.searchType.serialize(generator, mapper);
		}
		if (this.template != null) {
			generator.writeKey("template");
			this.template.serialize(generator, mapper);

		}
		if (this.restTotalHitsAsInt != null) {
			generator.writeKey("rest_total_hits_as_int");
			generator.write(this.restTotalHitsAsInt);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchInputRequestDefinition}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchInputRequestDefinition> {
		@Nullable
		private SearchInputRequestBody body;

		@Nullable
		private List<String> indices;

		@Nullable
		private IndicesOptions indicesOptions;

		@Nullable
		private SearchType searchType;

		@Nullable
		private SearchTemplateRequestBody template;

		@Nullable
		private Boolean restTotalHitsAsInt;

		/**
		 * API name: {@code body}
		 */
		public final Builder body(@Nullable SearchInputRequestBody value) {
			this.body = value;
			return this;
		}

		/**
		 * API name: {@code body}
		 */
		public final Builder body(Function<SearchInputRequestBody.Builder, ObjectBuilder<SearchInputRequestBody>> fn) {
			return this.body(fn.apply(new SearchInputRequestBody.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>indices</code>.
		 */
		public final Builder indices(List<String> list) {
			this.indices = _listAddAll(this.indices, list);
			return this;
		}

		/**
		 * API name: {@code indices}
		 * <p>
		 * Adds one or more values to <code>indices</code>.
		 */
		public final Builder indices(String value, String... values) {
			this.indices = _listAdd(this.indices, value, values);
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(@Nullable IndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public final Builder indicesOptions(Function<IndicesOptions.Builder, ObjectBuilder<IndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new IndicesOptions.Builder()).build());
		}

		/**
		 * API name: {@code search_type}
		 */
		public final Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(@Nullable SearchTemplateRequestBody value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public final Builder template(
				Function<SearchTemplateRequestBody.Builder, ObjectBuilder<SearchTemplateRequestBody>> fn) {
			return this.template(fn.apply(new SearchTemplateRequestBody.Builder()).build());
		}

		/**
		 * API name: {@code rest_total_hits_as_int}
		 */
		public final Builder restTotalHitsAsInt(@Nullable Boolean value) {
			this.restTotalHitsAsInt = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchInputRequestDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchInputRequestDefinition build() {
			_checkSingleUse();

			return new SearchInputRequestDefinition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchInputRequestDefinition}
	 */
	public static final JsonpDeserializer<SearchInputRequestDefinition> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchInputRequestDefinition::setupSearchInputRequestDefinitionDeserializer);

	protected static void setupSearchInputRequestDefinitionDeserializer(
			ObjectDeserializer<SearchInputRequestDefinition.Builder> op) {

		op.add(Builder::body, SearchInputRequestBody._DESERIALIZER, "body");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indicesOptions, IndicesOptions._DESERIALIZER, "indices_options");
		op.add(Builder::searchType, SearchType._DESERIALIZER, "search_type");
		op.add(Builder::template, SearchTemplateRequestBody._DESERIALIZER, "template");
		op.add(Builder::restTotalHitsAsInt, JsonpDeserializer.booleanDeserializer(), "rest_total_hits_as_int");

	}

}
