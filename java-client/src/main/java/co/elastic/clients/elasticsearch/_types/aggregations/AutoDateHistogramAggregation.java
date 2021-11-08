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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.JsonValue;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.aggregations.AutoDateHistogramAggregation
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
	private final String missing;

	@Nullable
	private final String offset;

	private final Map<String, JsonData> params;

	@Nullable
	private final JsonValue /* _types.Script */ script;

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
		this.params = ModelTypeHelper.unmodifiable(builder.params);
		this.script = builder.script;
		this.timeZone = builder.timeZone;

	}

	public static AutoDateHistogramAggregation of(Function<Builder, ObjectBuilder<AutoDateHistogramAggregation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link Aggregation} variant type
	 */
	@Override
	public String _variantType() {
		return "auto_date_histogram";
	}

	/**
	 * API name: {@code buckets}
	 */
	@Nullable
	public final Integer buckets() {
		return this.buckets;
	}

	/**
	 * API name: {@code field}
	 */
	@Nullable
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * API name: {@code minimum_interval}
	 */
	@Nullable
	public final MinimumInterval minimumInterval() {
		return this.minimumInterval;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final String missing() {
		return this.missing;
	}

	/**
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
	public final JsonValue /* _types.Script */ script() {
		return this.script;
	}

	/**
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
			generator.write(this.missing);

		}
		if (this.offset != null) {
			generator.writeKey("offset");
			generator.write(this.offset);

		}
		if (ModelTypeHelper.isDefined(this.params)) {
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
			generator.write(this.script);

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
		private String missing;

		@Nullable
		private String offset;

		@Nullable
		private Map<String, JsonData> params;

		@Nullable
		private JsonValue /* _types.Script */ script;

		@Nullable
		private String timeZone;

		/**
		 * API name: {@code buckets}
		 */
		public final Builder buckets(@Nullable Integer value) {
			this.buckets = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public final Builder field(@Nullable String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * API name: {@code minimum_interval}
		 */
		public final Builder minimumInterval(@Nullable MinimumInterval value) {
			this.minimumInterval = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable String value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code offset}
		 */
		public final Builder offset(@Nullable String value) {
			this.offset = value;
			return this;
		}

		/**
		 * API name: {@code params}
		 */
		public final Builder params(@Nullable Map<String, JsonData> value) {
			this.params = value;
			return this;
		}

		/**
		 * API name: {@code script}
		 */
		public final Builder script(@Nullable JsonValue /* _types.Script */ value) {
			this.script = value;
			return this;
		}

		/**
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
	public static final JsonpDeserializer<AutoDateHistogramAggregation> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, AutoDateHistogramAggregation::setupAutoDateHistogramAggregationDeserializer, Builder::build);

	protected static void setupAutoDateHistogramAggregationDeserializer(
			DelegatingDeserializer<AutoDateHistogramAggregation.Builder> op) {
		BucketAggregationBase.setupBucketAggregationBaseDeserializer(op);
		op.add(Builder::buckets, JsonpDeserializer.integerDeserializer(), "buckets");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::minimumInterval, MinimumInterval._DESERIALIZER, "minimum_interval");
		op.add(Builder::missing, JsonpDeserializer.stringDeserializer(), "missing");
		op.add(Builder::offset, JsonpDeserializer.stringDeserializer(), "offset");
		op.add(Builder::params, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "params");
		op.add(Builder::script, JsonpDeserializer.jsonValueDeserializer(), "script");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

	}

}
