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
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.SearchInput
@JsonpDeserializable
public final class SearchInput implements InputVariant, JsonpSerializable {
	@Nullable
	private final List<String> extract;

	private final SearchInputRequestDefinition request;

	@Nullable
	private final String timeout;

	// ---------------------------------------------------------------------------------------------

	public SearchInput(Builder builder) {

		this.extract = ModelTypeHelper.unmodifiable(builder.extract);
		this.request = Objects.requireNonNull(builder.request, "request");
		this.timeout = builder.timeout;

	}

	public SearchInput(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * {@link Input} variant type
	 */
	@Override
	public String _variantType() {
		return "search";
	}

	/**
	 * API name: {@code extract}
	 */
	@Nullable
	public List<String> extract() {
		return this.extract;
	}

	/**
	 * API name: {@code request}
	 */
	public SearchInputRequestDefinition request() {
		return this.request;
	}

	/**
	 * API name: {@code timeout}
	 */
	@Nullable
	public String timeout() {
		return this.timeout;
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

		if (this.extract != null) {

			generator.writeKey("extract");
			generator.writeStartArray();
			for (String item0 : this.extract) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

		generator.writeKey("request");
		this.request.serialize(generator, mapper);

		if (this.timeout != null) {

			generator.writeKey("timeout");
			generator.write(this.timeout);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchInput}.
	 */
	public static class Builder implements ObjectBuilder<SearchInput> {
		@Nullable
		private List<String> extract;

		private SearchInputRequestDefinition request;

		@Nullable
		private String timeout;

		/**
		 * API name: {@code extract}
		 */
		public Builder extract(@Nullable List<String> value) {
			this.extract = value;
			return this;
		}

		/**
		 * API name: {@code extract}
		 */
		public Builder extract(String... value) {
			this.extract = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #extract(List)}, creating the list if needed. 4
		 */
		public Builder addExtract(String value) {
			if (this.extract == null) {
				this.extract = new ArrayList<>();
			}
			this.extract.add(value);
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public Builder request(SearchInputRequestDefinition value) {
			this.request = value;
			return this;
		}

		/**
		 * API name: {@code request}
		 */
		public Builder request(
				Function<SearchInputRequestDefinition.Builder, ObjectBuilder<SearchInputRequestDefinition>> fn) {
			return this.request(fn.apply(new SearchInputRequestDefinition.Builder()).build());
		}

		/**
		 * API name: {@code timeout}
		 */
		public Builder timeout(@Nullable String value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Builds a {@link SearchInput}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchInput build() {

			return new SearchInput(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchInput}
	 */
	public static final JsonpDeserializer<SearchInput> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchInput::setupSearchInputDeserializer, Builder::build);

	protected static void setupSearchInputDeserializer(DelegatingDeserializer<SearchInput.Builder> op) {

		op.add(Builder::extract, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"extract");
		op.add(Builder::request, SearchInputRequestDefinition._DESERIALIZER, "request");
		op.add(Builder::timeout, JsonpDeserializer.stringDeserializer(), "timeout");

	}

}
