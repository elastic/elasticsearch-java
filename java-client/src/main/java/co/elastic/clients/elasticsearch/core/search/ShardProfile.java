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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.ShardProfile

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.ShardProfile">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardProfile implements JsonpSerializable {
	private final List<AggregationProfile> aggregations;

	private final String id;

	private final List<SearchProfile> searches;

	@Nullable
	private final FetchProfile fetch;

	// ---------------------------------------------------------------------------------------------

	private ShardProfile(Builder builder) {

		this.aggregations = ApiTypeHelper.unmodifiableRequired(builder.aggregations, this, "aggregations");
		this.id = ApiTypeHelper.requireNonNull(builder.id, this, "id");
		this.searches = ApiTypeHelper.unmodifiableRequired(builder.searches, this, "searches");
		this.fetch = builder.fetch;

	}

	public static ShardProfile of(Function<Builder, ObjectBuilder<ShardProfile>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code aggregations}
	 */
	public final List<AggregationProfile> aggregations() {
		return this.aggregations;
	}

	/**
	 * Required - API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code searches}
	 */
	public final List<SearchProfile> searches() {
		return this.searches;
	}

	/**
	 * API name: {@code fetch}
	 */
	@Nullable
	public final FetchProfile fetch() {
		return this.fetch;
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

		if (ApiTypeHelper.isDefined(this.aggregations)) {
			generator.writeKey("aggregations");
			generator.writeStartArray();
			for (AggregationProfile item0 : this.aggregations) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("id");
		generator.write(this.id);

		if (ApiTypeHelper.isDefined(this.searches)) {
			generator.writeKey("searches");
			generator.writeStartArray();
			for (SearchProfile item0 : this.searches) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.fetch != null) {
			generator.writeKey("fetch");
			this.fetch.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardProfile}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShardProfile> {
		private List<AggregationProfile> aggregations;

		private String id;

		private List<SearchProfile> searches;

		@Nullable
		private FetchProfile fetch;

		/**
		 * Required - API name: {@code aggregations}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>aggregations</code>.
		 */
		public final Builder aggregations(List<AggregationProfile> list) {
			this.aggregations = _listAddAll(this.aggregations, list);
			return this;
		}

		/**
		 * Required - API name: {@code aggregations}
		 * <p>
		 * Adds one or more values to <code>aggregations</code>.
		 */
		public final Builder aggregations(AggregationProfile value, AggregationProfile... values) {
			this.aggregations = _listAdd(this.aggregations, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code aggregations}
		 * <p>
		 * Adds a value to <code>aggregations</code> using a builder lambda.
		 */
		public final Builder aggregations(Function<AggregationProfile.Builder, ObjectBuilder<AggregationProfile>> fn) {
			return aggregations(fn.apply(new AggregationProfile.Builder()).build());
		}

		/**
		 * Required - API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code searches}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>searches</code>.
		 */
		public final Builder searches(List<SearchProfile> list) {
			this.searches = _listAddAll(this.searches, list);
			return this;
		}

		/**
		 * Required - API name: {@code searches}
		 * <p>
		 * Adds one or more values to <code>searches</code>.
		 */
		public final Builder searches(SearchProfile value, SearchProfile... values) {
			this.searches = _listAdd(this.searches, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code searches}
		 * <p>
		 * Adds a value to <code>searches</code> using a builder lambda.
		 */
		public final Builder searches(Function<SearchProfile.Builder, ObjectBuilder<SearchProfile>> fn) {
			return searches(fn.apply(new SearchProfile.Builder()).build());
		}

		/**
		 * API name: {@code fetch}
		 */
		public final Builder fetch(@Nullable FetchProfile value) {
			this.fetch = value;
			return this;
		}

		/**
		 * API name: {@code fetch}
		 */
		public final Builder fetch(Function<FetchProfile.Builder, ObjectBuilder<FetchProfile>> fn) {
			return this.fetch(fn.apply(new FetchProfile.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShardProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardProfile build() {
			_checkSingleUse();

			return new ShardProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardProfile}
	 */
	public static final JsonpDeserializer<ShardProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardProfile::setupShardProfileDeserializer);

	protected static void setupShardProfileDeserializer(ObjectDeserializer<ShardProfile.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.arrayDeserializer(AggregationProfile._DESERIALIZER),
				"aggregations");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::searches, JsonpDeserializer.arrayDeserializer(SearchProfile._DESERIALIZER), "searches");
		op.add(Builder::fetch, FetchProfile._DESERIALIZER, "fetch");

	}

}
