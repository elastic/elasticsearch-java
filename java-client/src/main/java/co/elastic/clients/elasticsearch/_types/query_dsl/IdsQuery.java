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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
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

// typedef: _types.query_dsl.IdsQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.IdsQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class IdsQuery extends QueryBase implements QueryVariant {
	private final List<String> values;

	// ---------------------------------------------------------------------------------------------

	private IdsQuery(Builder builder) {
		super(builder);

		this.values = ApiTypeHelper.unmodifiable(builder.values);

	}

	public static IdsQuery of(Function<Builder, ObjectBuilder<IdsQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Ids;
	}

	/**
	 * API name: {@code values}
	 */
	public final List<String> values() {
		return this.values;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.values)) {
			generator.writeKey("values");
			generator.writeStartArray();
			for (String item0 : this.values) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IdsQuery}.
	 */

	public static class Builder extends QueryBase.AbstractBuilder<Builder> implements ObjectBuilder<IdsQuery> {
		@Nullable
		private List<String> values;

		/**
		 * API name: {@code values}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>values</code>.
		 */
		public final Builder values(List<String> list) {
			this.values = _listAddAll(this.values, list);
			return this;
		}

		/**
		 * API name: {@code values}
		 * <p>
		 * Adds one or more values to <code>values</code>.
		 */
		public final Builder values(String value, String... values) {
			this.values = _listAdd(this.values, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IdsQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IdsQuery build() {
			_checkSingleUse();

			return new IdsQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IdsQuery}
	 */
	public static final JsonpDeserializer<IdsQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			IdsQuery::setupIdsQueryDeserializer);

	protected static void setupIdsQueryDeserializer(ObjectDeserializer<IdsQuery.Builder> op) {
		QueryBase.setupQueryBaseDeserializer(op);
		op.add(Builder::values, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "values");

	}

}
