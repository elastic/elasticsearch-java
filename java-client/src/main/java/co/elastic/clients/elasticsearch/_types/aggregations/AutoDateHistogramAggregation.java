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

package co.elastic.clients.elasticsearch._types.aggregations;

import co.elastic.clients.elasticsearch._types.Script;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AutoDateHistogramAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.AutoDateHistogramAggregation">API
 *      specification</a>
 */
@JsonpDeserializable
public class AutoDateHistogramAggregation extends BucketAggregationBase implements AggregationVariant {
	@Nullable
	private final Integer buckets;

	@Nullable
	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final MinimumInterval minimumInterval;

	@Nullable
	private final DateTime missing;

	@Nullable
	private final String offset;

	private final Map<String, JsonData> params;

	@Nullable
	private final Script script;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private AutoDateHistogramAggregation(Builder builder) {
		super(builder);

		this.buckets = builder.buckets;
		this.field = builder.field;
		this.format = builder.format;
		this.minimumInterval = builder.minimumInterval;
		this.missing = builder.missing;
		this.offset = builder.offset;
		this.params = ApiTypeHelper.unmodifiable(builder.params);
		this.script = builder.script;
		this.timeZone = builder.timeZone;

	}

	public static AutoDateHistogramAggregation of(Function<Builder, ObjectBuilder<AutoDateHistogramAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregation variant kind.
	 */
	@Override
	public Aggregation.Kind _aggregationKind() {
		return Aggregation.Kind.AutoDateHistogram;
	}

	/**
	 * The target number of buckets.
	 * <p>
	 * API name: {@code buckets}
	 */
	@Nullable
	public final Integer buckets() {
		return this.buckets;
	}

	/**
	 * The field on which to run the aggregation.
	 * <p>
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * The date format used to format <code>key_as_string</code> in the response. If
	 * no <code>format</code> is specified, the first date format specified in the
	 * field mapping is used.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * The minimum rounding interval. This can make the collection process more
	 * efficient, as the aggregation will not attempt to round at any interval lower
	 * than <code>minimum_interval</code>.
	 * <p>
	 * API name: {@code minimum_interval}
	 */
	@Nullable
	public final MinimumInterval minimumInterval() {
		return this.minimumInterval;
	}

	/**
	 * The value to apply to documents that do not have a value. By default,
	 * documents without a value are ignored.
	 * <p>
	 * API name: {@code missing}
	 */
	@Nullable
	public final DateTime missing() {
		return this.missing;
	}

	/**
	 * Time zone specified as a ISO 8601 UTC offset.
	 * <p>
	 * API name: {@code offset}
	 */
	@Nullable
	public final String offset() {
		return this.offset;
	}

	/**
	 * API name: {@code params}
	 */
	public final Map<String, JsonData> params() {
		return this.params;
	}

	/**
	 * API name: {@code script}
	 */
	@Nullable
	public final Script script() {
		return this.script;
	}

	/**
	 * Time zone ID.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.buckets != null) {
			generator.writeKey("buckets");
			generator.write(this.buckets);

		}
		if (this.field != null) {
			generator.writeKey("field");
			generator.write(this.field);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.minimumInterval != null) {
			generator.writeKey("minimum_interval");
			this.minimumInterval.serialize(generator, mapper);
		}
		if (this.missing != null) {
			generator.writeKey("missing");
			this.missing.serialize(generator, mapper);
		}
		if (this.offset != null) {
			generator.writeKey("offset");
			generator.write(this.offset);

		}
		if (ApiTypeHelper.isDefined(this.params)) {
			generator.writeKey("params");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.params.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.script != null) {
			generator.writeKey("script");
			this.script.serialize(generator, mapper);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link AutoDateHistogramAggregation}.
	 */

	public static class Builder extends BucketAggregationBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<AutoDateHistogramAggregation> {
		@Nullable
		private Integer buckets;

		@Nullable
		private String field;

		@Nullable
		private String format;

		@Nullable
		private MinimumInterval minimumInterval;

		@Nullable
		private DateTime missing;

		@Nullable
		private String offset;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private Script script;

		@Nullable
		private String timeZone;

		/**
		 * The target number of buckets.
		 * <p>
		 * API name: {@code buckets}
		 */
		public final Builder buckets(@Nullable Integer value) {
			this.buckets = value;
			return this;
		}

		/**
		 * The field on which to run the aggregation.
		 * <p>
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * The date format used to format <code>key_as_string</code> in the response. If
		 * no <code>format</code> is specified, the first date format specified in the
		 * field mapping is used.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * The minimum rounding interval. This can make the collection process more
		 * efficient, as the aggregation will not attempt to round at any interval lower
		 * than <code>minimum_interval</code>.
		 * <p>
		 * API name: {@code minimum_interval}
		 */
		public final Builder minimumInterval(@Nullable MinimumInterval value) {
			this.minimumInterval = value;
			return this;
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable DateTime value) {
			this.missing = value;
			return this;
		}

		/**
		 * Time zone specified as a ISO 8601 UTC offset.
		 * <p>
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable String value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>params</code>.
		 */
		public final Builder params(Map<String, JsonData> map) {
			this.params = _mapPutAll(this.params, map);
			return this;
		}

		/**
		 * API name: {@code params}
		 * <p>
		 * Adds an entry to <code>params</code>.
		 */
		public final Builder params(String key, JsonData value) {
			this.params = _mapPut(this.params, key, value);
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable Script value) {
			this.script = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(Function<Script.Builder, ObjectBuilder<Script>> fn) {
			return this.script(fn.apply(new Script.Builder()).build());
		}

		/**
		 * Time zone ID.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link AutoDateHistogramAggregation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public AutoDateHistogramAggregation build() {
			_checkSingleUse();

			return new AutoDateHistogramAggregation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link AutoDateHistogramAggregation}
	 */
	public static final JsonpDeserializer<AutoDateHistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, AutoDateHistogramAggregation::setupAutoDateHistogramAggregationDeserializer);

	protected static void setupAutoDateHistogramAggregationDeserializer(
			ObjectDeserializer<AutoDateHistogramAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::buckets, JsonpDeserializer.integerDeserializer(), "buckets");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::minimumInterval, MinimumInterval._DESERIALIZER, "minimum_interval");
		op.add(Builder::missing, DateTime._DESERIALIZER, "missing");
		op.add(Builder::offset, JsonpDeserializer.stringDeserializer(), "offset");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::script, Script._DESERIALIZER, "script");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
