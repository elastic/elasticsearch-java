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

// typedef: _global.search._types.SearchProfile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.SearchProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class SearchProfile implements JsonpSerializable {
	private final List<Collector> collector;

	private final List<QueryProfile> query;

	private final long rewriteTime;

	// ---------------------------------------------------------------------------------------------

	private SearchProfile(Builder builder) {

		this.collector = ApiTypeHelper.unmodifiableRequired(builder.collector, this, "collector");
		this.query = ApiTypeHelper.unmodifiableRequired(builder.query, this, "query");
		this.rewriteTime = ApiTypeHelper.requireNonNull(builder.rewriteTime, this, "rewriteTime");

	}

	public static SearchProfile of(Function<Builder, ObjectBuilder<SearchProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code collector}
	 */
	public final List<Collector> collector() {
		return this.collector;
	}

	/**
	 * Required - API name: {@code query}
	 */
	public final List<QueryProfile> query() {
		return this.query;
	}

	/**
	 * Required - API name: {@code rewrite_time}
	 */
	public final long rewriteTime() {
		return this.rewriteTime;
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

		if (ApiTypeHelper.isDefined(this.collector)) {
			generator.writeKey("collector");
			generator.writeStartArray();
			for (Collector item0 : this.collector) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.query)) {
			generator.writeKey("query");
			generator.writeStartArray();
			for (QueryProfile item0 : this.query) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("rewrite_time");
		generator.write(this.rewriteTime);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchProfile}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SearchProfile> {
		private List<Collector> collector;

		private List<QueryProfile> query;

		private Long rewriteTime;

		/**
		 * Required - API name: {@code collector}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>collector</code>.
		 */
		public final Builder collector(List<Collector> list) {
			this.collector = _listAddAll(this.collector, list);
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 * <p>
		 * Adds one or more values to <code>collector</code>.
		 */
		public final Builder collector(Collector value, Collector... values) {
			this.collector = _listAdd(this.collector, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 * <p>
		 * Adds a value to <code>collector</code> using a builder lambda.
		 */
		public final Builder collector(Function<Collector.Builder, ObjectBuilder<Collector>> fn) {
			return collector(fn.apply(new Collector.Builder()).build());
		}

		/**
		 * Required - API name: {@code query}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>query</code>.
		 */
		public final Builder query(List<QueryProfile> list) {
			this.query = _listAddAll(this.query, list);
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 * <p>
		 * Adds one or more values to <code>query</code>.
		 */
		public final Builder query(QueryProfile value, QueryProfile... values) {
			this.query = _listAdd(this.query, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 * <p>
		 * Adds a value to <code>query</code> using a builder lambda.
		 */
		public final Builder query(Function<QueryProfile.Builder, ObjectBuilder<QueryProfile>> fn) {
			return query(fn.apply(new QueryProfile.Builder()).build());
		}

		/**
		 * Required - API name: {@code rewrite_time}
		 */
		public final Builder rewriteTime(long value) {
			this.rewriteTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SearchProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchProfile build() {
			_checkSingleUse();

			return new SearchProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchProfile}
	 */
	public static final JsonpDeserializer<SearchProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchProfile::setupSearchProfileDeserializer);

	protected static void setupSearchProfileDeserializer(ObjectDeserializer<SearchProfile.Builder> op) {

		op.add(Builder::collector, JsonpDeserializer.arrayDeserializer(Collector._DESERIALIZER), "collector");
		op.add(Builder::query, JsonpDeserializer.arrayDeserializer(QueryProfile._DESERIALIZER), "query");
		op.add(Builder::rewriteTime, JsonpDeserializer.longDeserializer(), "rewrite_time");

	}

}
