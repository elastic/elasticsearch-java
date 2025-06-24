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

package co.elastic.clients.elasticsearch.core.search;

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

// typedef: _global.search._types.SourceFilter

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.SourceFilter">API
 *      specification</a>
 */
@JsonpDeserializable
public class SourceFilter implements JsonpSerializable {
	@Nullable
	private final Boolean excludeVectors;

	private final List<String> excludes;

	private final List<String> includes;

	// ---------------------------------------------------------------------------------------------

	private SourceFilter(Builder builder) {

		this.excludeVectors = builder.excludeVectors;
		this.excludes = ApiTypeHelper.unmodifiable(builder.excludes);
		this.includes = ApiTypeHelper.unmodifiable(builder.includes);

	}

	public static SourceFilter of(Function<Builder, ObjectBuilder<SourceFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * If <code>true</code>, vector fields are excluded from the returned source.
	 * <p>
	 * This option takes precedence over <code>includes</code>: any vector field
	 * will remain excluded even if it matches an <code>includes</code> rule.
	 * <p>
	 * API name: {@code exclude_vectors}
	 */
	@Nullable
	public final Boolean excludeVectors() {
		return this.excludeVectors;
	}

	/**
	 * A list of fields to exclude from the returned source.
	 * <p>
	 * API name: {@code excludes}
	 */
	public final List<String> excludes() {
		return this.excludes;
	}

	/**
	 * A list of fields to include in the returned source.
	 * <p>
	 * API name: {@code includes}
	 */
	public final List<String> includes() {
		return this.includes;
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

		if (this.excludeVectors != null) {
			generator.writeKey("exclude_vectors");
			generator.write(this.excludeVectors);

		}
		if (ApiTypeHelper.isDefined(this.excludes)) {
			generator.writeKey("excludes");
			generator.writeStartArray();
			for (String item0 : this.excludes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.includes)) {
			generator.writeKey("includes");
			generator.writeStartArray();
			for (String item0 : this.includes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SourceFilter}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SourceFilter> {
		@Nullable
		private Boolean excludeVectors;

		@Nullable
		private List<String> excludes;

		@Nullable
		private List<String> includes;

		/**
		 * If <code>true</code>, vector fields are excluded from the returned source.
		 * <p>
		 * This option takes precedence over <code>includes</code>: any vector field
		 * will remain excluded even if it matches an <code>includes</code> rule.
		 * <p>
		 * API name: {@code exclude_vectors}
		 */
		public final Builder excludeVectors(@Nullable Boolean value) {
			this.excludeVectors = value;
			return this;
		}

		/**
		 * A list of fields to exclude from the returned source.
		 * <p>
		 * API name: {@code excludes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>excludes</code>.
		 */
		public final Builder excludes(List<String> list) {
			this.excludes = _listAddAll(this.excludes, list);
			return this;
		}

		/**
		 * A list of fields to exclude from the returned source.
		 * <p>
		 * API name: {@code excludes}
		 * <p>
		 * Adds one or more values to <code>excludes</code>.
		 */
		public final Builder excludes(String value, String... values) {
			this.excludes = _listAdd(this.excludes, value, values);
			return this;
		}

		/**
		 * A list of fields to include in the returned source.
		 * <p>
		 * API name: {@code includes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>includes</code>.
		 */
		public final Builder includes(List<String> list) {
			this.includes = _listAddAll(this.includes, list);
			return this;
		}

		/**
		 * A list of fields to include in the returned source.
		 * <p>
		 * API name: {@code includes}
		 * <p>
		 * Adds one or more values to <code>includes</code>.
		 */
		public final Builder includes(String value, String... values) {
			this.includes = _listAdd(this.includes, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SourceFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SourceFilter build() {
			_checkSingleUse();

			return new SourceFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SourceFilter}
	 */
	public static final JsonpDeserializer<SourceFilter> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SourceFilter::setupSourceFilterDeserializer);

	protected static void setupSourceFilterDeserializer(ObjectDeserializer<SourceFilter.Builder> op) {

		op.add(Builder::excludeVectors, JsonpDeserializer.booleanDeserializer(), "exclude_vectors");
		op.add(Builder::excludes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"excludes", "exclude");
		op.add(Builder::includes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"includes", "include");

		op.shortcutProperty("includes");

	}

}
