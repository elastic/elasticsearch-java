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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.flush_job.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#ml.flush_job.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class FlushJobResponse implements JsonpSerializable {
	private final boolean flushed;

	@Nullable
	private final Integer lastFinalizedBucketEnd;

	// ---------------------------------------------------------------------------------------------

	private FlushJobResponse(Builder builder) {

		this.flushed = ApiTypeHelper.requireNonNull(builder.flushed, this, "flushed");
		this.lastFinalizedBucketEnd = builder.lastFinalizedBucketEnd;

	}

	public static FlushJobResponse of(Function<Builder, ObjectBuilder<FlushJobResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code flushed}
	 */
	public final boolean flushed() {
		return this.flushed;
	}

	/**
	 * Provides the timestamp (in milliseconds since the epoch) of the end of the
	 * last bucket that was processed.
	 * <p>
	 * API name: {@code last_finalized_bucket_end}
	 */
	@Nullable
	public final Integer lastFinalizedBucketEnd() {
		return this.lastFinalizedBucketEnd;
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

		generator.writeKey("flushed");
		generator.write(this.flushed);

		if (this.lastFinalizedBucketEnd != null) {
			generator.writeKey("last_finalized_bucket_end");
			generator.write(this.lastFinalizedBucketEnd);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FlushJobResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<FlushJobResponse> {
		private Boolean flushed;

		@Nullable
		private Integer lastFinalizedBucketEnd;

		/**
		 * Required - API name: {@code flushed}
		 */
		public final Builder flushed(boolean value) {
			this.flushed = value;
			return this;
		}

		/**
		 * Provides the timestamp (in milliseconds since the epoch) of the end of the
		 * last bucket that was processed.
		 * <p>
		 * API name: {@code last_finalized_bucket_end}
		 */
		public final Builder lastFinalizedBucketEnd(@Nullable Integer value) {
			this.lastFinalizedBucketEnd = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FlushJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FlushJobResponse build() {
			_checkSingleUse();

			return new FlushJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FlushJobResponse}
	 */
	public static final JsonpDeserializer<FlushJobResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			FlushJobResponse::setupFlushJobResponseDeserializer);

	protected static void setupFlushJobResponseDeserializer(ObjectDeserializer<FlushJobResponse.Builder> op) {

		op.add(Builder::flushed, JsonpDeserializer.booleanDeserializer(), "flushed");
		op.add(Builder::lastFinalizedBucketEnd, JsonpDeserializer.integerDeserializer(), "last_finalized_bucket_end");

	}

}
