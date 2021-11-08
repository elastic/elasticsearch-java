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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
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
public class SearchProfile implements JsonpSerializable {
	private final List<Collector> collector;

	private final List<QueryProfile> query;

	private final long rewriteTime;

	// ---------------------------------------------------------------------------------------------

	private SearchProfile(Builder builder) {

		this.collector = ModelTypeHelper.unmodifiableRequired(builder.collector, this, "collector");
		this.query = ModelTypeHelper.unmodifiableRequired(builder.query, this, "query");
		this.rewriteTime = ModelTypeHelper.requireNonNull(builder.rewriteTime, this, "rewriteTime");

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

		if (ModelTypeHelper.isDefined(this.collector)) {
			generator.writeKey("collector");
			generator.writeStartArray();
			for (Collector item0 : this.collector) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.query)) {
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

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SearchProfile}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<SearchProfile> {
		private List<Collector> collector;

		private List<QueryProfile> query;

		private Long rewriteTime;

		/**
		 * Required - API name: {@code collector}
		 */
		public final Builder collector(List<Collector> value) {
			this.collector = value;
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 */
		public final Builder collector(Collector... value) {
			this.collector = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code collector}
		 */
		@SafeVarargs
		public final Builder collector(Function<Collector.Builder, ObjectBuilder<Collector>>... fns) {
			this.collector = new ArrayList<>(fns.length);
			for (Function<Collector.Builder, ObjectBuilder<Collector>> fn : fns) {
				this.collector.add(fn.apply(new Collector.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(List<QueryProfile> value) {
			this.query = value;
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		public final Builder query(QueryProfile... value) {
			this.query = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code query}
		 */
		@SafeVarargs
		public final Builder query(Function<QueryProfile.Builder, ObjectBuilder<QueryProfile>>... fns) {
			this.query = new ArrayList<>(fns.length);
			for (Function<QueryProfile.Builder, ObjectBuilder<QueryProfile>> fn : fns) {
				this.query.add(fn.apply(new QueryProfile.Builder()).build());
			}
			return this;
		}

		/**
		 * Required - API name: {@code rewrite_time}
		 */
		public final Builder rewriteTime(long value) {
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
			_checkSingleUse();

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
