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

package co.elastic.clients.elasticsearch._core.search;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.search._types.SearchProfile
@JsonpDeserializable
public final class SearchProfile implements JsonpSerializable {
	private final List<Collector> collector;

	private final List<QueryProfile> query;

	private final long rewriteTime;

	// ---------------------------------------------------------------------------------------------

	public SearchProfile(Builder builder) {

		this.collector = ModelTypeHelper.unmodifiableNonNull(builder.collector, "collector");
		this.query = ModelTypeHelper.unmodifiableNonNull(builder.query, "query");
		this.rewriteTime = Objects.requireNonNull(builder.rewriteTime, "rewrite_time");

	}

	public SearchProfile(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code collector}
	 */
	public List<Collector> collector() {
		return this.collector;
	}

	/**
	 * API name: {@code query}
	 */
	public List<QueryProfile> query() {
		return this.query;
	}

	/**
	 * API name: {@code rewrite_time}
	 */
	public long rewriteTime() {
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

		generator.writeKey("collector");
		generator.writeStartArray();
		for (Collector item0 : this.collector) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("query");
		generator.writeStartArray();
		for (QueryProfile item0 : this.query) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

		generator.writeKey("rewrite_time");
		generator.write(this.rewriteTime);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchProfile}.
	 */
	public static class Builder implements ObjectBuilder<SearchProfile> {
		private List<Collector> collector;

		private List<QueryProfile> query;

		private Long rewriteTime;

		/**
		 * API name: {@code collector}
		 */
		public Builder collector(List<Collector> value) {
			this.collector = value;
			return this;
		}

		/**
		 * API name: {@code collector}
		 */
		public Builder collector(Collector... value) {
			this.collector = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #collector(List)}, creating the list if needed. 4
		 */
		public Builder addCollector(Collector value) {
			if (this.collector == null) {
				this.collector = new ArrayList<>();
			}
			this.collector.add(value);
			return this;
		}

		/**
		 * Set {@link #collector(List)} to a singleton list.
		 */
		public Builder collector(Function<Collector.Builder, ObjectBuilder<Collector>> fn) {
			return this.collector(fn.apply(new Collector.Builder()).build());
		}

		/**
		 * Add a value to {@link #collector(List)}, creating the list if needed. 5
		 */
		public Builder addCollector(Function<Collector.Builder, ObjectBuilder<Collector>> fn) {
			return this.addCollector(fn.apply(new Collector.Builder()).build());
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(List<QueryProfile> value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(QueryProfile... value) {
			this.query = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #query(List)}, creating the list if needed. 4
		 */
		public Builder addQuery(QueryProfile value) {
			if (this.query == null) {
				this.query = new ArrayList<>();
			}
			this.query.add(value);
			return this;
		}

		/**
		 * Set {@link #query(List)} to a singleton list.
		 */
		public Builder query(Function<QueryProfile.Builder, ObjectBuilder<QueryProfile>> fn) {
			return this.query(fn.apply(new QueryProfile.Builder()).build());
		}

		/**
		 * Add a value to {@link #query(List)}, creating the list if needed. 5
		 */
		public Builder addQuery(Function<QueryProfile.Builder, ObjectBuilder<QueryProfile>> fn) {
			return this.addQuery(fn.apply(new QueryProfile.Builder()).build());
		}

		/**
		 * API name: {@code rewrite_time}
		 */
		public Builder rewriteTime(long value) {
			this.rewriteTime = value;
			return this;
		}

		/**
		 * Builds a {@link SearchProfile}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SearchProfile build() {

			return new SearchProfile(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SearchProfile}
	 */
	public static final JsonpDeserializer<SearchProfile> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SearchProfile::setupSearchProfileDeserializer, Builder::build);

	protected static void setupSearchProfileDeserializer(DelegatingDeserializer<SearchProfile.Builder> op) {

		op.add(Builder::collector, JsonpDeserializer.arrayDeserializer(Collector._DESERIALIZER), "collector");
		op.add(Builder::query, JsonpDeserializer.arrayDeserializer(QueryProfile._DESERIALIZER), "query");
		op.add(Builder::rewriteTime, JsonpDeserializer.longDeserializer(), "rewrite_time");

	}

}
