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

package co.elastic.clients.elasticsearch._global.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.ShardProfile
public final class ShardProfile implements ToJsonp {
	private final List<AggregationProfile> aggregations;

	private final String id;

	private final List<SearchProfile> searches;

	// ---------------------------------------------------------------------------------------------

	protected ShardProfile(Builder builder) {

		this.aggregations = Objects.requireNonNull(builder.aggregations, "aggregations");
		this.id = Objects.requireNonNull(builder.id, "id");
		this.searches = Objects.requireNonNull(builder.searches, "searches");

	}

	/**
	 * API name: {@code aggregations}
	 */
	public List<AggregationProfile> aggregations() {
		return this.aggregations;
	}

	/**
	 * API name: {@code id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code searches}
	 */
	public List<SearchProfile> searches() {
		return this.searches;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("aggregations");
		generator.writeStartArray();
		for (AggregationProfile item0 : this.aggregations) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("id");
		generator.write(this.id);

		generator.writeKey("searches");
		generator.writeStartArray();
		for (SearchProfile item0 : this.searches) {
			item0.toJsonp(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardProfile}.
	 */
	public static class Builder implements ObjectBuilder<ShardProfile> {
		private List<AggregationProfile> aggregations;

		private String id;

		private List<SearchProfile> searches;

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(List<AggregationProfile> value) {
			this.aggregations = value;
			return this;
		}

		/**
		 * API name: {@code aggregations}
		 */
		public Builder aggregations(AggregationProfile... value) {
			this.aggregations = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #aggregations(List)}, creating the list if needed.
		 */
		public Builder addAggregations(AggregationProfile value) {
			if (this.aggregations == null) {
				this.aggregations = new ArrayList<>();
			}
			this.aggregations.add(value);
			return this;
		}

		/**
		 * Set {@link #aggregations(List)} to a singleton list.
		 */
		public Builder aggregations(Function<AggregationProfile.Builder, ObjectBuilder<AggregationProfile>> fn) {
			return this.aggregations(fn.apply(new AggregationProfile.Builder()).build());
		}

		/**
		 * Add a value to {@link #aggregations(List)}, creating the list if needed.
		 */
		public Builder addAggregations(Function<AggregationProfile.Builder, ObjectBuilder<AggregationProfile>> fn) {
			return this.addAggregations(fn.apply(new AggregationProfile.Builder()).build());
		}

		/**
		 * API name: {@code id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code searches}
		 */
		public Builder searches(List<SearchProfile> value) {
			this.searches = value;
			return this;
		}

		/**
		 * API name: {@code searches}
		 */
		public Builder searches(SearchProfile... value) {
			this.searches = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #searches(List)}, creating the list if needed.
		 */
		public Builder addSearches(SearchProfile value) {
			if (this.searches == null) {
				this.searches = new ArrayList<>();
			}
			this.searches.add(value);
			return this;
		}

		/**
		 * Set {@link #searches(List)} to a singleton list.
		 */
		public Builder searches(Function<SearchProfile.Builder, ObjectBuilder<SearchProfile>> fn) {
			return this.searches(fn.apply(new SearchProfile.Builder()).build());
		}

		/**
		 * Add a value to {@link #searches(List)}, creating the list if needed.
		 */
		public Builder addSearches(Function<SearchProfile.Builder, ObjectBuilder<SearchProfile>> fn) {
			return this.addSearches(fn.apply(new SearchProfile.Builder()).build());
		}

		/**
		 * Builds a {@link ShardProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardProfile build() {

			return new ShardProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for ShardProfile
	 */
	public static final JsonpDeserializer<ShardProfile> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, ShardProfile::setupShardProfileDeserializer);

	protected static void setupShardProfileDeserializer(DelegatingDeserializer<ShardProfile.Builder> op) {

		op.add(Builder::aggregations, JsonpDeserializer.arrayDeserializer(AggregationProfile.DESERIALIZER),
				"aggregations");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(Builder::searches, JsonpDeserializer.arrayDeserializer(SearchProfile.DESERIALIZER), "searches");

	}

}
