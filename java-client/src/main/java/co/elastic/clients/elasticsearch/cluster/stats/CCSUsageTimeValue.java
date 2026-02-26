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

package co.elastic.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.CCSUsageTimeValue

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.CCSUsageTimeValue">API
 *      specification</a>
 */
@JsonpDeserializable
public class CCSUsageTimeValue implements JsonpSerializable {
	private final long max;

	private final long avg;

	private final long p90;

	// ---------------------------------------------------------------------------------------------

	private CCSUsageTimeValue(Builder builder) {

		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max", 0);
		this.avg = ApiTypeHelper.requireNonNull(builder.avg, this, "avg", 0);
		this.p90 = ApiTypeHelper.requireNonNull(builder.p90, this, "p90", 0);

	}

	public static CCSUsageTimeValue of(Function<Builder, ObjectBuilder<CCSUsageTimeValue>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The maximum time taken to execute a request, in milliseconds.
	 * <p>
	 * API name: {@code max}
	 */
	public final long max() {
		return this.max;
	}

	/**
	 * Required - The average time taken to execute a request, in milliseconds.
	 * <p>
	 * API name: {@code avg}
	 */
	public final long avg() {
		return this.avg;
	}

	/**
	 * Required - The 90th percentile of the time taken to execute requests, in
	 * milliseconds.
	 * <p>
	 * API name: {@code p90}
	 */
	public final long p90() {
		return this.p90;
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

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("avg");
		generator.write(this.avg);

		generator.writeKey("p90");
		generator.write(this.p90);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link CCSUsageTimeValue}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<CCSUsageTimeValue> {
		private Long max;

		private Long avg;

		private Long p90;

		public Builder() {
		}
		private Builder(CCSUsageTimeValue instance) {
			this.max = instance.max;
			this.avg = instance.avg;
			this.p90 = instance.p90;

		}
		/**
		 * Required - The maximum time taken to execute a request, in milliseconds.
		 * <p>
		 * API name: {@code max}
		 */
		public final Builder max(long value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - The average time taken to execute a request, in milliseconds.
		 * <p>
		 * API name: {@code avg}
		 */
		public final Builder avg(long value) {
			this.avg = value;
			return this;
		}

		/**
		 * Required - The 90th percentile of the time taken to execute requests, in
		 * milliseconds.
		 * <p>
		 * API name: {@code p90}
		 */
		public final Builder p90(long value) {
			this.p90 = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link CCSUsageTimeValue}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public CCSUsageTimeValue build() {
			_checkSingleUse();

			return new CCSUsageTimeValue(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link CCSUsageTimeValue}
	 */
	public static final JsonpDeserializer<CCSUsageTimeValue> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, CCSUsageTimeValue::setupCCSUsageTimeValueDeserializer);

	protected static void setupCCSUsageTimeValueDeserializer(ObjectDeserializer<CCSUsageTimeValue.Builder> op) {

		op.add(Builder::max, JsonpDeserializer.longDeserializer(), "max");
		op.add(Builder::avg, JsonpDeserializer.longDeserializer(), "avg");
		op.add(Builder::p90, JsonpDeserializer.longDeserializer(), "p90");

	}

}
