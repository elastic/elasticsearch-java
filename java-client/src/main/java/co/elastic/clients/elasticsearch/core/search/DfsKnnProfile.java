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
import java.lang.Long;
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

// typedef: _global.search._types.DfsKnnProfile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.DfsKnnProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class DfsKnnProfile implements JsonpSerializable {
	@Nullable
	private final Long vectorOperationsCount;

	private final List<KnnQueryProfileResult> query;

	private final long rewriteTime;

	private final List<KnnCollectorResult> collector;

	// ---------------------------------------------------------------------------------------------

	private DfsKnnProfile(Builder builder) {

		this.vectorOperationsCount = builder.vectorOperationsCount;
		this.query = ApiTypeHelper.unmodifiableRequired(builder.query, this, "query");
		this.rewriteTime = ApiTypeHelper.requireNonNull(builder.rewriteTime, this, "rewriteTime");
		this.collector = ApiTypeHelper.unmodifiableRequired(builder.collector, this, "collector");

	}

	public static DfsKnnProfile of(Function<Builder, ObjectBuilder<DfsKnnProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code vector_operations_count}
	 */
	@Nullable
	public final Long vectorOperationsCount() {
		return this.vectorOperationsCount;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final List<KnnQueryProfileResult> query() {
		return this.query;
	}

	/**
	 * Required - API name: {@code rewrite_time}
	 */
	public final long rewriteTime() {
		return this.rewriteTime;
	}

	/**
	 * Required - API name: {@code collector}
	 */
	public final List<KnnCollectorResult> collector() {
		return this.collector;
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

		if (this.vectorOperationsCount != null) {
			generator.writeKey("vector_operations_count");
			generator.write(this.vectorOperationsCount);

		}
		if (ApiTypeHelper.isDefined(this.query)) {
			generator.writeKey("query");
			generator.writeStartArray();
			for (KnnQueryProfileResult item0 : this.query) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("rewrite_time");
		generator.write(this.rewriteTime);

		if (ApiTypeHelper.isDefined(this.collector)) {
			generator.writeKey("collector");
			generator.writeStartArray();
			for (KnnCollectorResult item0 : this.collector) {
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
	 * Builder for {@link DfsKnnProfile}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DfsKnnProfile> {
		@Nullable
		private Long vectorOperationsCount;

		private List<KnnQueryProfileResult> query;

		private Long rewriteTime;

		private List<KnnCollectorResult> collector;

		/**
		 * API name: {@code vector_operations_count}
		 */
		public final Builder vectorOperationsCount(@Nullable Long value) {
			this.vectorOperationsCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>query</code>.
		 */
		public final Builder query(List<KnnQueryProfileResult> list) {
			this.query = _listAddAll(this.query, list);
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 * <p>
		 * Adds one or more values to <code>query</code>.
		 */
		public final Builder query(KnnQueryProfileResult value, KnnQueryProfileResult... values) {
			this.query = _listAdd(this.query, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 * <p>
		 * Adds a value to <code>query</code> using a builder lambda.
		 */
		public final Builder query(Function<KnnQueryProfileResult.Builder, ObjectBuilder<KnnQueryProfileResult>> fn) {
			return query(fn.apply(new KnnQueryProfileResult.Builder()).build());
		}

		/**
		 * Required - API name: {@code rewrite_time}
		 */
		public final Builder rewriteTime(long value) {
			this.rewriteTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>collector</code>.
		 */
		public final Builder collector(List<KnnCollectorResult> list) {
			this.collector = _listAddAll(this.collector, list);
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 * <p>
		 * Adds one or more values to <code>collector</code>.
		 */
		public final Builder collector(KnnCollectorResult value, KnnCollectorResult... values) {
			this.collector = _listAdd(this.collector, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 * <p>
		 * Adds a value to <code>collector</code> using a builder lambda.
		 */
		public final Builder collector(Function<KnnCollectorResult.Builder, ObjectBuilder<KnnCollectorResult>> fn) {
			return collector(fn.apply(new KnnCollectorResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DfsKnnProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DfsKnnProfile build() {
			_checkSingleUse();

			return new DfsKnnProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DfsKnnProfile}
	 */
	public static final JsonpDeserializer<DfsKnnProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DfsKnnProfile::setupDfsKnnProfileDeserializer);

	protected static void setupDfsKnnProfileDeserializer(ObjectDeserializer<DfsKnnProfile.Builder> op) {

		op.add(Builder::vectorOperationsCount, JsonpDeserializer.longDeserializer(), "vector_operations_count");
		op.add(Builder::query, JsonpDeserializer.arrayDeserializer(KnnQueryProfileResult._DESERIALIZER), "query");
		op.add(Builder::rewriteTime, JsonpDeserializer.longDeserializer(), "rewrite_time");
		op.add(Builder::collector, JsonpDeserializer.arrayDeserializer(KnnCollectorResult._DESERIALIZER), "collector");

	}

}
