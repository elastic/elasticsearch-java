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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.RangeQuery

/**
 *
 * @see <a href="../../doc-files/api-spec.html#_types.query_dsl.RangeQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class RangeQuery extends RangeQueryBase implements QueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final JsonData gt;

	@Nullable
	private final JsonData gte;

	@Nullable
	private final JsonData lt;

	@Nullable
	private final JsonData lte;

	@Nullable
	private final String from;

	@Nullable
	private final String to;

	@Nullable
	private final String format;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private RangeQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.gt = builder.gt;
		this.gte = builder.gte;
		this.lt = builder.lt;
		this.lte = builder.lte;
		this.from = builder.from;
		this.to = builder.to;
		this.format = builder.format;
		this.timeZone = builder.timeZone;

	}

	public static RangeQuery of(Function<Builder, ObjectBuilder<RangeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Query variant kind.
	 */
	@Override
	public Query.Kind _queryKind() {
		return Query.Kind.Range;
	}

	/**
	 * Required - The target field
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * Greater than.
	 * <p>
	 * API name: {@code gt}
	 */
	@Nullable
	public final JsonData gt() {
		return this.gt;
	}

	/**
	 * Greater than or equal to.
	 * <p>
	 * API name: {@code gte}
	 */
	@Nullable
	public final JsonData gte() {
		return this.gte;
	}

	/**
	 * Less than.
	 * <p>
	 * API name: {@code lt}
	 */
	@Nullable
	public final JsonData lt() {
		return this.lt;
	}

	/**
	 * Less than or equal to.
	 * <p>
	 * API name: {@code lte}
	 */
	@Nullable
	public final JsonData lte() {
		return this.lte;
	}

	/**
	 * API name: {@code from}
	 */
	@Nullable
	public final String from() {
		return this.from;
	}

	/**
	 * API name: {@code to}
	 */
	@Nullable
	public final String to() {
		return this.to;
	}

	/**
	 * Date format used to convert <code>date</code> values in the query.
	 * <p>
	 * API name: {@code format}
	 */
	@Nullable
	public final String format() {
		return this.format;
	}

	/**
	 * Coordinated Universal Time (UTC) offset or IANA time zone used to convert
	 * <code>date</code> values in the query to UTC.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject(this.field);

		super.serializeInternal(generator, mapper);
		if (this.gt != null) {
			generator.writeKey("gt");
			this.gt.serialize(generator, mapper);

		}
		if (this.gte != null) {
			generator.writeKey("gte");
			this.gte.serialize(generator, mapper);

		}
		if (this.lt != null) {
			generator.writeKey("lt");
			this.lt.serialize(generator, mapper);

		}
		if (this.lte != null) {
			generator.writeKey("lte");
			this.lte.serialize(generator, mapper);

		}
		if (this.from != null) {
			generator.writeKey("from");
			generator.write(this.from);

		}
		if (this.to != null) {
			generator.writeKey("to");
			generator.write(this.to);

		}
		if (this.format != null) {
			generator.writeKey("format");
			generator.write(this.format);

		}
		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RangeQuery}.
	 */

	public static class Builder extends RangeQueryBase.AbstractBuilder<Builder> implements ObjectBuilder<RangeQuery> {
		private String field;

		/**
		 * Required - The target field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private JsonData gt;

		@Nullable
		private JsonData gte;

		@Nullable
		private JsonData lt;

		@Nullable
		private JsonData lte;

		@Nullable
		private String from;

		@Nullable
		private String to;

		@Nullable
		private String format;

		@Nullable
		private String timeZone;

		/**
		 * Greater than.
		 * <p>
		 * API name: {@code gt}
		 */
		public final Builder gt(@Nullable JsonData value) {
			this.gt = value;
			return this;
		}

		/**
		 * Greater than or equal to.
		 * <p>
		 * API name: {@code gte}
		 */
		public final Builder gte(@Nullable JsonData value) {
			this.gte = value;
			return this;
		}

		/**
		 * Less than.
		 * <p>
		 * API name: {@code lt}
		 */
		public final Builder lt(@Nullable JsonData value) {
			this.lt = value;
			return this;
		}

		/**
		 * Less than or equal to.
		 * <p>
		 * API name: {@code lte}
		 */
		public final Builder lte(@Nullable JsonData value) {
			this.lte = value;
			return this;
		}

		/**
		 * API name: {@code from}
		 */
		public final Builder from(@Nullable String value) {
			this.from = value;
			return this;
		}

		/**
		 * API name: {@code to}
		 */
		public final Builder to(@Nullable String value) {
			this.to = value;
			return this;
		}

		/**
		 * Date format used to convert <code>date</code> values in the query.
		 * <p>
		 * API name: {@code format}
		 */
		public final Builder format(@Nullable String value) {
			this.format = value;
			return this;
		}

		/**
		 * Coordinated Universal Time (UTC) offset or IANA time zone used to convert
		 * <code>date</code> values in the query to UTC.
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
		 * Builds a {@link RangeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RangeQuery build() {
			_checkSingleUse();

			return new RangeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RangeQuery}
	 */
	public static final JsonpDeserializer<RangeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RangeQuery::setupRangeQueryDeserializer);

	protected static void setupRangeQueryDeserializer(ObjectDeserializer<RangeQuery.Builder> op) {
		RangeQueryBase.setupRangeQueryBaseDeserializer(op);
		op.add(Builder::gt, JsonData._DESERIALIZER, "gt");
		op.add(Builder::gte, JsonData._DESERIALIZER, "gte");
		op.add(Builder::lt, JsonData._DESERIALIZER, "lt");
		op.add(Builder::lte, JsonData._DESERIALIZER, "lte");
		op.add(Builder::from, JsonpDeserializer.stringDeserializer(), "from");
		op.add(Builder::to, JsonpDeserializer.stringDeserializer(), "to");
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}
