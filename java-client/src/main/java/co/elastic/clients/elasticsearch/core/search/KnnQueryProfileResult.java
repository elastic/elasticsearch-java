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

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
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
import java.lang.String;
import java.util.List;
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

// typedef: _global.search._types.KnnQueryProfileResult

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.search._types.KnnQueryProfileResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class KnnQueryProfileResult implements JsonpSerializable {
	private final String type;

	private final String description;

	@Nullable
	private final Time time;

	private final long timeInNanos;

	private final KnnQueryProfileBreakdown breakdown;

	private final Map<String, JsonData> debug;

	private final List<KnnQueryProfileResult> children;

	// ---------------------------------------------------------------------------------------------

	private KnnQueryProfileResult(Builder builder) {

		this.type = ApiTypeHelper.requireNonNull(builder.type, this, "type");
		this.description = ApiTypeHelper.requireNonNull(builder.description, this, "description");
		this.time = builder.time;
		this.timeInNanos = ApiTypeHelper.requireNonNull(builder.timeInNanos, this, "timeInNanos");
		this.breakdown = ApiTypeHelper.requireNonNull(builder.breakdown, this, "breakdown");
		this.debug = ApiTypeHelper.unmodifiable(builder.debug);
		this.children = ApiTypeHelper.unmodifiable(builder.children);

	}

	public static KnnQueryProfileResult of(Function<Builder, ObjectBuilder<KnnQueryProfileResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code type}
	 */
	public final String type() {
		return this.type;
	}

	/**
	 * Required - API name: {@code description}
	 */
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code time}
	 */
	@Nullable
	public final Time time() {
		return this.time;
	}

	/**
	 * Required - API name: {@code time_in_nanos}
	 */
	public final long timeInNanos() {
		return this.timeInNanos;
	}

	/**
	 * Required - API name: {@code breakdown}
	 */
	public final KnnQueryProfileBreakdown breakdown() {
		return this.breakdown;
	}

	/**
	 * API name: {@code debug}
	 */
	public final Map<String, JsonData> debug() {
		return this.debug;
	}

	/**
	 * API name: {@code children}
	 */
	public final List<KnnQueryProfileResult> children() {
		return this.children;
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

		generator.writeKey("type");
		generator.write(this.type);

		generator.writeKey("description");
		generator.write(this.description);

		if (this.time != null) {
			generator.writeKey("time");
			this.time.serialize(generator, mapper);

		}
		generator.writeKey("time_in_nanos");
		generator.write(this.timeInNanos);

		generator.writeKey("breakdown");
		this.breakdown.serialize(generator, mapper);

		if (ApiTypeHelper.isDefined(this.debug)) {
			generator.writeKey("debug");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.debug.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.children)) {
			generator.writeKey("children");
			generator.writeStartArray();
			for (KnnQueryProfileResult item0 : this.children) {
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
	 * Builder for {@link KnnQueryProfileResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<KnnQueryProfileResult> {
		private String type;

		private String description;

		@Nullable
		private Time time;

		private Long timeInNanos;

		private KnnQueryProfileBreakdown breakdown;

		@Nullable
		private Map<String, JsonData> debug;

		@Nullable
		private List<KnnQueryProfileResult> children;

		/**
		 * Required - API name: {@code type}
		 */
		public final Builder type(String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - API name: {@code description}
		 */
		public final Builder description(String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code time}
		 */
		public final Builder time(@Nullable Time value) {
			this.time = value;
			return this;
		}

		/**
		 * API name: {@code time}
		 */
		public final Builder time(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.time(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - API name: {@code time_in_nanos}
		 */
		public final Builder timeInNanos(long value) {
			this.timeInNanos = value;
			return this;
		}

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(KnnQueryProfileBreakdown value) {
			this.breakdown = value;
			return this;
		}

		/**
		 * Required - API name: {@code breakdown}
		 */
		public final Builder breakdown(
				Function<KnnQueryProfileBreakdown.Builder, ObjectBuilder<KnnQueryProfileBreakdown>> fn) {
			return this.breakdown(fn.apply(new KnnQueryProfileBreakdown.Builder()).build());
		}

		/**
		 * API name: {@code debug}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>debug</code>.
		 */
		public final Builder debug(Map<String, JsonData> map) {
			this.debug = _mapPutAll(this.debug, map);
			return this;
		}

		/**
		 * API name: {@code debug}
		 * <p>
		 * Adds an entry to <code>debug</code>.
		 */
		public final Builder debug(String key, JsonData value) {
			this.debug = _mapPut(this.debug, key, value);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>children</code>.
		 */
		public final Builder children(List<KnnQueryProfileResult> list) {
			this.children = _listAddAll(this.children, list);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds one or more values to <code>children</code>.
		 */
		public final Builder children(KnnQueryProfileResult value, KnnQueryProfileResult... values) {
			this.children = _listAdd(this.children, value, values);
			return this;
		}

		/**
		 * API name: {@code children}
		 * <p>
		 * Adds a value to <code>children</code> using a builder lambda.
		 */
		public final Builder children(
				Function<KnnQueryProfileResult.Builder, ObjectBuilder<KnnQueryProfileResult>> fn) {
			return children(fn.apply(new KnnQueryProfileResult.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link KnnQueryProfileResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public KnnQueryProfileResult build() {
			_checkSingleUse();

			return new KnnQueryProfileResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link KnnQueryProfileResult}
	 */
	public static final JsonpDeserializer<KnnQueryProfileResult> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, KnnQueryProfileResult::setupKnnQueryProfileResultDeserializer);

	protected static void setupKnnQueryProfileResultDeserializer(ObjectDeserializer<KnnQueryProfileResult.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::time, Time._DESERIALIZER, "time");
		op.add(Builder::timeInNanos, JsonpDeserializer.longDeserializer(), "time_in_nanos");
		op.add(Builder::breakdown, KnnQueryProfileBreakdown._DESERIALIZER, "breakdown");
		op.add(Builder::debug, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "debug");
		op.add(Builder::children, JsonpDeserializer.arrayDeserializer(KnnQueryProfileResult._DESERIALIZER), "children");

	}

}
