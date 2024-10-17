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

package co.elastic.clients.elasticsearch.nodes;

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

// typedef: nodes._types.TimeHttpHistogram

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.TimeHttpHistogram">API
 *      specification</a>
 */
@JsonpDeserializable
public class TimeHttpHistogram implements JsonpSerializable {
	private final long count;

	@Nullable
	private final Long geMillis;

	@Nullable
	private final Long ltMillis;

	// ---------------------------------------------------------------------------------------------

	private TimeHttpHistogram(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.geMillis = builder.geMillis;
		this.ltMillis = builder.ltMillis;

	}

	public static TimeHttpHistogram of(Function<Builder, ObjectBuilder<TimeHttpHistogram>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * API name: {@code ge_millis}
	 */
	@Nullable
	public final Long geMillis() {
		return this.geMillis;
	}

	/**
	 * API name: {@code lt_millis}
	 */
	@Nullable
	public final Long ltMillis() {
		return this.ltMillis;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (this.geMillis != null) {
			generator.writeKey("ge_millis");
			generator.write(this.geMillis);

		}
		if (this.ltMillis != null) {
			generator.writeKey("lt_millis");
			generator.write(this.ltMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TimeHttpHistogram}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TimeHttpHistogram> {
		private Long count;

		@Nullable
		private Long geMillis;

		@Nullable
		private Long ltMillis;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code ge_millis}
		 */
		public final Builder geMillis(@Nullable Long value) {
			this.geMillis = value;
			return this;
		}

		/**
		 * API name: {@code lt_millis}
		 */
		public final Builder ltMillis(@Nullable Long value) {
			this.ltMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TimeHttpHistogram}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TimeHttpHistogram build() {
			_checkSingleUse();

			return new TimeHttpHistogram(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TimeHttpHistogram}
	 */
	public static final JsonpDeserializer<TimeHttpHistogram> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TimeHttpHistogram::setupTimeHttpHistogramDeserializer);

	protected static void setupTimeHttpHistogramDeserializer(ObjectDeserializer<TimeHttpHistogram.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::geMillis, JsonpDeserializer.longDeserializer(), "ge_millis");
		op.add(Builder::ltMillis, JsonpDeserializer.longDeserializer(), "lt_millis");

	}

}
