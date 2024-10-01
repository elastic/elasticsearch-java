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

// typedef: _global.search._types.DfsProfile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.DfsProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class DfsProfile implements JsonpSerializable {
	@Nullable
	private final DfsStatisticsProfile statistics;

	private final List<DfsKnnProfile> knn;

	// ---------------------------------------------------------------------------------------------

	private DfsProfile(Builder builder) {

		this.statistics = builder.statistics;
		this.knn = ApiTypeHelper.unmodifiable(builder.knn);

	}

	public static DfsProfile of(Function<Builder, ObjectBuilder<DfsProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code statistics}
	 */
	@Nullable
	public final DfsStatisticsProfile statistics() {
		return this.statistics;
	}

	/**
	 * API name: {@code knn}
	 */
	public final List<DfsKnnProfile> knn() {
		return this.knn;
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

		if (this.statistics != null) {
			generator.writeKey("statistics");
			this.statistics.serialize(generator, mapper);

		}
		if (ApiTypeHelper.isDefined(this.knn)) {
			generator.writeKey("knn");
			generator.writeStartArray();
			for (DfsKnnProfile item0 : this.knn) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link DfsProfile}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DfsProfile> {
		@Nullable
		private DfsStatisticsProfile statistics;

		@Nullable
		private List<DfsKnnProfile> knn;

		/**
		 * API name: {@code statistics}
		 */
		public final Builder statistics(@Nullable DfsStatisticsProfile value) {
			this.statistics = value;
			return this;
		}

		/**
		 * API name: {@code statistics}
		 */
		public final Builder statistics(
				Function<DfsStatisticsProfile.Builder, ObjectBuilder<DfsStatisticsProfile>> fn) {
			return this.statistics(fn.apply(new DfsStatisticsProfile.Builder()).build());
		}

		/**
		 * API name: {@code knn}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>knn</code>.
		 */
		public final Builder knn(List<DfsKnnProfile> list) {
			this.knn = _listAddAll(this.knn, list);
			return this;
		}

		/**
		 * API name: {@code knn}
		 * <p>
		 * Adds one or more values to <code>knn</code>.
		 */
		public final Builder knn(DfsKnnProfile value, DfsKnnProfile... values) {
			this.knn = _listAdd(this.knn, value, values);
			return this;
		}

		/**
		 * API name: {@code knn}
		 * <p>
		 * Adds a value to <code>knn</code> using a builder lambda.
		 */
		public final Builder knn(Function<DfsKnnProfile.Builder, ObjectBuilder<DfsKnnProfile>> fn) {
			return knn(fn.apply(new DfsKnnProfile.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DfsProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DfsProfile build() {
			_checkSingleUse();

			return new DfsProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DfsProfile}
	 */
	public static final JsonpDeserializer<DfsProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DfsProfile::setupDfsProfileDeserializer);

	protected static void setupDfsProfileDeserializer(ObjectDeserializer<DfsProfile.Builder> op) {

		op.add(Builder::statistics, DfsStatisticsProfile._DESERIALIZER, "statistics");
		op.add(Builder::knn, JsonpDeserializer.arrayDeserializer(DfsKnnProfile._DESERIALIZER), "knn");

	}

}
