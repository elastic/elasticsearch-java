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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: search_application._types.SearchApplication

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#search_application._types.SearchApplication">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchApplication extends SearchApplicationParameters {
	private final String name;

	private final long updatedAtMillis;

	// ---------------------------------------------------------------------------------------------

	protected SearchApplication(AbstractBuilder<?> builder) {
		super(builder);

		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.updatedAtMillis = ApiTypeHelper.requireNonNull(builder.updatedAtMillis, this, "updatedAtMillis", 0);

	}

	public static SearchApplication searchApplicationOf(Function<Builder, ObjectBuilder<SearchApplication>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Search Application name
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - Last time the Search Application was updated.
	 * <p>
	 * API name: {@code updated_at_millis}
	 */
	public final long updatedAtMillis() {
		return this.updatedAtMillis;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("updated_at_millis");
		generator.write(this.updatedAtMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchApplication}.
	 */

	public static class Builder extends SearchApplication.AbstractBuilder<Builder>
			implements
				ObjectBuilder<SearchApplication> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchApplication}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchApplication build() {
			_checkSingleUse();

			return new SearchApplication(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				SearchApplicationParameters.AbstractBuilder<BuilderT> {
		private String name;

		private Long updatedAtMillis;

		/**
		 * Required - Search Application name
		 * <p>
		 * API name: {@code name}
		 */
		public final BuilderT name(String value) {
			this.name = value;
			return self();
		}

		/**
		 * Required - Last time the Search Application was updated.
		 * <p>
		 * API name: {@code updated_at_millis}
		 */
		public final BuilderT updatedAtMillis(long value) {
			this.updatedAtMillis = value;
			return self();
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchApplication}
	 */
	public static final JsonpDeserializer<SearchApplication> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SearchApplication::setupSearchApplicationDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupSearchApplicationDeserializer(
			ObjectDeserializer<BuilderT> op) {
		SearchApplicationParameters.setupSearchApplicationParametersDeserializer(op);
		op.add(AbstractBuilder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(AbstractBuilder::updatedAtMillis, JsonpDeserializer.longDeserializer(), "updated_at_millis");

	}

}
