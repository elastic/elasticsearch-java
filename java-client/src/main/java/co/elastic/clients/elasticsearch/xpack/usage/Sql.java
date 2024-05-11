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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
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

// typedef: xpack.usage.Sql

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Sql">API
 *      specification</a>
 */
@JsonpDeserializable
public class Sql extends Base {
	private final Map<String, Integer> features;

	private final Map<String, XpackUsageQuery> queries;

	// ---------------------------------------------------------------------------------------------

	private Sql(Builder builder) {
		super(builder);

		this.features = ApiTypeHelper.unmodifiableRequired(builder.features, this, "features");
		this.queries = ApiTypeHelper.unmodifiableRequired(builder.queries, this, "queries");

	}

	public static Sql of(Function<Builder, ObjectBuilder<Sql>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code features}
	 */
	public final Map<String, Integer> features() {
		return this.features;
	}

	/**
	 * Required - API name: {@code queries}
	 */
	public final Map<String, XpackUsageQuery> queries() {
		return this.queries;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ApiTypeHelper.isDefined(this.features)) {
			generator.writeKey("features");
			generator.writeStartObject();
			for (Map.Entry<String, Integer> item0 : this.features.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.queries)) {
			generator.writeKey("queries");
			generator.writeStartObject();
			for (Map.Entry<String, XpackUsageQuery> item0 : this.queries.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Sql}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Sql> {
		private Map<String, Integer> features;

		private Map<String, XpackUsageQuery> queries;

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>features</code>.
		 */
		public final Builder features(Map<String, Integer> map) {
			this.features = _mapPutAll(this.features, map);
			return this;
		}

		/**
		 * Required - API name: {@code features}
		 * <p>
		 * Adds an entry to <code>features</code>.
		 */
		public final Builder features(String key, Integer value) {
			this.features = _mapPut(this.features, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>queries</code>.
		 */
		public final Builder queries(Map<String, XpackUsageQuery> map) {
			this.queries = _mapPutAll(this.queries, map);
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds an entry to <code>queries</code>.
		 */
		public final Builder queries(String key, XpackUsageQuery value) {
			this.queries = _mapPut(this.queries, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code queries}
		 * <p>
		 * Adds an entry to <code>queries</code> using a builder lambda.
		 */
		public final Builder queries(String key, Function<XpackUsageQuery.Builder, ObjectBuilder<XpackUsageQuery>> fn) {
			return queries(key, fn.apply(new XpackUsageQuery.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Sql}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Sql build() {
			_checkSingleUse();

			return new Sql(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Sql}
	 */
	public static final JsonpDeserializer<Sql> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Sql::setupSqlDeserializer);

	protected static void setupSqlDeserializer(ObjectDeserializer<Sql.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::features, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.integerDeserializer()),
				"features");
		op.add(Builder::queries, JsonpDeserializer.stringMapDeserializer(XpackUsageQuery._DESERIALIZER), "queries");

	}

}
