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

import co.elastic.clients.elasticsearch._types.Script;
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

// typedef: search_application._types.SearchApplicationTemplate

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application._types.SearchApplicationTemplate">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchApplicationTemplate implements JsonpSerializable {
	private final Script script;

	// ---------------------------------------------------------------------------------------------

	private SearchApplicationTemplate(Builder builder) {

		this.script = ApiTypeHelper.requireNonNull(builder.script, this, "script");

	}

	public static SearchApplicationTemplate of(Function<Builder, ObjectBuilder<SearchApplicationTemplate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The associated mustache template.
	 * <p>
	 * API name: {@code script}
	 */
	public final Script script() {
		return this.script;
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

		generator.writeKey("script");
		this.script.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchApplicationTemplate}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SearchApplicationTemplate> {
		private Script script;

		/**
		 * Required - The associated mustache template.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Script value) {
			this.script = value;
			return this;
		}

		/**
		 * Required - The associated mustache template.
		 * <p>
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchApplicationTemplate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchApplicationTemplate build() {
			_checkSingleUse();

			return new SearchApplicationTemplate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchApplicationTemplate}
	 */
	public static final JsonpDeserializer<SearchApplicationTemplate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchApplicationTemplate::setupSearchApplicationTemplateDeserializer);

	protected static void setupSearchApplicationTemplateDeserializer(
			ObjectDeserializer<SearchApplicationTemplate.Builder> op) {

		op.add(Builder::script, Script._DESERIALIZER, "script");

	}

}
