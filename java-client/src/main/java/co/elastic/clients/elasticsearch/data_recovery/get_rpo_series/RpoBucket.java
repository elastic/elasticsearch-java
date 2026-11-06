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

package co.elastic.clients.elasticsearch.data_recovery.get_rpo_series;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
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

// typedef: data_recovery.get_rpo_series.RpoBucket

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#data_recovery.get_rpo_series.RpoBucket">API
 *      specification</a>
 */
@JsonpDeserializable
public class RpoBucket implements JsonpSerializable {
	private final DateTime start;

	private final DateTime end;

	@Nullable
	private final Long maxRecoveryPointAgeMillis;

	// ---------------------------------------------------------------------------------------------

	private RpoBucket(Builder builder) {

		this.start = ApiTypeHelper.requireNonNull(builder.start, this, "start");
		this.end = ApiTypeHelper.requireNonNull(builder.end, this, "end");
		this.maxRecoveryPointAgeMillis = builder.maxRecoveryPointAgeMillis;

	}

	public static RpoBucket of(Function<Builder, ObjectBuilder<RpoBucket>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The inclusive start of the bucket.
	 * <p>
	 * API name: {@code start}
	 */
	public final DateTime start() {
		return this.start;
	}

	/**
	 * Required - The exclusive end of the bucket. The last bucket is clipped to the
	 * end of the range.
	 * <p>
	 * API name: {@code end}
	 */
	public final DateTime end() {
		return this.end;
	}

	/**
	 * The greatest age, in milliseconds, that the newest recoverable state reached
	 * during the bucket. It is <code>null</code> if no retained recovery point
	 * covers the start of the bucket or the bucket starts in the future.
	 * <p>
	 * API name: {@code max_recovery_point_age_millis}
	 */
	@Nullable
	public final Long maxRecoveryPointAgeMillis() {
		return this.maxRecoveryPointAgeMillis;
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

		generator.writeKey("start");
		this.start.serialize(generator, mapper);
		generator.writeKey("end");
		this.end.serialize(generator, mapper);
		if (this.maxRecoveryPointAgeMillis != null) {
			generator.writeKey("max_recovery_point_age_millis");
			generator.write(this.maxRecoveryPointAgeMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RpoBucket}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RpoBucket> {
		private DateTime start;

		private DateTime end;

		@Nullable
		private Long maxRecoveryPointAgeMillis;

		public Builder() {
		}
		private Builder(RpoBucket instance) {
			this.start = instance.start;
			this.end = instance.end;
			this.maxRecoveryPointAgeMillis = instance.maxRecoveryPointAgeMillis;

		}
		/**
		 * Required - The inclusive start of the bucket.
		 * <p>
		 * API name: {@code start}
		 */
		public final Builder start(DateTime value) {
			this.start = value;
			return this;
		}

		/**
		 * Required - The exclusive end of the bucket. The last bucket is clipped to the
		 * end of the range.
		 * <p>
		 * API name: {@code end}
		 */
		public final Builder end(DateTime value) {
			this.end = value;
			return this;
		}

		/**
		 * The greatest age, in milliseconds, that the newest recoverable state reached
		 * during the bucket. It is <code>null</code> if no retained recovery point
		 * covers the start of the bucket or the bucket starts in the future.
		 * <p>
		 * API name: {@code max_recovery_point_age_millis}
		 */
		public final Builder maxRecoveryPointAgeMillis(@Nullable Long value) {
			this.maxRecoveryPointAgeMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RpoBucket}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RpoBucket build() {
			_checkSingleUse();

			return new RpoBucket(this);
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
	 * Json deserializer for {@link RpoBucket}
	 */
	public static final JsonpDeserializer<RpoBucket> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RpoBucket::setupRpoBucketDeserializer);

	protected static void setupRpoBucketDeserializer(ObjectDeserializer<RpoBucket.Builder> op) {

		op.add(Builder::start, DateTime._DESERIALIZER, "start");
		op.add(Builder::end, DateTime._DESERIALIZER, "end");
		op.add(Builder::maxRecoveryPointAgeMillis, JsonpDeserializer.longDeserializer(),
				"max_recovery_point_age_millis");

	}

}
