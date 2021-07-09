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

package co.elastic.clients.elasticsearch._global.reindex;

import co.elastic.clients.elasticsearch._types.SlicedScroll;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryContainer;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _global.reindex.Source
public final class Source implements ToJsonp {
	private final List<String> index;

	@Nullable
	private final QueryContainer query;

	@Nullable
	private final RemoteSource remote;

	@Nullable
	private final Number size;

	@Nullable
	private final SlicedScroll slice;

	@Nullable
	private final List<JsonValue> sort;

	@Nullable
	private final List<String> source;

	// ---------------------------------------------------------------------------------------------

	protected Source(Builder builder) {

		this.index = Objects.requireNonNull(builder.index, "index");
		this.query = builder.query;
		this.remote = builder.remote;
		this.size = builder.size;
		this.slice = builder.slice;
		this.sort = builder.sort;
		this.source = builder.source;

	}

	/**
	 * API name: {@code index}
	 */
	public List<String> index() {
		return this.index;
	}

	/**
	 * API name: {@code query}
	 */
	@Nullable
	public QueryContainer query() {
		return this.query;
	}

	/**
	 * API name: {@code remote}
	 */
	@Nullable
	public RemoteSource remote() {
		return this.remote;
	}

	/**
	 * API name: {@code size}
	 */
	@Nullable
	public Number size() {
		return this.size;
	}

	/**
	 * API name: {@code slice}
	 */
	@Nullable
	public SlicedScroll slice() {
		return this.slice;
	}

	/**
	 * API name: {@code sort}
	 */
	@Nullable
	public List<JsonValue> sort() {
		return this.sort;
	}

	/**
	 * API name: {@code _source}
	 */
	@Nullable
	public List<String> source() {
		return this.source;
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

		generator.writeKey("index");
		generator.writeStartArray();
		for (String item0 : this.index) {
			generator.write(item0);

		}
		generator.writeEnd();

		if (this.query != null) {

			generator.writeKey("query");
			this.query.toJsonp(generator, mapper);

		}
		if (this.remote != null) {

			generator.writeKey("remote");
			this.remote.toJsonp(generator, mapper);

		}
		if (this.size != null) {

			generator.writeKey("size");
			generator.write(this.size.doubleValue());

		}
		if (this.slice != null) {

			generator.writeKey("slice");
			this.slice.toJsonp(generator, mapper);

		}
		if (this.sort != null) {

			generator.writeKey("sort");
			generator.writeStartArray();
			for (JsonValue item0 : this.sort) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.source != null) {

			generator.writeKey("_source");
			generator.writeStartArray();
			for (String item0 : this.source) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Source}.
	 */
	public static class Builder implements ObjectBuilder<Source> {
		private List<String> index;

		@Nullable
		private QueryContainer query;

		@Nullable
		private RemoteSource remote;

		@Nullable
		private Number size;

		@Nullable
		private SlicedScroll slice;

		@Nullable
		private List<JsonValue> sort;

		@Nullable
		private List<String> source;

		/**
		 * API name: {@code index}
		 */
		public Builder index(List<String> value) {
			this.index = value;
			return this;
		}

		/**
		 * API name: {@code index}
		 */
		public Builder index(String... value) {
			this.index = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #index(List)}, creating the list if needed.
		 */
		public Builder addIndex(String value) {
			if (this.index == null) {
				this.index = new ArrayList<>();
			}
			this.index.add(value);
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(@Nullable QueryContainer value) {
			this.query = value;
			return this;
		}

		/**
		 * API name: {@code query}
		 */
		public Builder query(Function<QueryContainer.Builder, ObjectBuilder<QueryContainer>> fn) {
			return this.query(fn.apply(new QueryContainer.Builder()).build());
		}

		/**
		 * API name: {@code remote}
		 */
		public Builder remote(@Nullable RemoteSource value) {
			this.remote = value;
			return this;
		}

		/**
		 * API name: {@code remote}
		 */
		public Builder remote(Function<RemoteSource.Builder, ObjectBuilder<RemoteSource>> fn) {
			return this.remote(fn.apply(new RemoteSource.Builder()).build());
		}

		/**
		 * API name: {@code size}
		 */
		public Builder size(@Nullable Number value) {
			this.size = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public Builder slice(@Nullable SlicedScroll value) {
			this.slice = value;
			return this;
		}

		/**
		 * API name: {@code slice}
		 */
		public Builder slice(Function<SlicedScroll.Builder, ObjectBuilder<SlicedScroll>> fn) {
			return this.slice(fn.apply(new SlicedScroll.Builder()).build());
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(@Nullable List<JsonValue> value) {
			this.sort = value;
			return this;
		}

		/**
		 * API name: {@code sort}
		 */
		public Builder sort(JsonValue... value) {
			this.sort = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #sort(List)}, creating the list if needed.
		 */
		public Builder addSort(JsonValue value) {
			if (this.sort == null) {
				this.sort = new ArrayList<>();
			}
			this.sort.add(value);
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(@Nullable List<String> value) {
			this.source = value;
			return this;
		}

		/**
		 * API name: {@code _source}
		 */
		public Builder source(String... value) {
			this.source = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #source(List)}, creating the list if needed.
		 */
		public Builder addSource(String value) {
			if (this.source == null) {
				this.source = new ArrayList<>();
			}
			this.source.add(value);
			return this;
		}

		/**
		 * Builds a {@link Source}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Source build() {

			return new Source(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Source
	 */
	public static final JsonpDeserializer<Source> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Source::setupSourceDeserializer);

	protected static void setupSourceDeserializer(DelegatingDeserializer<Source.Builder> op) {

		op.add(Builder::index, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "index");
		op.add(Builder::query, QueryContainer.DESERIALIZER, "query");
		op.add(Builder::remote, RemoteSource.DESERIALIZER, "remote");
		op.add(Builder::size, JsonpDeserializer.numberDeserializer(), "size");
		op.add(Builder::slice, SlicedScroll.DESERIALIZER, "slice");
		op.add(Builder::sort, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.jsonValueDeserializer()), "sort");
		op.add(Builder::source, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "_source");

	}

}
