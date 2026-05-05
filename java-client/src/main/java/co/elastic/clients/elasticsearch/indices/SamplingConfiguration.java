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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
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

// typedef: indices._types.SamplingConfiguration

/**
 * Sampling configuration as returned by the API.
 * 
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.SamplingConfiguration">API
 *      specification</a>
 */
@JsonpDeserializable
public class SamplingConfiguration implements JsonpSerializable {
	private final double rate;

	private final int maxSamples;

	@Nullable
	private final String maxSize;

	private final long maxSizeInBytes;

	@Nullable
	private final Time timeToLive;

	private final long timeToLiveInMillis;

	@Nullable
	private final String if_;

	@Nullable
	private final DateTime creationTime;

	private final long creationTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	private SamplingConfiguration(Builder builder) {

		this.rate = ApiTypeHelper.requireNonNull(builder.rate, this, "rate", 0);
		this.maxSamples = ApiTypeHelper.requireNonNull(builder.maxSamples, this, "maxSamples", 0);
		this.maxSize = builder.maxSize;
		this.maxSizeInBytes = ApiTypeHelper.requireNonNull(builder.maxSizeInBytes, this, "maxSizeInBytes", 0);
		this.timeToLive = builder.timeToLive;
		this.timeToLiveInMillis = ApiTypeHelper.requireNonNull(builder.timeToLiveInMillis, this, "timeToLiveInMillis",
				0);
		this.if_ = builder.if_;
		this.creationTime = builder.creationTime;
		this.creationTimeInMillis = ApiTypeHelper.requireNonNull(builder.creationTimeInMillis, this,
				"creationTimeInMillis", 0);

	}

	public static SamplingConfiguration of(Function<Builder, ObjectBuilder<SamplingConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The fraction of documents to sample between 0 and 1.
	 * <p>
	 * API name: {@code rate}
	 */
	public final double rate() {
		return this.rate;
	}

	/**
	 * Required - The maximum number of documents to sample.
	 * <p>
	 * API name: {@code max_samples}
	 */
	public final int maxSamples() {
		return this.maxSamples;
	}

	/**
	 * The maximum total size of sampled documents.
	 * <p>
	 * API name: {@code max_size}
	 */
	@Nullable
	public final String maxSize() {
		return this.maxSize;
	}

	/**
	 * Required - The maximum total size of sampled documents in bytes.
	 * <p>
	 * API name: {@code max_size_in_bytes}
	 */
	public final long maxSizeInBytes() {
		return this.maxSizeInBytes;
	}

	/**
	 * The duration for which the sampled documents should be retained.
	 * <p>
	 * API name: {@code time_to_live}
	 */
	@Nullable
	public final Time timeToLive() {
		return this.timeToLive;
	}

	/**
	 * Required - The duration for which the sampled documents should be retained,
	 * in milliseconds.
	 * <p>
	 * API name: {@code time_to_live_in_millis}
	 */
	public final long timeToLiveInMillis() {
		return this.timeToLiveInMillis;
	}

	/**
	 * An optional condition script that sampled documents must satisfy.
	 * <p>
	 * API name: {@code if}
	 */
	@Nullable
	public final String if_() {
		return this.if_;
	}

	/**
	 * The time when the sampling configuration was created.
	 * <p>
	 * API name: {@code creation_time}
	 */
	@Nullable
	public final DateTime creationTime() {
		return this.creationTime;
	}

	/**
	 * Required - The time when the sampling configuration was created, in
	 * milliseconds since epoch.
	 * <p>
	 * API name: {@code creation_time_in_millis}
	 */
	public final long creationTimeInMillis() {
		return this.creationTimeInMillis;
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

		generator.writeKey("rate");
		generator.write(this.rate);

		generator.writeKey("max_samples");
		generator.write(this.maxSamples);

		if (this.maxSize != null) {
			generator.writeKey("max_size");
			generator.write(this.maxSize);

		}
		generator.writeKey("max_size_in_bytes");
		generator.write(this.maxSizeInBytes);

		if (this.timeToLive != null) {
			generator.writeKey("time_to_live");
			this.timeToLive.serialize(generator, mapper);

		}
		generator.writeKey("time_to_live_in_millis");
		generator.write(this.timeToLiveInMillis);

		if (this.if_ != null) {
			generator.writeKey("if");
			generator.write(this.if_);

		}
		if (this.creationTime != null) {
			generator.writeKey("creation_time");
			this.creationTime.serialize(generator, mapper);
		}
		generator.writeKey("creation_time_in_millis");
		generator.write(this.creationTimeInMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SamplingConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SamplingConfiguration> {
		private Double rate;

		private Integer maxSamples;

		@Nullable
		private String maxSize;

		private Long maxSizeInBytes;

		@Nullable
		private Time timeToLive;

		private Long timeToLiveInMillis;

		@Nullable
		private String if_;

		@Nullable
		private DateTime creationTime;

		private Long creationTimeInMillis;

		public Builder() {
		}
		private Builder(SamplingConfiguration instance) {
			this.rate = instance.rate;
			this.maxSamples = instance.maxSamples;
			this.maxSize = instance.maxSize;
			this.maxSizeInBytes = instance.maxSizeInBytes;
			this.timeToLive = instance.timeToLive;
			this.timeToLiveInMillis = instance.timeToLiveInMillis;
			this.if_ = instance.if_;
			this.creationTime = instance.creationTime;
			this.creationTimeInMillis = instance.creationTimeInMillis;

		}
		/**
		 * Required - The fraction of documents to sample between 0 and 1.
		 * <p>
		 * API name: {@code rate}
		 */
		public final Builder rate(double value) {
			this.rate = value;
			return this;
		}

		/**
		 * Required - The maximum number of documents to sample.
		 * <p>
		 * API name: {@code max_samples}
		 */
		public final Builder maxSamples(int value) {
			this.maxSamples = value;
			return this;
		}

		/**
		 * The maximum total size of sampled documents.
		 * <p>
		 * API name: {@code max_size}
		 */
		public final Builder maxSize(@Nullable String value) {
			this.maxSize = value;
			return this;
		}

		/**
		 * Required - The maximum total size of sampled documents in bytes.
		 * <p>
		 * API name: {@code max_size_in_bytes}
		 */
		public final Builder maxSizeInBytes(long value) {
			this.maxSizeInBytes = value;
			return this;
		}

		/**
		 * The duration for which the sampled documents should be retained.
		 * <p>
		 * API name: {@code time_to_live}
		 */
		public final Builder timeToLive(@Nullable Time value) {
			this.timeToLive = value;
			return this;
		}

		/**
		 * The duration for which the sampled documents should be retained.
		 * <p>
		 * API name: {@code time_to_live}
		 */
		public final Builder timeToLive(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeToLive(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The duration for which the sampled documents should be retained,
		 * in milliseconds.
		 * <p>
		 * API name: {@code time_to_live_in_millis}
		 */
		public final Builder timeToLiveInMillis(long value) {
			this.timeToLiveInMillis = value;
			return this;
		}

		/**
		 * An optional condition script that sampled documents must satisfy.
		 * <p>
		 * API name: {@code if}
		 */
		public final Builder if_(@Nullable String value) {
			this.if_ = value;
			return this;
		}

		/**
		 * The time when the sampling configuration was created.
		 * <p>
		 * API name: {@code creation_time}
		 */
		public final Builder creationTime(@Nullable DateTime value) {
			this.creationTime = value;
			return this;
		}

		/**
		 * Required - The time when the sampling configuration was created, in
		 * milliseconds since epoch.
		 * <p>
		 * API name: {@code creation_time_in_millis}
		 */
		public final Builder creationTimeInMillis(long value) {
			this.creationTimeInMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SamplingConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SamplingConfiguration build() {
			_checkSingleUse();

			return new SamplingConfiguration(this);
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
	 * Json deserializer for {@link SamplingConfiguration}
	 */
	public static final JsonpDeserializer<SamplingConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SamplingConfiguration::setupSamplingConfigurationDeserializer);

	protected static void setupSamplingConfigurationDeserializer(ObjectDeserializer<SamplingConfiguration.Builder> op) {

		op.add(Builder::rate, JsonpDeserializer.doubleDeserializer(), "rate");
		op.add(Builder::maxSamples, JsonpDeserializer.integerDeserializer(), "max_samples");
		op.add(Builder::maxSize, JsonpDeserializer.stringDeserializer(), "max_size");
		op.add(Builder::maxSizeInBytes, JsonpDeserializer.longDeserializer(), "max_size_in_bytes");
		op.add(Builder::timeToLive, Time._DESERIALIZER, "time_to_live");
		op.add(Builder::timeToLiveInMillis, JsonpDeserializer.longDeserializer(), "time_to_live_in_millis");
		op.add(Builder::if_, JsonpDeserializer.stringDeserializer(), "if");
		op.add(Builder::creationTime, DateTime._DESERIALIZER, "creation_time");
		op.add(Builder::creationTimeInMillis, JsonpDeserializer.longDeserializer(), "creation_time_in_millis");

	}

}
