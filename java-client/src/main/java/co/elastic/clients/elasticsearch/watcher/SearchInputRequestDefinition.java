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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.elasticsearch._core.SearchTemplateRequest;
import co.elastic.clients.elasticsearch._types.SearchType;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
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

// typedef: watcher._types.SearchInputRequestDefinition
@JsonpDeserializable
public final class SearchInputRequestDefinition implements JsonpSerializable {
	@Nullable
	private final SearchInputRequestBody body;

	@Nullable
	private final List<String> indices;

	@Nullable
	private final IndicesOptions indicesOptions;

	@Nullable
	private final SearchType searchType;

	@Nullable
	private final SearchTemplateRequest template;

	@Nullable
	private final Boolean restTotalHitsAsInt;

	// ---------------------------------------------------------------------------------------------

	public SearchInputRequestDefinition(Builder builder) {

		this.body = builder.body;
		this.indices = ModelTypeHelper.unmodifiable(builder.indices);
		this.indicesOptions = builder.indicesOptions;
		this.searchType = builder.searchType;
		this.template = builder.template;
		this.restTotalHitsAsInt = builder.restTotalHitsAsInt;

	}

	public SearchInputRequestDefinition(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code body}
	 */
	@Nullable
	public SearchInputRequestBody body() {
		return this.body;
	}

	/**
	 * API name: {@code indices}
	 */
	@Nullable
	public List<String> indices() {
		return this.indices;
	}

	/**
	 * API name: {@code indices_options}
	 */
	@Nullable
	public IndicesOptions indicesOptions() {
		return this.indicesOptions;
	}

	/**
	 * API name: {@code search_type}
	 */
	@Nullable
	public SearchType searchType() {
		return this.searchType;
	}

	/**
	 * API name: {@code template}
	 */
	@Nullable
	public SearchTemplateRequest template() {
		return this.template;
	}

	/**
	 * API name: {@code rest_total_hits_as_int}
	 */
	@Nullable
	public Boolean restTotalHitsAsInt() {
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
		if (this.indices != null) {

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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchInputRequestDefinition}.
	 */
	public static class Builder implements ObjectBuilder<SearchInputRequestDefinition> {
		@Nullable
		private SearchInputRequestBody body;

		@Nullable
		private List<String> indices;

		@Nullable
		private IndicesOptions indicesOptions;

		@Nullable
		private SearchType searchType;

		@Nullable
		private SearchTemplateRequest template;

		@Nullable
		private Boolean restTotalHitsAsInt;

		/**
		 * API name: {@code body}
		 */
		public Builder body(@Nullable SearchInputRequestBody value) {
			this.body = value;
			return this;
		}

		/**
		 * API name: {@code body}
		 */
		public Builder body(Function<SearchInputRequestBody.Builder, ObjectBuilder<SearchInputRequestBody>> fn) {
			return this.body(fn.apply(new SearchInputRequestBody.Builder()).build());
		}

		/**
		 * API name: {@code indices}
		 */
		public Builder indices(@Nullable List<String> value) {
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
		 * Add a value to {@link #indices(List)}, creating the list if needed. 4
		 */
		public Builder addIndices(String value) {
			if (this.indices == null) {
				this.indices = new ArrayList<>();
			}
			this.indices.add(value);
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public Builder indicesOptions(@Nullable IndicesOptions value) {
			this.indicesOptions = value;
			return this;
		}

		/**
		 * API name: {@code indices_options}
		 */
		public Builder indicesOptions(Function<IndicesOptions.Builder, ObjectBuilder<IndicesOptions>> fn) {
			return this.indicesOptions(fn.apply(new IndicesOptions.Builder()).build());
		}

		/**
		 * API name: {@code search_type}
		 */
		public Builder searchType(@Nullable SearchType value) {
			this.searchType = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(@Nullable SearchTemplateRequest value) {
			this.template = value;
			return this;
		}

		/**
		 * API name: {@code template}
		 */
		public Builder template(Function<SearchTemplateRequest.Builder, ObjectBuilder<SearchTemplateRequest>> fn) {
			return this.template(fn.apply(new SearchTemplateRequest.Builder()).build());
		}

		/**
		 * API name: {@code rest_total_hits_as_int}
		 */
		public Builder restTotalHitsAsInt(@Nullable Boolean value) {
			this.restTotalHitsAsInt = value;
			return this;
		}

		/**
		 * Builds a {@link SearchInputRequestDefinition}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchInputRequestDefinition build() {

			return new SearchInputRequestDefinition(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchInputRequestDefinition}
	 */
	public static final JsonpDeserializer<SearchInputRequestDefinition> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, SearchInputRequestDefinition::setupSearchInputRequestDefinitionDeserializer, Builder::build);

	protected static void setupSearchInputRequestDefinitionDeserializer(
			DelegatingDeserializer<SearchInputRequestDefinition.Builder> op) {

		op.add(Builder::body, SearchInputRequestBody._DESERIALIZER, "body");
		op.add(Builder::indices, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"indices");
		op.add(Builder::indicesOptions, IndicesOptions._DESERIALIZER, "indices_options");
		op.add(Builder::searchType, SearchType._DESERIALIZER, "search_type");
		op.add(Builder::template, SearchTemplateRequest._DESERIALIZER, "template");
		op.add(Builder::restTotalHitsAsInt, JsonpDeserializer.booleanDeserializer(), "rest_total_hits_as_int");

	}

}
