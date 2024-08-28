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

package co.elastic.clients.elasticsearch._types.query_dsl;

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

// typedef: _types.query_dsl.DateRangeQuery

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.query_dsl.DateRangeQuery">API
 *      specification</a>
 */
@JsonpDeserializable
public class DateRangeQuery extends RangeQueryBase<String> implements RangeQueryVariant {
	// Single key dictionary
	private final String field;

	@Nullable
	private final String format;

	@Nullable
	private final String timeZone;

	// ---------------------------------------------------------------------------------------------

	private DateRangeQuery(Builder builder) {
		super(builder);
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");

		this.format = builder.format;
		this.timeZone = builder.timeZone;

	}

	public static DateRangeQuery of(Function<Builder, ObjectBuilder<DateRangeQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * RangeQuery variant kind.
	 */
	@Override
	public RangeQuery.Kind _rangeQueryKind() {
		return RangeQuery.Kind.Date;
	}

	/**
	 * Required - the required field
	 */
	public final String field() {
		return this.field;
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
	 * Builder for {@link DateRangeQuery}.
	 */

	public static class Builder extends RangeQueryBase.AbstractBuilder<String, Builder>
			implements
				ObjectBuilder<DateRangeQuery> {
		private String field;

		/**
		 * Required - the required field
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		@Nullable
		private String format;

		@Nullable
		private String timeZone;

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
		 * Builds a {@link DateRangeQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DateRangeQuery build() {
			_checkSingleUse();
			super.tSerializer(null);

			return new DateRangeQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DateRangeQuery}
	 */
	public static final JsonpDeserializer<DateRangeQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DateRangeQuery::setupDateRangeQueryDeserializer);

	protected static void setupDateRangeQueryDeserializer(ObjectDeserializer<DateRangeQuery.Builder> op) {
		RangeQueryBase.setupRangeQueryBaseDeserializer(op, JsonpDeserializer.stringDeserializer());
		op.add(Builder::format, JsonpDeserializer.stringDeserializer(), "format");
		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");

		op.setKey(Builder::field, JsonpDeserializer.stringDeserializer());

	}

}
